package com.harika2.d�ng�;

import java.util.Scanner;

public class BolenleriniBulma {

	public static void main(String[] args) {
		Scanner girilenSayi = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz ? :");
		int bSayisi = girilenSayi.nextInt();
		for (int i = 2; i <= bSayisi; i++) {
			if (bSayisi % i == 0) {
				System.out.println("Girilen Say�n�n B�lenleri"+ i);
				
			}
			
		}
	}

}
