package onaltý.mart.com;

import java.util.Random;
import java.util.Scanner;

public class DiziOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Kaç tane rastgele sayý üretmek istersiniz?");
		int sayi = input.nextInt();

		int[] kume = new int[sayi];
		Random rastgele = new Random();
		for (int i = 0; i < sayi; i++) {

			kume[i] = rastgele.nextInt(100);
		}
		int max= kume[0];
		int min = kume [1];
		for (int y = 0; y < kume.length; y++) {
			System.out.println("Dizinin elemanlarý: " + kume[y]);
			
			if (kume[y] > max) {
				max = kume[y];
				
			}
			if  (kume[y] <min) {
				min = kume [y];
			}
			
			
		}
		System.out.println("Dizinin en buyuk elemaný: " + max );
		System.out.println("Dizinin en kucuk elemaný: " + min);
	}

}
