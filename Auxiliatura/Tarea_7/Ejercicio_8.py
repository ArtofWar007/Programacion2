class SueldoInvalidoException(Exception):
    def __init__(self):
        super().__init__("Sueldo insuficiente. Se le asignará el sueldo minimo 2,500 BS")

class CargoInvalidoException(Exception):
    def __init__(self):
        super().__init__("El cargo no debe contener numeros. Intente de nuevo")

class Empleado:
    def __init__(self, nombre, cargo, sueldo):
        self.__nombre = nombre
        self.__cargo = cargo
        self.__sueldo = sueldo

    def __str__(self):
        return f"Empleado: {self.__nombre}\t{self.__cargo} Bs.\t{self.__sueldo}"

class Empresa:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__empleados = []

    def registrarEmpleado(self):
        nom = input("Nombre: ")
        sueldo = int(input("Sueldo: "))
        try:
            if (sueldo < 2500):
                sueldo = 2500
                raise SueldoInvalidoException()
        except SueldoInvalidoException as s:
            print(s)

        while True:
            cargo = input("Cargo: ")
            try:
                for i in cargo:
                    if i in "0123456789":
                        raise CargoInvalidoException()
                break
            except CargoInvalidoException as c:
                print(c)

        Em = Empleado(nom, sueldo, cargo)
        self.__empleados.append(Em)
    def mostrar(self):
        print(f"============= {self.__nombre} =============")
        for i in self.__empleados:
            print(f"\t{i}")

class Main():
    E = Empresa("Empresa 1")
    E.registrarEmpleado()
    E.registrarEmpleado()
    E.mostrar()

