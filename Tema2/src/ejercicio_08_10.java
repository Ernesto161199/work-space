
public class ejercicio_08_10 {

	public static void main(String[] args) {
		//escribir tu nombre con mensaje
		/* ejercicio 2
		Scanner teclado=new Scanner(System.in);
		System.out.println("teclea tu nombre");
		String n1=teclado.nextLine();
		teclado.close();
		System.out.println("hola "+n1+" hoy es viernes");
		System.out.println("fin del programa");
		*/
		
		//%2==0: me permite comparar los numeros (si es multiplo o no)
		/* ejercicio1
		Scanner teclado=new Scanner(System.in);
		System.out.println("teclea un numero");
		int n1=teclado.nextInt();
		teclado.close();
		 if (n1%2==0) {
			System.out.println(n1+ " v es par");
		}else {
			System.out.println(n1+" es impar");
		}
		System.out.println("fin del programa");*/
	
		//ejercicio 3
		/* primera forma
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce tu numero");
		int v=sc.nextInt();
		sc.close();
		if ( (v-1)%3==0 || (v+1)%3==0) {
			System.out.println((v-1)+" o "+(v+1+" es multiplo de 3"));
		}
		System.out.println("ahora v vale "+v);
		System.out.println("fin programa");
		*/
		//otro ejemplo
		/*Scanner sc=new Scanner(System.in);
	    System.out.println("Intriduce int number");
	    int v=sc.nextInt();
	    sc.close();
	    int xdec=v,xinc=v;
	    if(--xdec%3==0)
	    	if(++xdec%3==0)
	    System.out.println("ahora v vale "+v);
	    System.out.println("fin programa");
		*/
		
		//ejercicio4 (comparancion de boolean)
		/*Scanner sc=new Scanner(System.in);
	    System.out.println("Introduce boolean");
	    boolean v=sc.nextBoolean();
	    System.out.println("intro boolean");
	    boolean x=sc.nextBoolean();
	    sc.close();
	    if(v!=x) {
	    	System.out.println("siguen secuencia");
	    }else {
	    	System.out.println("no siguen secuencia, los 2 boolean");
	    }*/
		
		//ejemplo de apuntes, numeros consecutivos ""\t: es tabular"" 
		/*int i=10,j=1,a=2,b=3,c=4,d=5,k=101;
		System.out.println(i+"\t"+j+"\t"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+k);
		if (i == 10) {
			if (j < 20)
				a = b;
			if (k > 100)
				c = d;
			else
				a = c; // this else refers to if(k > 100)
		} else
			a = d; // this else refers to if(i == 10)
		System.out.println(i+"\t"+j+"\t"+a+"\t"+b+"\t"+c+"\t"+d+"\t"+k); */

	}

}
