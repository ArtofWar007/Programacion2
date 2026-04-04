package Ejercicio2;

public class Aplicacion {
	public static void main(String[] args) {
		
		JuegoAdivinaNumero J1 = new JuegoAdivinaNumero(3);
		JuegoAdivinaPar J2 = new JuegoAdivinaPar(3);
		JuegoAdivinaImpar J3 = new JuegoAdivinaImpar(3);
		
		System.out.println("JUEGO ADIVINAR NUMERO");
		J1.juega();
		System.out.println("\nJUEGO ADIVINAR NUMERO PAR");
		J2.juega();
		System.out.println("\nJUEGO ADIVINAR NUMERO IMPAR");
		J3.juega();
	}
	
}
