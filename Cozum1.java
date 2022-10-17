import java.util.Scanner;

public class Cozum1 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		 
	/*	double [] sayilar = new double[5];
		
		System.out.println("Lütfen " + sayilar.length + " sayý giriniz: " );
		for(int i = 0 ; i<sayilar.length ; i++)	{
			sayilar[i] = giris.nextDouble();
		}
		for(int i = 0; i<sayilar.length ; i++) {
			System.out.println(sayilar[i] + "  "); 
		}
		*/
		
		 // Dizi deðer giriþi 2
		
		double [] arr = new double[5];
		
    for(int i = 0 ; i<arr.length ; i++) {
    	System.out.printf("arr[%d]: " , i  );
    	arr[i] = giris.nextDouble();
    	
    }
	for(int i = 0; i<arr.length ; i++) {
		System.out.printf("arr[%d] = %5.1f: "+"\n", i , arr[i]);
	}
		
		
		
		
		
	}
}
		