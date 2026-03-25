package Ejercicio_3;

public class AlgebraVectorial {
    private double x, y, z;

    public AlgebraVectorial() {
        this.x = 0; 
        this.y = 0; 
        this.z = 0;
    }

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
    	return x; 
    }
    public double getY() {
    	return y; 
    }
    public double getZ() {
    	return z; 
    }

    // a) Suma: c = a + b
    public AlgebraVectorial sumar(AlgebraVectorial b) {
        return new AlgebraVectorial(this.x + b.getX(), this.y + b.getY(), this.z + b.getZ());
    }

    // b) Multiplicación por escalar: b = ra
    public AlgebraVectorial multiplicar(double r) {
        return new AlgebraVectorial(r * this.x, r * this.y, r * this.z);
    }

    // c) Longitud magnitud: |a|
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // d) Normal: b = a/|a|
    public AlgebraVectorial normalizar() {
        double m = this.magnitud();
        return new AlgebraVectorial(this.x / m, this.y / m, this.z / m);
    }
    
    // e) Producto escalar: a * b
    public double multiplicar(AlgebraVectorial b) {
        return (this.x * b.getX()) + (this.y * b.getY()) + (this.z * b.getZ());
    }

    // f) Producto vectorial cruz: a x b
    public AlgebraVectorial productoCruz(AlgebraVectorial b) {
        double cx = this.y * b.getZ() - this.z * b.getY();
        double cy = this.z * b.getX() - this.x * b.getZ();
        double cz = this.x * b.getY() - this.y * b.getX();
        return new AlgebraVectorial(cx, cy, cz);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}