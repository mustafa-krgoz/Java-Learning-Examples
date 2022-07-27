
public class CemberIstisnaIle {
	// Çemberin yarýçapý 
	private double yaricap;
	// Oluþturulan nesne sayýsý
	private static int nesneSayisi = 0;
	// 1 Yarýçaplý çemberi yapýlandýr.
	public CemberIstisnaIle() {
		this(1.0);
	}
	// Belirtilen yarýçap ile çemberi yapýlandýr.
	public CemberIstisnaIle(double yeniYaricap) {
		setYaricap(yeniYaricap);
		nesneSayisi++;
	}
	// Yarýçap döndür
	public double getYaricap() {
		return yaricap;
	}
	// Yeni bir yarýçap ata
	public void setYaricap(double yeniYaricap) throws IllegalArgumentException{
		if(yeniYaricap>= 0)
			yaricap = yeniYaricap;
		else 
			throw new IllegalArgumentException("Yarýçap negatif olamaz.");
	}
	// nesneSayýsýný döndür
	public static int getNesneSayisi() {
		return nesneSayisi;
	}
	//Çemberin alanýný döndür
	public double getAlan() {
		return yaricap*yaricap*Math.PI;
	}
	
	

}
