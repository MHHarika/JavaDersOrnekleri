package com.harika2.döngü;

import java.util.Scanner;

public class FaktoriyelProgrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavyedenOku = new Scanner(System.in);
		System.out.println("Faktöriyeli alýnacak sayý nedir ? :");
		int faktoriyeliAlinacakSayi = klavyedenOku.nextInt();
		int sonuc = 1;
		for (int i = 1; i <= faktoriyeliAlinacakSayi; i++) {
		
			System.out.println(sonuc +"*" + i + "=" + sonuc * i );
			sonuc = sonuc * i;
		}
		System.out.println("Son Sonuc =" + sonuc);
		
	}

}
