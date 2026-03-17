package Ejercicio_5;

public class Aula {
	private String nombre;
	private int piso;
	private String[][] estudiantes;
	
	public Aula(String nombre, int piso,String[][] estudiantes) {
		this.nombre = nombre;
		this.piso = piso;
		this.estudiantes = estudiantes;
	}
	
	public void mostrar() {
        System.out.println("=== DATOS DEL AULA ===");
        System.out.println("Aula: " + this.nombre);
        System.out.println("Piso: " + this.piso);
        System.out.println("Cantidad de estudiantes: " + estudiantes.length);
    }
	
	public void mostrar(boolean detallado) {
		if (!detallado) {
            this.mostrar();
            return;
        }

        System.out.println("=== LISTA DE CALIFICACIONES ===");
        for (int i = 0; i < estudiantes.length; i++) {
        	if (estudiantes[i][0] == null) {
        		continue;
        	}
        	
            String nombre = estudiantes[i][0];
            String nota = estudiantes[i][1];
            String estado;
            if (Double.parseDouble(nota) >= 51) {
            	estado = "APROBADO";
            }
            else {
            	estado = "REPROBADO";
            }
            System.out.println("Estudiante: " + nombre + " | Nota: " + nota + " | Estado: " + estado);
        }
    }
}
