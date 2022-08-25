
public class TestBasitCember {

	public static void main(String[] args) {
		// Yarýçapý 1 olan çember oluþturma
		
		BasitCember cember1 = new BasitCember();
		System.out.println("Yarýçapý " + cember1.yaricap + " olan çemberin alaný:" + cember1.getAlan());
		
		// Yarýçapý 25 olan çember oluþturma
		BasitCember cember2 = new BasitCember(25);
		System.out.println("Yarýçapý " + cember2.yaricap + " olan çeberin alaný:" + cember2.getAlan());
		
		// Yarýçapý 125 olan çember oluþturma
		BasitCember cember3 = new BasitCember(125);
		System.out.println("Yarýçapý " + cember3.yaricap + " olan çemberin alaný:" + cember3.getAlan());
		
		// Yarýçapý 5 olan çemberin çevresi
		BasitCember cember4 = new BasitCember(5);
		System.out.println("Yarýçapý " + cember4.yaricap + " olan çemberin çevresi:" + cember4.getCevre());
		
		//Çember yarýçapý deðiþtirme
		cember2.yaricap = 100; // veya cember2.setYaricap(100);
		System.out.println("Yarýçapý " + cember2.yaricap + " olan çeberin alaný:" + cember2.getAlan());

	}

}
