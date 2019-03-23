package Mart23.ders.com;

import java.util.Scanner;

public class MetodOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Yaþ için bir doðum tarihi giriniz: ");
		int yil=input.nextInt();
		int yas = yasHesapla(yil);
		System.out.println(yas);
		
	}

	static int yasHesapla(int dogumYil) {
		return 2019 - dogumYil;
	}
}
