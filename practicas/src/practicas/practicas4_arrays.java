package practicas;
import java.util.*;
public class practicas4_arrays {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int numero=10;
		int [] Nteclado=new int [numero];
		
		for (int i=0; i<Nteclado.length; i++) {
			System.out.println("INTRODUCE UN NUMERO");
			Nteclado[1]=sc.nextInt();
		}
		for (int i =Nteclado.length-1; i>-1 ;i--) {
			System.out.println(Nteclado[i]);
		}
	}

}
