import java.util.Scanner;
public class BolmeIstisnaIle {
	
	public static int bolme(int sayi1, int sayi2) {
	  if(sayi2==0) {
		throw new ArithmeticException("B�len s�f�r olamaz.");
	  }
	  		return sayi1 / sayi2;
	}

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
			System.out.print("�ki tamsay� giriniz:");
				int sayi1 = giris.nextInt();
				int sayi2 = giris.nextInt();
			try {
				int sonuc = bolme(sayi1, sayi2);
				System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc + " dir.");
				
			}
			catch(ArithmeticException ex) {
				System.out.println("�stisna bir tamsay�" 
						+ " s�f�ra b�l�nemez.");
			}
			System.out.println("Y�r�tme devam ediyor...");

	}

}
