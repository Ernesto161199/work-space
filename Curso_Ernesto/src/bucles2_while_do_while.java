import java.util.*;
public class bucles2_while_do_while {

	public static void main(String[] args) {
		// Adivina el numero (numeros aleatorios)
		
		Scanner sc=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		int aleatorio=(int)(Math.random()*100);
		
		while (numero!=aleatorio) {
			intentos++;
			System.out.println("introduce un numero");
			numero=sc.nextInt();
			if(aleatorio<numero) {
				System.out.println("mas bajo");
		
			}
			else if (aleatorio>numero) {
				System.out.println("mas alto");
				
			}
		}
		System.out.println("correcto. lo has conseguido " +intentos+ " intentos");
	}

}

//do while del anterior ejercicio
		/*int numero=0;
		int intentos=0;
		int aleatorio=(int)(Math.random()*100);
		
		do {
			intentos++;
			System.out.println("introduce un numero");
			numero=sc.nextInt();
			if(aleatorio<numero) {
				System.out.println("mas bajo");
		
			}
			else if (aleatorio>numero) {
				System.out.println("mas alto");
				
			}
			
		}while (numero!=aleatorio);
		System.out.println("correcto. lo has conseguido " +intentos+ " intentos");*/