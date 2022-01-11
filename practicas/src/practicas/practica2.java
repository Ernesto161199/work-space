package practicas;

import java.util.*;

public class practica2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un boolean");
		boolean n=sc.nextBoolean();
		System.out.println("Introduce el otro");
		boolean x=sc.nextBoolean();
		
		if(n!=x) {
			System.out.println("Si sigue la secuencia ");
			
		}else {
			System.out.println("no sigue la secuencia ");
		}
		
		
		// si es multiplo o no de 3 y su anterior y posterior

		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("ingresa un numero par");
		int numero=sc.nextInt();
		
		if ( (numero-1)%3==0 || (numero+1)%3==0) {
			System.out.println( (numero-1)+ " Y " +(numero+1)+ " son multiplos de 3" );
		
		}
		System.out.println("ahora el numero vale " + numero);
		System.out.println("FIN");*/
		
		//si es par o no
		/*int numero;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		numero=sc.nextInt();
		
		if (numero%2==0) {
			System.out.println("Es par");
			
		}else {
			System.out.println("Es impar");
			
		}*/
	}

}
