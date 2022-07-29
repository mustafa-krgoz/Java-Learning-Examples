
public class TestCemberIstisnaIsleme {

	public static void main(String[] args) {
		try {
			CemberIstisnaIle c1 = new CemberIstisnaIle(5);
			CemberIstisnaIle c2 = new CemberIstisnaIle(-5);
			CemberIstisnaIle c3 = new CemberIstisnaIle(0);
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
		System.out.println("Oluþturulan nesne sayýsý: " + CemberIstisnaIle.getNesneSayisi());

	}

}
