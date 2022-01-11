import java.util.Scanner;

public class while1_suma100 {

	public static void main(String[] args) {
		//ejercicio i
		
		/*Scanner teclado=new Scanner(System.in);
		int num,contador=0,suma=0;
		while (suma<100) {
			System.out.println("intro numero");
			num=teclado.nextInt();
			contador++;
			suma+=num;
			System.out.println(num);
		}
		System.out.println("la suma acumulada es "+suma);
		System.out.println("con "+contador+" numeros");*/
		
		//ejercicio ii
		
		/*Scanner teclado=new Scanner(System.in);
		System.out.println("intro numero");
		int ant=teclado.nextInt();
		System.out.println("intro numero");
		int sig=teclado.nextInt();
			while (ant!=sig) {
				ant=sig;
				System.out.println("intro numero");
				sig=teclado.nextInt();
			}
			System.out.println("fin del programa");*/
		
		//version2 del ejer ii
		
		/*Scanner teclado=new Scanner(System.in);
		int contador=0;
		int ant=-1;
		int sig=0;
			while (ant!=sig || contador<2) {
				ant=sig;
				System.out.println("intro numero");
				sig=teclado.nextInt();
				contador++;
			}
			System.out.println("fin del programa");*/
		
		//erjercicio iii
		
		/*Scanner teclado=new Scanner(System.in);
		int contfallos=0, contAciertos=0, num;
		int maximo=20; //minimo posible del rango
		
			while (contAciertos<4) {
				
				System.out.println("intro numero");
				num=teclado.nextInt();
				if (num>=19 && num<41) {
					contAciertos++;
					if (num>maximo) {
						maximo=num;
					}
				}else {
					contfallos++;
				}
			}
			System.out.println(maximo+ " " +contfallos);
			System.out.println("fin del programa");*/
		
		//version2 ejer iii
		
		
		}
	}


