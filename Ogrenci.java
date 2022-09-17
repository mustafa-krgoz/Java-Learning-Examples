
public class Ogrenci {
	 
		int ogrenciNo;
		String isim;
		float burs;
		
	public Ogrenci(int o, String i, float b) {
		ogrenciNo = o;
		isim = i;
		burs = b;
	}
	void bilgileriGoster() {
		System.out.println(ogrenciNo + " " + isim + " " + burs);
	}

}
