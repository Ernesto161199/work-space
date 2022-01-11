package practicas;

import java.util.Scanner;

public class practicas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int valor1=(int)(Math.random()*100);
		int valor2=(int)(Math.random()*100);
		
		boolean t=false;
		
		if (valor1<valor2) {
			
			System.out.println("El valor 1 es menor que el valor 2 porque "+ "valor1 vale:" 
			+ valor1 + " valor2 vale:" + valor2 );
			System.out.println(t=true);
			
		}else
			
			System.out.println("El valor1 que vale:" +valor1 +" vale mas que el valor2 que es:"+ valor2);
			System.out.println(t=false);
			
		
	}
	

}
