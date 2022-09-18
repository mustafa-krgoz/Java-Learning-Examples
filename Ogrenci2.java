
public class Ogrenci2 {
	
	public int ogrenciNo;
	public String isim;
	public float burs;
	public String ders;
	
	public Ogrenci2(int ogrenciNo, String isim, float burs, String ders) {
		this.ogrenciNo = ogrenciNo;
		this.isim = isim;
		this.burs = burs;
		this.ders = ders;
	}
	public Ogrenci2(int ogrenciNo, String isim, float burs) {
		this(ogrenciNo ,isim, burs, "Matematik");
	}
	public void bilgileriGoster() {
		System.out.println(ogrenciNo + " " + isim + " " + burs + " " + ders);
	}

}
