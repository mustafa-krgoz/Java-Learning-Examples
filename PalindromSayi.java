
public class PalindromSayi {
	/*
	 	Palindrom sayý örnek = 121, 555;
	 	121 % 10 = 1 , tersSayi = 1 , 121 / 10 = 12 (int)
	 	12 % 10 = 2 , tersSayi = tersSayi * 10 + kalan (1 x 10 + 1) , 12 / 10 = 1
	 	1 % 10 = 1, tersSayi = tersSayi * 10 + kalan(12 x 10 + 1 ), 1 / 10 = 0.1 ==> 0
	 																						*/
	public static void main(String[] args) {
	
		System.out.println(isPalindrom(121));
	}
	
	public static boolean isPalindrom(int input) {
		int temp, tersSayi=0, kalan;
		temp = input;
		
		while(temp!=0) {
			kalan = temp % 10;
			tersSayi = tersSayi * 10 + kalan;
			temp/=10;
		}
		  if(input == tersSayi) 
			  return true;
		  else
			  return false;
		
	}

}
