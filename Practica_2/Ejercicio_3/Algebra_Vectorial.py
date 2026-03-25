import math
from multimethod import multimethod
class Algebra_vectorial:
    def __init__(self, x=0, y=0, z=0):
        self.__x = x
        self.__y = y
        self.__z = z

    def getX(self):
        return self.__x

    def getY(self):
        return self.__y

    def getZ(self):
        return self.__z

    # a) Suma: c = a + b
    def __add__(self, b: 'Algebra_vectorial'):
        return Algebra_vectorial(self.__x + b.getX(), self.__y + b.getY(), self.__z + b.getZ())

    #b) Multiplicación por escalar: b = ra
    @multimethod
    def __mul__(self, r = float):
        return Algebra_vectorial(r * self.__x, r * self.__y, r * self.__z)

    # c) Longitud magnitud: |a|
    def magnitud(self):
        return math.sqrt(self.__x ** 2 + self.__y ** 2 + self.__z ** 2)

    # d) Normal: b = a/|a|
    def __truediv__(self, b: 'Algebra_vectorial'):
        m = self.magnitud()
        if (m == 0): return Algebra_vectorial()
        return Algebra_vectorial(self.__x / m, self.__y / m, self.__z / m)

    # e) Producto escalar: a * b
    @multimethod
    def __mul__(self, b: 'Algebra_vectorial'):
        return (self.__x * b.getX()) + (self.__y * b.getY()) + (self.__z * b.getZ())

    # f) Producto vectorial cruz: a x b
    def  __pow__(self, b: 'Algebra_vectorial'):
        cx = self.__y * b.getZ() - self.__z * b.getY()
        cy = self.__z * b.getX() - self.__x * b.getZ()
        cz = self.__x * b.getY() - self.__y * b.getX()
        return Algebra_vectorial(cx, cy, cz)

    def __str__(self):
        return f'({self.__x}, {self.__y}, {self.__z})'

a = Algebra_vectorial(1,0,0)
b = Algebra_vectorial(0,1,0)
# a) Suma: c = a + b
print("Suma (a + b): ", a + b);
# b) Multiplicación por escalar: b = ra
print("Escalar (a * 5): ", a * 5.0)
# c) Longitud magnitud: |a|
print("Longitud (|a|): ", a.magnitud())
# d) Normal: b = a/|a|
print("Normal (a/|a|): ", a / a)
# e) Producto escalar: a * b
print("Punto (a * b): ", a * b)
# f) Producto vectorial cruz: a x b
print("Cruz (a x b): ", a ** b)
