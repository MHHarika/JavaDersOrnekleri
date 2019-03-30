package Mart24.ders.com;

import java.util.Scanner;

public class MetodAsiriYukleme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int topla1 = topla(3, 2);
		int topla2 = topla(3, 2, 1);
		int topla3 = topla ("3","2");
		System.out.println(topla1);
		System.out.println(topla2);
		System.out.println(topla3);
		
	}

	static int topla(int s1, int s2) {
		int sonuc = s1 + s2;
		return sonuc;
	}

	static int topla(int s1, int s2, int s3) {
		int sonuc = s1 + s2 + s3;
		return sonuc;
	}
	
	static int topla(String s1,String s2) {
	    int sonuc = Integer.parseInt(s1) + Integer.parseInt(s2);
		return sonuc;
		
	}
}
