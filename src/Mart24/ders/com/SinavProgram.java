package Mart24.ders.com;

import java.util.Random;

public class SinavProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rastgele = new Random();
		int IslemSayisi = rastgele.nextInt(10);
		int IslemTuru = rastgele.nextInt(2);
		
		SinavIslemleriMetodlar input = new SinavIslemleriMetodlar();

		switch (IslemTuru) {
		case 1:
			for(int k=1; k<= IslemSayisi ; k++) {
			int Sayi = rastgele.nextInt(10);
			int y = input.Faktoriyel(Sayi);
			System.out.println("Ýþlem yapýlan sayi " + Sayi +" Yapýlan iþlem faktöriyel ve sonucu "+ y + " random iþlem sayisi " + IslemSayisi);
			}
			break;
		case 2:
			for(int h=1 ; h<= IslemSayisi ; h++) {
			int Sayi = rastgele.nextInt(10);
			int x = input.Fonksiyon(Sayi);
			System.out.println("Ýþlem yapýlan sayi "+ Sayi + "Yapýlan iþlem Fonksiyon ve sonucu " + x + " random iþlem sayisi " + IslemSayisi);
			}
			break;
		}

	}
}