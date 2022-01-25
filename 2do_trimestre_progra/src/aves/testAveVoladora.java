package aves;


public class testAveVoladora {

	public static void main(String[] args) {
		AveVoladora[] ave_array=new AveVoladora[100];
		AveVoladora pw0=new AveVoladora("Falco mexicanus", "rapaz",85,"rapaz");
		AveVoladora pw1=new AveVoladora("aguila pescadora", "pandion haliaetus", 105, "rapaz");
		AveVoladora pw2=new AveVoladora("tucan", "ramphastos toco",60,"trepadora");
		AveVoladora pw3=new AveVoladora("pavo real", "pavo cristatus",92,"gallinacea");
		AveVoladora pw4=new AveVoladora("garza", "mesophoyx intermedia",98,"zancuda");
		AveVoladora pw5=new AveVoladora("flamenco", "phoenicopterus",56,"zancuda");
		ave_array[0]=pw0;
		ave_array[1]=pw1;
		ave_array[2]=pw2;
		ave_array[3]=pw3;
		ave_array[4]=pw4;
		ave_array[5]=pw5;
		for(int i=0; i<ave_array.length;i++) {
			if(ave_array[i]!=null) {
				if(ave_array[i].peligroExtincion()) {
					ave_array[i].incrementarNumeroIndividuos(10);
				}else {
					System.out.println(ave_array[i]);
				}
				
			}else {
				break;
			}
		}
		
	}

}
