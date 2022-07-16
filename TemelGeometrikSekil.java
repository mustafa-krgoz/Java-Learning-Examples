
public class TemelGeometrikSekil {
		private String renk = "Beyaz";
		private boolean dolgu;
		private java.util.Date olusturulmaTarihi;
	
	// Varsayýlan bir geometrik nesne oluþtur.
	public TemelGeometrikSekil() {
		olusturulmaTarihi = new java.util.Date();
	}
	
	// Belirtilen renk ve dolgu deðeri ile varsayýlan bir geometrik nesne olustur.
	public TemelGeometrikSekil(String renk, boolean dolgu) {
		this.renk = renk;
		this.dolgu = dolgu;
		olusturulmaTarihi = new java.util.Date();
	}
	// Renk döndür.
	public String getRenk() {
		return renk;
	}
	// Renk ata.
	public void setRenk(String renk) {
		this.renk = renk;
	}
	// Dolgu döndür, dolgu boolean olduðundan, get metodunun isDolgu þeklinde adlandýrýldý.
	public boolean isDolgu() {
		return dolgu;
	}
	// Dolgu ata.
	public void setDolgu(boolean dolgu) {
		this.dolgu = dolgu;
	}
	// OlusturlmaTarihi döndür.
	public java.util.Date getOlusturulmaTarihi(){
		return olusturulmaTarihi;
	}
	// Bu nesnenin string sunumunu döndür.
	public String toString() {
		return "Oluþturulma Tarihi:" + olusturulmaTarihi + "\n renk:" + renk + " ve dolgu:" + dolgu;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
