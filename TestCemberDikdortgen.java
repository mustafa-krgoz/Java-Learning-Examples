
public class TestCemberDikdortgen {

	public static void main(String[] args) {
	  TemelGeometrikSekildenCember cember = new TemelGeometrikSekildenCember(1);
	  	System.out.println("Bir �ember:" + cember.toString());
	  	System.out.println("Renk:" + cember.getRenk());
	  	System.out.println("Yar��ap:" + cember.getYaricap());
	  	System.out.println("Alan:" + cember.getAlan());
	  	System.out.println("�ap:" + cember.getCap());
	  	
	  TemelGeometrikSekildenDikdortgen dortgen = new TemelGeometrikSekildenDikdortgen(2,4);
	  	System.out.println("\nBir dikd�rtgen:" + dortgen.toString());
	  	System.out.println("Alan:" + dortgen.getAlan());
	  	System.out.println("�evre:" + dortgen.getCevre());
	  
	}

}
