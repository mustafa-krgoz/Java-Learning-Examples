
public class Kutu {
	
		double en;
		double boy;
		double yukseklik;
		
	public Kutu(double en, double boy, double yukseklik) {
		this.en = en;
		this.boy = boy;
		this.yukseklik = yukseklik;
	}
	public double getHacim() {
		double hacim = (en*boy*yukseklik);
		return hacim;
	}
		
		
}
