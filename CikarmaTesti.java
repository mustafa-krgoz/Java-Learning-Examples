import java.util.Scanner;

public class CikarmaTesti {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
			 
		int sayi1 = (int)(Math.random() *10);
		int sayi2 = (int)(Math.random() *10);
		
	if(sayi1<sayi2) {
		int temp = sayi1;
		sayi1 = sayi2;
		sayi2 = temp;
	}
		System.out.print(sayi1 + " - " + sayi2 + " nedir? ");
		int cevap = scan.nextInt();
	if(sayi1-sayi2 == cevap) {
		System.out.println("Sonu� do�ru, tebrikler!");
	}
	else {
		System.out.println("Cevab�n yanl��!");
		System.out.println(sayi1 + " - " + sayi2 + " sonucu " + (sayi1-sayi2) + " olmal�...");
	}
		
		

	}

}
