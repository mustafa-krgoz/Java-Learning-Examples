import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		boolean asal = true;
		int sayi;
		
		do {
			System.out.print("Bir say� giriniz:");
			 sayi = input.nextInt();
		}
		while(sayi<2);	
		
		for(int i = 2; i<sayi; i++) {
			if(sayi%i==0) {
				asal = false;
				break;
			}
			
		}
	
			if(asal) {
				System.out.println("Girilen say� " + sayi + " asald�r");
			}
			else {
				System.out.println("Girilen say� " + sayi + " asal de�ildir");
			}
	}

}
