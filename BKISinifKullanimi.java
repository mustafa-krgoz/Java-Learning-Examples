
public class BKISinifKullanimi {

	public static void main(String[] args) {
		BKI bki1 = new BKI("Mustafa Karag�z", 20, 1.85, 90);
		System.out.println(bki1.getIsim() + " i�in BKI:" + bki1.getBKI() + " " + bki1.getDurum());
		
		BKI bki2 = new BKI("Mami", 20, 1.74, 84);
		System.out.println(bki2.getIsim() + " i�in BKI:" + bki2.getBKI() + " " + bki2.getDurum());
		
		BKI bki3 = new BKI("Ahmet Ye�eriro�lu", 20, 1.80, 74);
		System.out.println(bki3.getIsim() + " i�in BKI:" + bki3.getBKI() + " " + bki3.getDurum());
		

	}

}
