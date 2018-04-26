
public class SjakkBrett {
	
	
	
	
	Rute[][] ruter = new Rute[8][8];	
	public SjakkBrett() {
		 // lager startoppsettet
		for(int i = 0; i>=8;i++){
			
			
		}
		
			
		}
	public Rute[][] getRuter() {
		return ruter;
	}
	
	public void flyttBrikke(String input, String eier) {
		String[] del = input.split("");
		int kolonne = Integer.parseInt(del[2]);
		int rad = Integer.parseInt(del[3]);
		ruter[kolonne][rad].setRute(del[0], eier);
		
	}
	
	
	
	
	
}
