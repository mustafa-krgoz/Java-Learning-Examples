import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	   System.out.print("�lk say�y� giriniz:");
	   	 int sayi1 = scan.nextInt();
	   System.out.print("�kinci say�y� giriniz:");
	   	 int sayi2 = scan.nextInt();
	   
	   System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz:");
	   System.out.println("1)Toplama\n2)��karma\n3)�arpma\n4)B�lme");
	   System.out.print("Se�iminiz:");
	   	 int secim = scan.nextInt();
	   	 
	 if(secim==1) {
		 System.out.println("Toplam:" + (sayi1+sayi2));
	 }
	 else if(secim==2) {
		 System.out.println("��karma:" + (sayi1-sayi2));
	 }
	 else if(secim==3) {
		 System.out.println("�arpma:" + (sayi1*sayi2));
	 }
	 else if(secim==4) {
		 if(sayi2==0) {
			 System.out.println("Sonu� tan�ms�zd�r!");
		 }
		 else {
			 System.out.println("B�lme:" + (sayi1/sayi2));
		 }
	 }
	 else {
		 System.out.println("Ge�ersiz bir i�lem girdiniz tekrar deneyiniz!");
	 }
	 
	 
		

	}

}
