
public class CarpimTablosu {

	public static void main(String[] args) {
		// Tablonun ba�l���
		System.out.println("               �arp�m Tablosu");
		
		// Say� ba�l���
		System.out.print("    ");
		for(int j = 1 ; j<=9 ; j++)
			System.out.print( "   " + j);
		System.out.println("\n-------------------------------------------------");
		
		//tablonun g�vdesi
		for(int i =1 ; i<=9 ; i++) {
			System.out.print(i + " | ");
		for(int j = 1 ; j<=9 ; j++) 
			System.out.printf("%4d", i*j);
		
		System.out.println();
		}
	}

}
