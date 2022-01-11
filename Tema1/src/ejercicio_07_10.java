
public class ejercicio_07_10 {
//variable boolean
	public static void main(String[] args) {
		int x=(int)(Math.random()*100);
		int y=(int)(Math.random()*100);
		System.out.println(" x es "+x+ " y, y es "+ y);
		boolean sw=(x>y);		
		//en vez que sea entero, te dice si es verdadero o falso
		//else.. si no se cumple la condicion
		//if es una condicional, si se cumple o no
		
		/*if (x>y) sw=true;
		else sw=false;*/
		
		if (sw) { 
			System.out.println("x es mayor que y");
		}
			
		else {
			System.out.println("x es menor o igual que y");
		
		}

	}

}
