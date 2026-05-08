package Ejercicio;
import java.util.*;
public class Biblioteca {
	// Clase Interna HORARIO
    public class Horario {
        private String dias, apertura, cierre;
        public Horario(String d, String a, String c) {
            this.dias = d; this.apertura = a; this.cierre = c;
        }
        public void mostrarHorario() {
            System.out.println("Horario: " + dias + " de " + apertura + " a " + cierre);
        }
    }
    
    
	private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre, String dias, String open, String close) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario(dias, open, close);
    }

    public void agregarLibro(Libro l) { 
    	libros.add(l); 
    }
    public void agregarAutor(Autor a) {
    	autores.add(a); 
    }

    public void prestarLibro(Estudiante e, Libro l) {
    	boolean existe = false;
    	for (Libro L : libros) {
    		if (L == l) {
    			existe = true;
    			if (L.getEstado() == false) {
    				L.setEstado(true);
    				Prestamo p = new Prestamo(e, l);
    		        prestamos.add(p);
    		        System.out.println("Préstamo registrado con éxito.");
    		        return;
    			}
    		}
    	}
    	
    	if (existe == true) {
    		System.out.println("El libro "+l.getTitulo()+" no está disponible");
    	}else {
    		System.out.println("El libro "+l.getTitulo()+" no existe en esta biblioteca");
    	}
        
    }

    public void cerrarBiblioteca() {
        System.out.println("Cerrando la biblioteca " + nombre + "...");
        this.prestamos.clear();
        System.out.println("Todos los préstamos activos han sido finalizados.");
    }

    public void mostrarEstado() {
        System.out.println("\n=== ESTADO DE LA " + nombre.toUpperCase() + " ===");
        horario.mostrarHorario();
        System.out.println("Libros disponibles: " + libros.size());
        System.out.println("Préstamos activos: " + prestamos.size());
    }
}
