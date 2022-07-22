
public class TestCemberDikdortgen {

	public static void main(String[] args) {
	  TemelGeometrikSekildenCember cember = new TemelGeometrikSekildenCember(1);
	  	System.out.println("Bir çember:" + cember.toString());
	  	System.out.println("Renk:" + cember.getRenk());
	  	System.out.println("Yarýçap:" + cember.getYaricap());
	  	System.out.println("Alan:" + cember.getAlan());
	  	System.out.println("Çap:" + cember.getCap());
	  	
	  TemelGeometrikSekildenDikdortgen dortgen = new TemelGeometrikSekildenDikdortgen(2,4);
	  	System.out.println("\nBir dikdörtgen:" + dortgen.toString());
	  	System.out.println("Alan:" + dortgen.getAlan());
	  	System.out.println("Çevre:" + dortgen.getCevre());
	  
	}

}
