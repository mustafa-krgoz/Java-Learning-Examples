
public class TestTv {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.ac();
		tv1.setKanal(30);
		tv1.setSes(3);
		
		TV tv2 = new TV();
		tv2.ac();
		tv2.kanalYukari();
		tv2.kanalYukari();
		tv2.sesArtir();
		
		System.out.println("tv1'in ses seviyesi: " + tv1.sesSeviyesi + " tv1'in kanalı:" + tv1.kanal);
		System.out.println("tv2'nin ses seviyesi: " + tv2.sesSeviyesi + " tv2'nin kanalı:" + tv2.kanal);
		
		

	}

}
