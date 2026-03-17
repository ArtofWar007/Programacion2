package Ejercicio_4;
import java.util.Scanner;
public class MainVideojuego {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Videojuego v1 = new Videojuego("Elden Ring", "PC"); //Constructor 1
        Videojuego v2 = new Videojuego("FIFA 26", "PS5", -22); //Constructor 2

        v1.agregarJugadores();
        
        System.out.print("Ingrese cuántos jugadores se unen a " + v2.getNombre() + ": ");
        int extra = sc.nextInt();
        v2.agregarJugadores(extra);

        System.out.println(v1);
        System.out.println(v2);
    }
}
