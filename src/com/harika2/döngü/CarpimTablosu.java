package com.harika2.döngü;

import java.util.Scanner;

public class CarpimTablosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sayi= new Scanner(System.in);
		System.out.println("Çarpým tablosu verilecek sayiyi giriniz:");
		int carpim = sayi.nextInt();
		for (int i = 0; i <= carpim ; i++) {
			for (int j= 0; j <= 10; j++) {
				
				System.out.print(i + "*" + j + " = " + i * j+ " \t ");
				
			}
			System.out.println(" \t");
		}
	}

}
