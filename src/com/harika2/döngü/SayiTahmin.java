package com.harika2.d�ng�;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gsayi = new Scanner(System.in);
		System.out.println("L�tfen 1 den 10 a kadar bir sayi tahmini giriniz: ");
		int sayi = gsayi.nextInt();
		
		Random rastgele = new Random();
		int tahmin = rastgele.nextInt(10);
		
		
		while (sayi != tahmin) {
			
			
			System.out.println("Tahmin do�ru de�il.Tekrar dene ");
			sayi = gsayi.nextInt();
			
			}
				
			System.out.println("Sayiyi bildin !" + tahmin);}
		
	
			
	}


