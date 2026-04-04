package Ejercicio2;

import java.util.Random;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{
	
	public JuegoAdivinaPar(int numVidas) {
		super(numVidas);
	}
	
	public boolean validaNumero(int num) {
		if (0 <= num && num <= 10 && num % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public int generaNumer() {
		return new Random().nextInt(0, 6)*2;
	}
}
