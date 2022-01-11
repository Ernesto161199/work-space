import java.util.Arrays;

public class pelicula {

	private String titulo;
	private String genero;
	private int duracion;
	private String[] actores;
	
	public pelicula(String titulo, String genero, int duracion ) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.actores = new String[3]; //3 posiciones a null
	}
	
	@Override
	public String toString() {
		return "pelicula [titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", actores="
				+ Arrays.toString(actores) + "]";
	}

	public String gettitulo() { //getter
		return titulo;
	}
	
	public void settitulo(String titulo) { //setter
		this.titulo = titulo;
	}
	
	public String critica() {
		return " la pelicula" +titulo+ " desarrolla como tema principal bla";
	}
	
	public static double recaudacion(int numesp) {
		return numesp*10.0;
	}
	
	public boolean agregar (String nombre) {
		for (int i=0; i<actores.length; i++) {
			if (actores[i]!=null) {
				if (actores[i].equals(nombre)) {
					System.out.println("ese nombre ya esta");
					return false;
				}
			}else {
				actores[i]=nombre;
				System.out.println("nombre incluido");
				return true;
			}
		}
		return false; //lista llena no coincidente 
	}
	
}
