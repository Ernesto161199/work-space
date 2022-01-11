
public class manipula_cadenas_II {

	public static void main(String[] args) {
		
		String frase="Hoy es un estupendo dia para programar";
		
		String frase_resumen=frase.substring(0, 37) + " irnos a la playa y olvidarnos de todo..." 
		+ frase.substring(0, 37);
		System.out.println(frase_resumen);
		
	}

}
