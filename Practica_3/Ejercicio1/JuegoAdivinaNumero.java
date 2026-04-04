package Ejercicio1;
import java.util.Random;
import java.util.Scanner;

//a) Deriva Clase Juego
public class JuegoAdivinaNumero extends Juego{
	//b) Atributo
	private int numeroAAdivinar;
	
	//c) Constructor
	public JuegoAdivinaNumero(int numeroDeVidas) {
		super(numeroDeVidas);
	}
	
	public int generaNumer() {
		return new Random().nextInt(0, 11);
	}
	//d) metodo juega
	public void juega() {
		//1) reinicia Partida
		this.reiniciaPartida();
		Scanner sc = new Scanner(System.in);
		//2) genera numero aleatorio
		this.numeroAAdivinar = generaNumer();
		//3) mensaje
		System.out.println("¡ADIVINA EL NUMERO DEL 0 AL 10!");
		
		while (true) {
			int num = sc.nextInt();
			if (this.numeroAAdivinar == num) {
				System.out.println("ACERTASTE!!!");
				this.actualizaRecord();
				return;
			}
			else if (this.quitaVida() == true) {
				if (this.numeroAAdivinar > num) { System.out.println("El numero a adivinar es mayor que "+num); }
				else { System.out.println("El numero a adivinar es menor que "+num); }
				System.out.println("intentalo de nuevo");
			}
			else {System.out.println("Perdiste"); return;}
		}
	}
	
}
