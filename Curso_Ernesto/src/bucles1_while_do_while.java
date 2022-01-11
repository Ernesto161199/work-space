
import java.util.*;
public class bucles1_while_do_while {

	public static void main(String[] args) {
		
		//acceso a una aplicacion, con una contraseña
		Scanner sc=new Scanner(System.in);
		String clave="Ernesto";
		String pass="";
		
		while (clave.equals(pass)==false){
			
			System.out.println("introduce la contraseña");
			pass=sc.next();
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("Contraseña correcta acceso permitido");
	}

}
