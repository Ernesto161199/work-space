//* con import para todas las clases; pero puedes poner la clase en concreto para importar, como Scanner
import java.util.*;
public class Import {

	public static void main(String[] args) {

		Scanner miescaner=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, porfavor");
		
		String nombre_usuario=miescaner.nextLine();
		
		System.out.println("Introduce edad");
		
		int edad=miescaner.nextInt();
		
		System.out.println("Hola "+nombre_usuario+ " el año que viene tendras " + (edad+1) + " años");

	}

}
