package Ejercicio_1;

public class MiPunto {
	// a) Los atributos x e y 
	private double x;
	private double y;
	
	// b) Un constructor sin argumentos que crea un punto (0, 0)
	public MiPunto() {
		this.x = 0;
		this.y = 0;
	}
	
	// c) Un constructor que construye un punto con las coordenadas especificadas.
	public MiPunto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// d) Un metodo llamado distancia que retorna la distancia desde este punto hasta un punto especificado del tipo MiPunto.

	public double distancia(MiPunto P) {
		double dist = Math.sqrt(Math.pow((this.x - P.x), 2) + Math.pow((this.y - P.y), 2));
		return Math.round(dist * 1000.0) / 1000.0;
	}
	
	// e) Un metodo llamado distancia que retorna la distancia desde este punto hasta otro	punto con las coordenadas x e y especificadas.
	public double distancia(double x, double y) {
		double dist = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)); 
		return Math.round(dist * 1000.0) / 1000.0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y +")";
	}
}
