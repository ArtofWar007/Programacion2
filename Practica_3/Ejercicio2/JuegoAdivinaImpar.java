package Ejercicio2;

import java.util.Random;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
	public JuegoAdivinaImpar(int numVidas) {
		super(numVidas);
	}
	
	public boolean validaNumero(int num) {
		if (0 <= num && num <= 10 && num % 2 == 1) {
			return true;
		}
		return false;
	}
	
	public int generaNumer() {
		int num = new Random().nextInt(0, 10);
		if (num % 2 == 0) {
			num += 1; 
		}
		return num;
	}
}
