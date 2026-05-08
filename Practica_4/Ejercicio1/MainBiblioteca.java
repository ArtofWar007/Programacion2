package Ejercicio;

public class MainBiblioteca {
    public static void main(String[] args) {
    	
        Biblioteca umsaLib = new Biblioteca("Biblioteca Central UMSA", "Lunes a Viernes", "08:00", "19:00");

        Autor gabriel = new Autor("Gabriel García Márquez", "Colombiano");
        Autor allende = new Autor("Isabel Allende", "Chilena");
        Autor vargas = new Autor("Mario Vargas Llosa", "Peruano");
        Autor borges = new Autor("Jorge Luis Borges", "Argentino");

        umsaLib.agregarAutor(gabriel);
        umsaLib.agregarAutor(allende);
        umsaLib.agregarAutor(vargas);
        umsaLib.agregarAutor(borges);

  
        String[] pagsCien = {
            "Narra la historia de siete generaciones de la familia Buendía en Macondo.",
            "La obra destaca por su estructura circular, donde el tiempo parece repetirse."
        };
        Libro libro1 = new Libro("Cien años de soledad", "978-84-9759-220-8", pagsCien);

        String[] pagsCasa = {
            "Narra cuatro generaciones de la familia Trueba entre cambios políticos.",
            "La novela utiliza las voces de Clara y Alba para entrelazar lo espiritual con la realidad."
        };
        Libro libro2 = new Libro("La casa de los espíritus", "978-84-663-6791-2", pagsCasa);

        String[] pagsFiesta = {
            "Recrea los últimos días de la dictadura de Trujillo en República Dominicana.",
            "Alterna entre la perspectiva de una mujer y los últimos momentos del dictador."
        };
        Libro libro3 = new Libro("La fiesta del Chivo", "978-84-204-4169-6", pagsFiesta);

        String[] pagsAleph = {
            "Cuentos que abordan temas como el tiempo, la inmortalidad y puntos infinitos.",
            "El Aleph intenta describir el punto que contiene a todos los puntos del universo."
        };
        Libro libro4 = new Libro("El Aleph", "978-84-206-3311-4", pagsAleph);
        

        umsaLib.agregarLibro(libro1);
        umsaLib.agregarLibro(libro2);
        umsaLib.agregarLibro(libro3);
        umsaLib.agregarLibro(libro4);

        Estudiante est1 = new Estudiante("2026-UMSA", "Juan Pérez");
        
        System.out.println("\n--- Iniciando Pruebas ---");
        umsaLib.prestarLibro(est1, libro1);
        umsaLib.prestarLibro(est1, libro4);

        System.out.println("\n--- Demostración de Lectura ---");
        libro1.leer();

        umsaLib.mostrarEstado();

        umsaLib.cerrarBiblioteca();
        umsaLib.mostrarEstado();
    }
}