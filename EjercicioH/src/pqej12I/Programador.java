package pqej12I;

import java.util.Arrays;

public class Programador extends Empleado {
	
private String[] lenguajes;

	public Programador(String nombre, String ...lenguajes) {
		super(nombre);
		this.lenguajes=lenguajes;
	}
	public Programador (String nombre, int tf, String ...lenguajes) {
		super(nombre,tf);
		this.lenguajes=lenguajes;
	}
	public String[] getLenguajes() {
		return lenguajes;
	}
	public static String[] mejoresCandidatos(String lenguajePrincipal,Programador[] ps){
		String [] lengs;
		String [] salida=new String[ps.length];
		int cont=0;//numero de candidatos buenos
		for (int i=0;i<ps.length;i++) {
			lengs=ps[i].lenguajes;
			for (int j=0;j<lengs.length;j++) {
				if (lengs[j].equals(lenguajePrincipal)) {
					//este es un buen candidato
					salida[cont]=ps[i].getNombre()+","+ps[i].getTf();
					cont++;
					break;
				}
			}
		}
		return salida;
	}
	@Override
	public String toString() {
		String salida= super.getNombre()+ " con tf " +super.getTf()+ " conoce los lenguajes \n";
		for (String l:lenguajes) {
			salida+=l+"\t";
		}
		return salida;
	}
	
}
