import java.util.Scanner;

public class ArrayOrtalama {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
    int [] notlar = new int[7];
    int toplam = 0;
    System.out.println("Hoþgeldiniz lütfen notlarýnýz sýrayla giriniz:");
    
    System.out.print("Matematik:");
    notlar[0] = scan.nextInt();
    System.out.print("Fizik:");
    notlar[1] = scan.nextInt();
    System.out.print("Algoritma:");
    notlar[2] = scan.nextInt();
    System.out.print("BBG:");
    notlar[3] = scan.nextInt();
    System.out.print("Ýngilizce:");
    notlar[4] = scan.nextInt();
    System.out.print("Edebiyat:");
    notlar[5] = scan.nextInt();
    System.out.print("Fizik Lab:");
    notlar[6] = scan.nextInt();
   
    
    for(int not : notlar) {
    	toplam+=not;
    }
    System.out.println("Ortlamanýz:" + (toplam/notlar.length));
    
    
	}

}
