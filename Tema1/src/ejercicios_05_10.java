
public class ejercicios_05_10 {
//ejercicio2
	public static void main(String[] args) {
	//	int var1=2;
	//	int var2=2, resultado;
	//	resultado=var1+var2;
	//	System.out.println( resultado + " es la suma de 2+2");
	//	int var3=3;
	//	System.out.println( var3*resultado + " es la multiplicacion de la suma de 2+2 ");
//ejercicio1
		double km=Math.random()*100;
		System.out.println("kms recorridos " +km);
		double litros=Math.random()*10;
		System.out.println("litros recorridos " +litros);
		double sol=litros/km;
		System.out.println("sin redondear " + sol);
		System.out.println(Math.round(sol*100.0)/100.0 +" redondeado");
	}

}
