package pqej12I;

public class gato extends Animal {

	public gato(String categoria, int patas) {
		super(categoria, patas);
		
	}
@Override
public void comoSueno() {
	System.out.println("miau miau");
}
@Override
public String toString() {
	return "gato"
			+ super.toString();
}

	
}
