//�ki yap�land�r�c� ile �ember s�n�f� tan�mla
public class BasitCember {
	
		double yaricap;
	// Yar��ap� 1 olan bir �ember yap�land�r.
	BasitCember(){
		yaricap = 1;
	}
	// Yar��ap� belirlenebilen bir �ember yap�land�r.
	BasitCember(double yeniYaricap){
		yaricap = yeniYaricap;
	}
	// Bu �emberin alan�n� geri d�nd�r
	double getAlan() {
		return yaricap*yaricap*Math.PI;
	}
	// Bu �emberin �evresini geri d�nd�r.
	double getCevre() {
		return 2*Math.PI*yaricap;
	}
	// Bu �ember i�in yeni yar��ap ata.
	void setYaricap(double yeniYaricap) {
		yaricap = yeniYaricap;
	}
}
