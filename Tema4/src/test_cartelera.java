
public class test_cartelera {

	public static void main(String[] args) {
		cartelera c=new cartelera(2);
		pelicula p1=new pelicula("el buen patron","drama",90);
		p1.agregar("barden");
		p1.agregar("yna");
		pelicula p2=new pelicula("maixabel","drama",80);
		p2.agregar("ggg");
		c.agregarpelicuala(p1, "barna");
		c.agregarpelicuala(p2, "barna");
		c.agregarpelicuala(p2, "madrid");
		c.agregarpelicuala(p2, "sevilla");
		System.out.println(c);
		pelicula p3=new pelicula("sdasaas","drama",90);
		p3.agregar("actor1");
		c.agregarpelicuala(p3, "sevilla");
		System.out.println(c);
	}

}
