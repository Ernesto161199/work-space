package pqej12I;

public class testAnimal {

	public static void main(String[] args) {
		Animal a1=new Animal("Mamifero",4);
		System.out.println(a1);
		a1.comoSueno();
		gato g1=new gato("mamifero",4);
		System.out.println(g1);
		g1.comoSueno();
		Caracal c1=new Caracal("mamifero",4,"sabana");
		System.out.println(c1);
		c1.comoSueno();
		Animal refAnimal;
		refAnimal=c1;
		System.out.println(" tengo " + refAnimal.getPatas()+" patas");
		refAnimal.comoSueno();
		refAnimal=g1;	
		System.out.println(" tengo " + refAnimal.getPatas()+" patas");
		refAnimal.comoSueno();
		
	}

}
