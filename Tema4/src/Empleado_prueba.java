
public class Empleado_prueba {

	public static void main(String[] args) {
		
		Empleado e1=new Empleado("707");
		System.out.println(e1);
		Empleado e2=new Empleado("Marta", "555");
		System.out.println("El telefono de "+ e2.getNombre()+ " es "+e2.getTelefono());
		System.out.println(e2);
		Empleado e3=new Empleado ("Sergio", "888");
		System.out.println("En la empresa hay " + Empleado.getnumEmpleados());
		
		if (e3==e2) {
			System.out.println("Son el mismo empleado");
		}else {
			System.out.println("no son el mismo empleado");
		}

	}

}
