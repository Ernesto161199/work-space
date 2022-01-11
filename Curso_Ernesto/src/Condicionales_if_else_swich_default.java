import java.util.*;
public class Condicionales_if_else_swich_default {

	public static void main(String[] args) {
		//PROGRAMA PARA HAYAR cuadrado, rectangulo, triangulo y circulo
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		int figura=sc.nextInt();
		
		switch (figura) {
		
		case 1: 
			
			System.out.println("introduce el lado");
			
			int lado=sc.nextInt();
			
			System.out.println("El area del cuadrado es " +Math.pow(lado, 2));
			
			break;
			
		case 2:
			
			System.out.println("introduce la base");
			int base=sc.nextInt();
			
			System.out.println("introduce la altura");
			
			int altura=sc.nextInt();
			
			System.out.println("El area del rectangulo es " + base*altura);
		
			break;
		
		case 3:
			
			System.out.println("introduce la base");
			int base1=sc.nextInt();
			
			System.out.println("introduce la altura");
			
			int altura2=sc.nextInt();
			
			System.out.println("El area del triangulo es " + base1*altura2/2);
		
			break;
			
		case 4:
			
			System.out.println("introduce el radio");
			
			int radio=sc.nextInt();
			
			System.out.println("el radio de un circulo es " + Math.round(Math.PI*(Math.pow(radio, 2))) +" es el numero redondeado");
			
		
			break;
			
		default:
			System.out.println("La opcion no es correcta");
		}
		
		
		
		
		//programa para saber a que grupo de personas perteneces
		/*Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce tu edad porfavor");
		
		int edad=sc.nextInt();
		
		if (edad<18) {
			System.out.println("eres un adolescente");
		}
		else if(edad<40) {
			System.out.println("eres joven");
		}
		else if(edad<65) {
			System.out.println("eres maduro");
		}
		else if(edad>65){
			System.out.println("eres viejo");
		}
		*/
		
		//programa para saber si eres mayor de edad
		/*if(edad>=18) {
			System.out.println("Eres mayor de edad");
			
		}else {
			System.out.println("No eres mayor de edad");
		}*/

	}

}
