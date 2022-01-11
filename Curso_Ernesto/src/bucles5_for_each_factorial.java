import java.util.*;
public class bucles5_for_each_factorial {

	public static void main(String[] args) {
		// factoriales
		Scanner sc=new Scanner(System.in);
		
		Long resultado=1L;
		
		System.out.println("Introduce un numero");
		
		int numero=sc.nextInt();
		
		for(int i=numero; i>0; i--) {
			resultado=resultado*i;
			
		}
		System.out.println("El fatorial de "+ numero + " Es "+ resultado);
	}

}
