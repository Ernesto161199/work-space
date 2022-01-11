package practicas;

import java.util.*;

public class practicas3_bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int n=(int)(Math.random()*100);
		int p;
		boolean boleano=true;
		
		for (int i=1; i<10; i++) {
			p=(int)(Math.random()*100);
			System.out.println(p);
			if (p!=n) {
				boleano=false;
			}
			
		}
		if(boleano==true) {
			System.out.println("TODOS SON IGUALES");
		}else {
			System.out.println("NO TODOS SON IGUALES");
		}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("INTRODUZCA UN NUMERO");
		int numero=sc.nextInt();
		boolean boleano=true;
		
		for (int i=numero-1; i>1; i--) {
			if (numero%i==0) {
				System.out.println(numero +" no es primo");
				boleano=false;
				break;
				
			}
			
		}
		if (boleano) {
			System.out.println("Es primo ");
		}
		System.out.println("fin");
		
		
	}
		
	
		
		
}



