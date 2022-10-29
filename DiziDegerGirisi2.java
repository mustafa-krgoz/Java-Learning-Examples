import java.util.Scanner;
public class DiziDegerGirisi2 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
	double[]dizi = new double[5];
	for(int i = 0; i<dizi.length ; i++)	{
		System.out.printf("dizi[%d]: " , i);
		dizi[i] = giris.nextDouble();
	}
	for(int i=0; i<dizi.length ; i++) {
		System.out.printf("dizi[%d] = %5.1f" + "\n", i ,dizi[i]);
	}
		
		
	}

}
