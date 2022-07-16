
public class TemelGeometrikSekil {
		private String renk = "Beyaz";
		private boolean dolgu;
		private java.util.Date olusturulmaTarihi;
	
	// Varsay�lan bir geometrik nesne olu�tur.
	public TemelGeometrikSekil() {
		olusturulmaTarihi = new java.util.Date();
	}
	
	// Belirtilen renk ve dolgu de�eri ile varsay�lan bir geometrik nesne olustur.
	public TemelGeometrikSekil(String renk, boolean dolgu) {
		this.renk = renk;
		this.dolgu = dolgu;
		olusturulmaTarihi = new java.util.Date();
	}
	// Renk d�nd�r.
	public String getRenk() {
		return renk;
	}
	// Renk ata.
	public void setRenk(String renk) {
		this.renk = renk;
	}
	// Dolgu d�nd�r, dolgu boolean oldu�undan, get metodunun isDolgu �eklinde adland�r�ld�.
	public boolean isDolgu() {
		return dolgu;
	}
	// Dolgu ata.
	public void setDolgu(boolean dolgu) {
		this.dolgu = dolgu;
	}
	// OlusturlmaTarihi d�nd�r.
	public java.util.Date getOlusturulmaTarihi(){
		return olusturulmaTarihi;
	}
	// Bu nesnenin string sunumunu d�nd�r.
	public String toString() {
		return "Olu�turulma Tarihi:" + olusturulmaTarihi + "\n renk:" + renk + " ve dolgu:" + dolgu;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
