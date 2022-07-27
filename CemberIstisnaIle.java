
public class CemberIstisnaIle {
	// �emberin yar��ap� 
	private double yaricap;
	// Olu�turulan nesne say�s�
	private static int nesneSayisi = 0;
	// 1 Yar��apl� �emberi yap�land�r.
	public CemberIstisnaIle() {
		this(1.0);
	}
	// Belirtilen yar��ap ile �emberi yap�land�r.
	public CemberIstisnaIle(double yeniYaricap) {
		setYaricap(yeniYaricap);
		nesneSayisi++;
	}
	// Yar��ap d�nd�r
	public double getYaricap() {
		return yaricap;
	}
	// Yeni bir yar��ap ata
	public void setYaricap(double yeniYaricap) throws IllegalArgumentException{
		if(yeniYaricap>= 0)
			yaricap = yeniYaricap;
		else 
			throw new IllegalArgumentException("Yar��ap negatif olamaz.");
	}
	// nesneSay�s�n� d�nd�r
	public static int getNesneSayisi() {
		return nesneSayisi;
	}
	//�emberin alan�n� d�nd�r
	public double getAlan() {
		return yaricap*yaricap*Math.PI;
	}
	
	

}
