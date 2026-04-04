package Ejercicio2;
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
	
	public boolean validaNumero(int num) {
		if (0 <= num && num <= 10) {
			return true;
		}
		return false;
	}
	
	public int generaNumer() {
		return new Random().nextInt(0, 11);
	}
	
	public void juega() {
		super.reiniciaPartida();
		Scanner sc = new Scanner(System.in);;
		this.numeroAAdivinar = generaNumer();
		System.out.println("¡ADIVINA EL NUMERO DEL 0 AL 10!");
		
		while (true) {
			int num = sc.nextInt();
			if (!this.validaNumero(num)) {
				System.out.println("Numero no valido");
				continue;
			}
			if (this.numeroAAdivinar == num) {
				System.out.println("ACERTASTE!!!");
				super.actualizaRecord();
				return;
			}
			else if (super.quitaVida() == true) {
				if (this.numeroAAdivinar > num) { System.out.println("El numero a adivinar es mayor que "+num); }
				else { System.out.println("El numero a adivinar es menor que "+num); }
				System.out.println("intentalo de nuevo");
			}
			else {System.out.println("Perdiste"); return;}
		}
	}
	
}
