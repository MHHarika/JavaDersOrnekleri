package com.harika2.d�ng�;

import java.util.Scanner;

public class FaktoriyelProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("Fakt�riyeli al�nacak say� nedir ? :");
		int faktoriyeliAlinacakSayi = klavyedenOku.nextInt();
		int sonuc = 1;
		for (int i = 0; i <= faktoriyeliAlinacakSayi; i++) {
		
			System.out.println(sonuc +"*" + i + "=" + sonuc * i );
			sonuc = sonuc * i;
		}
		System.out.println("Son Sonuc =" + sonuc);
		
	}

}
