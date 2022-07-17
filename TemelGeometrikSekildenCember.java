
public class TemelGeometrikSekildenCember extends TemelGeometrikSekil{
	private double yaricap;
	
	public TemelGeometrikSekildenCember() {
	}
	public TemelGeometrikSekildenCember(double yaricap) {
		this.yaricap = yaricap;
	}
	public TemelGeometrikSekildenCember(double yaricap, String renk, boolean dolgu) {
		this.yaricap = yaricap;
		setRenk(renk);
		setDolgu(dolgu);
	}
	// Yar��ap d�nd�r.
	public double getYaricap() {
		return yaricap;
	}
	// Yeni bir yar��ap ata 
	public void setYaricap(double yeniYaricap) {
		yaricap = yeniYaricap;
	}
	// Alan d�nd�r
	public double getAlan() {
		return yaricap*yaricap*Math.PI;
	}
	// �ap d�nd�r 
	public double getCap() {
		return 2*yaricap;
	}
	// �evre d�nd�r
	public double getCevre() {
		return 2*yaricap*Math.PI;
	}
	// �ember bilgisini yazd�r
	public void yazdirCember() {
		System.out.println("�ember," + getOlusturulmaTarihi() + " tarihinde olusturuldu ve yar��ap� " + yaricap + "dir.");
	}
	
		

}
