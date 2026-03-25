package Ejercicio_2;

public class MainAlgebraVectorial {
	public static void main(String[] args) {
        // 1. Instancias usando sobrecarga de constructores
        AlgebraVectorial v1 = new AlgebraVectorial(3.0, 0.0, 0.0);
        AlgebraVectorial v2 = new AlgebraVectorial(0.0, 4.0, 0.0);
        AlgebraVectorial v3 = new AlgebraVectorial(6.0, 0.0, 0.0);
        
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("v3: " + v3);
        
        System.out.println("\n--- PRUEBAS DE LOS INCISOS ---");
        // a) |a + b| = |a - b|
        System.out.println("a) Por Diagonales (v1 y v2): " + v1.Perpendicular(v2, "diagonales"));
        // b) |a - b| = |b - a| (Identidad)
        System.out.println("b) Por simetria (v1 y v2): " + v1.Perpendicular(v2, 's'));
        // c) a * b = 0
        System.out.println("c) Por Producto Punto (v1 y v2): " + v1.Perpendicular(v2));
        // d) |a + b|^2 = |a|^2 + |b|^2
        System.out.println("d) Por Pitagoras (v1 y v2): " + v1.Perpendicular(v2, 1));
        
        // e) a = rb
        System.out.println("e) Por multiplo escalar (v1 y v2): " + v1.paralela(v2));
        // f) a x b = 0
        System.out.println("f) Por producto cruz (v1 y v2): " + v1.paralela(v2, 1));

        // g) Proyeccion (Retorna un nuevo objeto AlgebraVectorial)
        AlgebraVectorial proy = v1.Proyeccion(v3);
        System.out.println("g) Proyeccion de v1 sobre v3: " + proy.toString());
        
        // h) Componente
        double comp = v1.Componente(v3);
        System.out.println("h) Componente de v1 en direccion de v3: " + comp);
    }
}
