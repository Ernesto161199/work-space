package poo;
import java.util.*;
public class Uso_coche {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Coche micoche=new Coche();
		
		System.out.println("Introduce color");
		micoche.establece_color(sc.next());
		
		System.out.println("Tiene asientos de cuero?");
		micoche.configura_asientos(sc.next());
		
		
		System.out.println("Tiene climatizador?");
		micoche.configura_climatizador(sc.next());
		
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_peso_coche());
		System.out.println(micoche.dime_asientos());
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println("El precio final del coche es: "+ micoche.precio_coche());
		
	}

}
