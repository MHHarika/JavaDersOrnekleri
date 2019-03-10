package com.harika2.döngü;

import java.util.Scanner;

public class ekok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sayi = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		int isayi = sayi.nextInt();
		for (int i = 2; i <= isayi; i++) {
			if (isayi % i == 0) {
				
				
				isayi = isayi / i;
				System.out.println("Girilen Sayinin Ekoklarý:" + i);
				i--;
			}
			
		}
	}

}
