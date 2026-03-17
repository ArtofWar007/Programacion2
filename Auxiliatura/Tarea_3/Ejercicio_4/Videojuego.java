package Ejercicio_4;

public class Videojuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public Videojuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }

    public Videojuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        if (cantidadJugadores >= 0) {
        	this.cantidadJugadores = cantidadJugadores;
        }else {
        	this.cantidadJugadores = 0;
        }
    }

    public void agregarJugadores() {
        this.cantidadJugadores++;
        System.out.println("Se agregó 1 jugador. Total: " + this.cantidadJugadores);
    }

    public void agregarJugadores(int cantidad) {
        if (cantidad > 0) {
            this.cantidadJugadores += cantidad;
            System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + this.cantidadJugadores);
        }
    }

    @Override
    public String toString() {
        return String.format("Videojuego: %s [%s] - Jugadores: %d", nombre, plataforma, cantidadJugadores);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getCantidadJugadores() {
		return cantidadJugadores;
	}
    
    
    
}