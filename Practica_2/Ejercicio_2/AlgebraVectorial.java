package Ejercicio_2;

public class AlgebraVectorial {
	private double x; 
	private double y;
	private double z;
	
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

    // Getters
    public double getX() {
    	return x; 
    }
    public double getY() {
    	return y; 
    }
    public double getZ() {
    	return z; 
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

	// a) |a + b| = |a - b|
	public String Perpendicular(AlgebraVectorial b, String tipo) {
		AlgebraVectorial suma = new AlgebraVectorial(this.x + b.getX(), this.y + b.getY(), this.z + b.getZ());
        AlgebraVectorial resta = new AlgebraVectorial(this.x - b.getX(), this.y - b.getY(), this.z - b.getZ());
        if (suma.magnitud() == resta.magnitud()) { return "Son perpendicualares"; }
		return "No son Perpendiculares";
	}
	
	// b) |a - b| = |b - a|
	public String Perpendicular(AlgebraVectorial b, char tipo) {
		AlgebraVectorial ab = new AlgebraVectorial(this.x - b.getX(), this.y - b.getY(), this.z - b.getZ());
        AlgebraVectorial ba = new AlgebraVectorial(b.getX() - this.x, b.getY() - this.y, b.getZ() - this.z);
        if (ab.magnitud() == ba.magnitud()) { return "Son perpendicualares"; }
		return "No son Perpendiculares";
	}
	
	// c) a * b = 0
	public String Perpendicular(AlgebraVectorial b) {
		double punto = (this.x * b.getX()) + (this.y * b.getY()) + (this.z * b.getZ());
		if (punto == 0) { return "Son perpendicualares"; }
		return "No son Perpendiculares";
	}
	
	// d) |a + b|^2 = |a|^2 + |b|^2
	public String Perpendicular(AlgebraVectorial b, int tipo) {
		AlgebraVectorial suma = new AlgebraVectorial(this.x + b.getX(), this.y + b.getY(), this.z + b.getZ());
        double izq = Math.pow(suma.magnitud(), 2);
        double der = Math.pow(this.magnitud(), 2) + Math.pow(b.magnitud(), 2);
        if (izq == der) { return "Son perpendicualares"; }
		return "No son Perpendiculares";
	}
	
	// e) a = rb
	public String paralela(AlgebraVectorial b) {
		double r = this.x / b.getX();
        boolean Y = this.y == (r * b.getY());
        boolean Z = this.z == (r * b.getZ());
        if (Y && Z) { return "Son paralelas"; }
		return "No son paralelas";
	}
	
	// f) a X b = 0
	public String paralela(AlgebraVectorial b, int cruz) {
		double cx = this.y * b.getZ() - this.z * b.getY();
        double cy = this.z * b.getX() - this.x * b.getZ();
        double cz = this.x * b.getY() - this.y * b.getX();
        AlgebraVectorial c = new AlgebraVectorial(cx, cy, cz);
        if (c.magnitud() == 0) { return "Son paralelas"; }
		return "No son paralelas";
	}
	
	// g) Proyeccion
	public AlgebraVectorial Proyeccion(AlgebraVectorial b) {
		double punto = (this.x * b.getX()) + (this.y * b.getY()) + (this.z * b.getZ());
        double magB = Math.pow(b.magnitud(), 2);
        double f = punto / magB;
        return new AlgebraVectorial(b.getX() * f, b.getY() * f, b.getZ() * f);
	}
	
	// h) Componente
	public double Componente(AlgebraVectorial b) {
		double punto = (this.x * b.getX()) + (this.y * b.getY()) + (this.z * b.getZ());
        return punto / b.magnitud();
	}
	
	@Override
	public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
