package Ejercicio2;
import java.util.Random;
public class Juego {
	//a) Atributos
	private int numeroDeVidas;
	private int numVidasReserva;
	private int record;
	
	public Juego() {
		this.numeroDeVidas = 1;
		this.record = 0;
		this.numVidasReserva = this.numeroDeVidas;

	}
	
	public Juego(int numeroDeVidas) {
		this.numeroDeVidas = numeroDeVidas;
		this.record = 0;
		this.numVidasReserva = this.numeroDeVidas;
	}
	
	//b) Reiniciar Partida
	public void reiniciaPartida() {
		this.numeroDeVidas = this.numVidasReserva;
		this.record = 0;
	}
	
	//c) Actualizar Record.
	public void actualizaRecord() {
		int rec = this.numVidasReserva - this.numeroDeVidas + 1;
		if (rec < this.record) {
			this.record = rec;
		}
	}
	
	//d) Quitar Vida
	public boolean quitaVida() {
		this.numeroDeVidas -= 1;
		if (this.numeroDeVidas > 0) {
			return true;
		}
		return false;
	}
}
