package Ejercicio;
import java.util.ArrayList;
import java.util.List;
public class Libro {
	
    // Clase Interna PAGINA
    public class Pagina {
        private int numero;
        private String contenido;

        public Pagina(int numero, String contenido) {
            this.numero = numero;
            this.contenido = contenido;
        }

        public void mostrarPagina() {
            System.out.println("Pág " + numero + ": " + contenido);
        }
    }
    
    
	private String titulo;
    private String isbn;
    private List<Pagina> paginas;
    private boolean estado;

    public Libro(String titulo, String isbn, String[] contenidoPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
        for (int i = 0; i < contenidoPaginas.length; i++) {
            this.paginas.add(new Pagina(i + 1, contenidoPaginas[i]));
        }
        this.estado = false;
    }

    public boolean getEstado() {
    	return estado;
    }
    
    public void setEstado(boolean estado) {
    	this.estado = estado;
    }
    
    public String getTitulo() { 
    	return titulo; 
    }

    public void leer() {
        System.out.println("Leyendo: " + titulo);
        for (Pagina p : paginas) p.mostrarPagina();
    }
}
