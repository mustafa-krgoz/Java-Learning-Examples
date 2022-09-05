
public class TV {
	int kanal = 1; // varsayýlan kanal 1
	int sesSeviyesi = 1; // varsayýlan ses seviyesi 1
	boolean acik = false; // TV kapalý	
	
	public TV() {
		
	}
	public void ac() {
		acik = true;
	}
	public void kapali() {
		acik = false;
	}
	public void setKanal(int yeniKanal) {
		if(acik && yeniKanal >= 1 && yeniKanal<=120) 
			kanal = yeniKanal;	
	}
	public void setSes(int yeniSesSeviyesi) {
		if(acik && yeniSesSeviyesi >=1 && yeniSesSeviyesi <=7)
			sesSeviyesi = yeniSesSeviyesi;
	}
	public void kanalYukari() {
		if(acik && kanal < 120)
			kanal++;
	}
	public void kanalAsagi() {
		if(acik && kanal > 1)
			kanal--;
	}
	public void sesArtir() {
		if(acik && sesSeviyesi <7 )
			sesSeviyesi ++;
	}
	public void sesAzalt() {
		if(acik && sesSeviyesi > 1)
			sesSeviyesi--;
	}
	
	

}
