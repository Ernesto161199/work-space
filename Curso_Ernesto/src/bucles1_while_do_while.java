
import java.util.*;
public class bucles1_while_do_while {

	public static void main(String[] args) {
		
		//acceso a una aplicacion, con una contraseņa
		Scanner sc=new Scanner(System.in);
		String clave="Ernesto";
		String pass="";
		
		while (clave.equals(pass)==false){
			
			System.out.println("introduce la contraseņa");
			pass=sc.next();
			
			if (clave.equals(pass)==false) {
				
				System.out.println("Contraseņa incorrecta");
			}
		}
		System.out.println("Contraseņa correcta acceso permitido");
	}

}
