
public class CarpimTablosuIndisleri {

	public static void main(String[] args) {
		// Tablonun baþlýðý
		System.out.println("           Çarpým Tablosu Ýndisleri");
		
		// Sayý baþlýðý
		System.out.print("    ");
		for(int j=1; j<=9; j++)
			System.out.print("  " + j);
		System.out.println("\n-------------------------------------");
		
		// Gövde baþlýðý
		
		for(int i = 1; i<=9; i++) {
		  System.out.print(i + " | ");
			for(int j = 1; j<=9; j++)
		  System.out.printf(" %d%d" , i , j);
			
		System.out.println();
		}

	}

}
