package Ejercicio_1;

public class MainMiPunto {
	public static void main(String[] args) {
		// Constructor sin argumentos
		MiPunto P1 = new MiPunto();
		
		// Cosntructor con argumentos
		MiPunto P2 = new MiPunto(10, 30.5);
		
		// Distancia entre P1 y P2
		System.out.println("Distancia entre " + P1 + " y " + P2 +":   " + P1.distancia(P2));
		
		// Distancia entre P1 y (10, 9) (con argumentos)
		System.out.println("Distancia entre " + P1 + " y (10, 9):   " + P1.distancia(10.0, 9.0));
	}
}
