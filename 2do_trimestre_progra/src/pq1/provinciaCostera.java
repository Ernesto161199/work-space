package pq1;

public class provinciaCostera extends provincia {
	private int kmsCosta;
	public provinciaCostera(String nombre, String cc, int km2, int poblacion, int kcosta) {
		super(nombre, cc, km2, poblacion);
		kmsCosta=kcosta;
	}
	public int getKmsCosta() {
		return kmsCosta;
	}
	public void setKmsCosta(int kmsCosta) {
		this.kmsCosta = kmsCosta;
	}
	public void muestra() {
		System.out.println("soy " +getNombre()+" provincia costera tengo de costa " +kmsCosta);
	}
	@Override
	public String toString() {
		return super.toString()+ "provinciaCostera [kmsCosta=" + kmsCosta + "]";
	}

}
