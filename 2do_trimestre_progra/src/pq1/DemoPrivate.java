package pq1;

public class DemoPrivate {

	private void mostrar() {
		System.out.println("estudio java");
	}
	public String xx() {
		mostrar();
		DemoDefault d=new DemoDefault();
		d.mostrarD();
		String salida=" con gusto";
		return salida;
	}
}
