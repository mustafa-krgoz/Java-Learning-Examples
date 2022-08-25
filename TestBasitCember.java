
public class TestBasitCember {

	public static void main(String[] args) {
		// Yar��ap� 1 olan �ember olu�turma
		
		BasitCember cember1 = new BasitCember();
		System.out.println("Yar��ap� " + cember1.yaricap + " olan �emberin alan�:" + cember1.getAlan());
		
		// Yar��ap� 25 olan �ember olu�turma
		BasitCember cember2 = new BasitCember(25);
		System.out.println("Yar��ap� " + cember2.yaricap + " olan �eberin alan�:" + cember2.getAlan());
		
		// Yar��ap� 125 olan �ember olu�turma
		BasitCember cember3 = new BasitCember(125);
		System.out.println("Yar��ap� " + cember3.yaricap + " olan �emberin alan�:" + cember3.getAlan());
		
		// Yar��ap� 5 olan �emberin �evresi
		BasitCember cember4 = new BasitCember(5);
		System.out.println("Yar��ap� " + cember4.yaricap + " olan �emberin �evresi:" + cember4.getCevre());
		
		//�ember yar��ap� de�i�tirme
		cember2.yaricap = 100; // veya cember2.setYaricap(100);
		System.out.println("Yar��ap� " + cember2.yaricap + " olan �eberin alan�:" + cember2.getAlan());

	}

}
