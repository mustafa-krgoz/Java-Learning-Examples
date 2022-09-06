
public class BKI {
	
	public String isim;
	public int yas;
	public double boy;
	public double agirlik;
	
	public BKI(String isim, int yas, double boy, double agirlik) {
		this.isim = isim;
		this.yas = yas;
		this.boy = boy;
		this.agirlik = agirlik;
	}
	public BKI(String isim, double boy, double agirlik) {
		this(isim, 20, boy, agirlik);
	}
	public double getBKI() {
		double bki = agirlik / (boy*boy);
		return Math.round(bki*100)/100.0;
	}
	public String getDurum() {
		double bki = getBKI();
		if(bki<18.5)
			return "Zayýf";
		else if(bki<25)
			return "Normal";
		else if(bki<30)
			return "Kilolu";
		else
			return "Obez";
	}
	public String getIsim() {
		return isim;
	}
	public int getYas() {
		return yas;
	}
	public double getBoy() {
		return boy;
	}
	public double getAgirlik() {
		return agirlik;
	}

}
