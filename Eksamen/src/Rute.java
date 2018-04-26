
public class Rute {
	private String brikke = null;
	private String eier = null;
			
	public void setRute(String inBrikke,String inEier) {
		inBrikke = this.brikke;
		inEier = this.eier;
	}
	
	public String getRute() {
		return brikke +"|"+ eier;
	}
			
}
