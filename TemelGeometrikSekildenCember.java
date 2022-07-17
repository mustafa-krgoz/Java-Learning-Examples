
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
	// Yarýçap döndür.
	public double getYaricap() {
		return yaricap;
	}
	// Yeni bir yarýçap ata 
	public void setYaricap(double yeniYaricap) {
		yaricap = yeniYaricap;
	}
	// Alan döndür
	public double getAlan() {
		return yaricap*yaricap*Math.PI;
	}
	// Çap döndür 
	public double getCap() {
		return 2*yaricap;
	}
	// Çevre döndür
	public double getCevre() {
		return 2*yaricap*Math.PI;
	}
	// Çember bilgisini yazdýr
	public void yazdirCember() {
		System.out.println("Çember," + getOlusturulmaTarihi() + " tarihinde olusturuldu ve yarýçapý " + yaricap + "dir.");
	}
	
		

}
