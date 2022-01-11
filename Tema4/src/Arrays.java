import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		//ejercicio_i
		/*Scanner sc=new Scanner(System.in);
		int tam=3;
		int[] numeros=new int[tam];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("intro numero");
			numeros[i] = sc.nextInt();
		}
		for (int i =numeros.length-1; i>-1 ;i--) {
			System.out.println(numeros[i]);
		}*/
		
		//ejercicio_ii
		/*int tam=100;
		 int[] numeros=new int[tam];
		 	for (int i = 0; i < numeros.length; i++) {
		 		numeros[i] = (int)((Math.random()*100)+1);
		 	}
		 	//recorrido
		 	for (int i =1;i<numeros.length ;i=i+2) {
		 		System.out.println("valor de posicion "+i+" es "+numeros[i]);
		 	}*/
		
		//ejercicios_iii
		/*int tam=10;
		int contador=0;
		double acumulador=0;
			double[] notas=new double[tam];
				for (int i = 0; i < notas.length; i++) {
				notas[i] = Math.random()*10;
				acumulador+=notas[i];
			}
				acumulador=acumulador/tam;
				//acumulador/=tam;
				System.out.println("la nota media es "+acumulador);
				for (int i =0; i<notas.length ;i++) {
					System.out.println(notas[i]);
					if (notas[i]>=acumulador) {
						contador++;
					}
				}
				System.out.println(contador);*/
		
		//ejercicio_iv
		Scanner sc=new Scanner(System.in);
		int tam=100, contador = 0;
		int num;
		boolean esta = false;
		String mensaje="";
		int[] datos=new int[tam];
			for (int i = 0; i < datos.length; i++) {
				

				datos[i] =(int) ((Math.random()*100)+1);
				
			}
			do {
				System.out.println("intro numero a buscar entre 1 y 100");
				num=sc.nextInt();
			} while (num<1 || num>100);
			System.out.println("numero buscado es "+num);
			//proceso a buscar
			for (int i = 0; i < datos.length; i++) {
				System.out.println(datos[i]);
			if (datos[i]==num) {
				esta=true;
				mensaje+="esta en la posicion " +i;
			}
	}
	if (esta) {
		System.out.println(mensaje);
	}else {
		System.out.println("el "+num+" no estaba");
	}
	System.out.println("fin");
	}
}
