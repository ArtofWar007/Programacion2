package Ejercicio;

public class Prestamo {
	private String fecha;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.fecha = "11/5/26";
        this.estudiante = estudiante;
        this.libro = libro;
    }

    public void mostrarInfo() {
        System.out.print("PRÉSTAMO: ");
        estudiante.mostrarInfo();
        System.out.println("Libro prestado: " + libro.getTitulo());
    }
}
