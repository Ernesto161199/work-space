
public class ejercicios_adicionales_1 {

	public class Ciudad {
		private String nombre;
		private double[] temperaturaMinima = new double [12];
		private double[] temperaturaMaxima = new double [12];
		
		public Ciudad(String nombre) {
			this.nombre=nombre;
		}
		
		public Ciudad(String nombre, double max1, double min1) {
			this.nombre=nombre;
			for (int i=0; i<temperaturaMaxima.length; i++) {
				temperaturaMaxima[i]=Math.random()*(max1);
				temperaturaMinima[i]=Math.random()*(max1);
			}
			
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getNombre() {
			return this.nombre;
		}
		
		public void registrarTemperatura(int mes, double temperatura) {
		
			if (temperaturaMaxima[mes]< temperatura) {
				temperaturaMaxima[mes]= temperatura;
			}
			if (temperaturaMinima[mes]< temperatura) {
				temperaturaMinima[mes]= temperatura;
			}
		}
		
	}
	
	public double minimaGeneral() {
		double temp=temperaturaMinima[0];
		for (int=1; i<temperaturaMaxima)
	}

}
