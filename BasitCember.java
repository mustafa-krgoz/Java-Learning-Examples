//Ýki yapýlandýrýcý ile Çember sýnýfý tanýmla
public class BasitCember {
	
		double yaricap;
	// Yarýçapý 1 olan bir çember yapýlandýr.
	BasitCember(){
		yaricap = 1;
	}
	// Yarýçapý belirlenebilen bir çember yapýlandýr.
	BasitCember(double yeniYaricap){
		yaricap = yeniYaricap;
	}
	// Bu çemberin alanýný geri döndür
	double getAlan() {
		return yaricap*yaricap*Math.PI;
	}
	// Bu çemberin çevresini geri döndür.
	double getCevre() {
		return 2*Math.PI*yaricap;
	}
	// Bu çember için yeni yarýçap ata.
	void setYaricap(double yeniYaricap) {
		yaricap = yeniYaricap;
	}
}
