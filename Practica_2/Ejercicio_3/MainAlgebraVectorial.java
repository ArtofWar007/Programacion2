package Ejercicio_3;

public class MainAlgebraVectorial {
	public static void main(String[] args) {
		AlgebraVectorial a = new AlgebraVectorial(1, 0, 0);
        AlgebraVectorial b = new AlgebraVectorial(0, 1, 0);

        // a) Suma: c = a + b
        System.out.println("Suma (a + b): " + a.sumar(b));
        // b) Multiplicación por escalar: b = ra
        System.out.println("Escalar (a * 5): " + a.multiplicar(5.0));
        // c) Longitud magnitud: |a|
        System.out.println("Longitud (|a|): " + a.magnitud());
        // d) Normal: b = a/|a|
        System.out.println("Normal (a/|a|): " + a.normalizar());
        // e) Producto escalar: a * b
        System.out.println("Punto (a * b): " + a.multiplicar(b));
        // f) Producto vectorial cruz: a x b
        System.out.println("Cruz (a x b): " + a.productoCruz(b)); 
	}
}
