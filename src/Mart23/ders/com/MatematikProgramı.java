package Mart23.ders.com;

import java.util.Scanner;

public class MatematikProgram� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen i�lem yap�lacak ilk say�y� giriniz:");
		int ilksayi = input.nextInt();
		System.out.println("L�tfen i�lem yap�lacak ilk say�y� giriniz: ");
		int ikincisayi = input.nextInt();
		MatematikIslemleriMetodu input2 = new MatematikIslemleriMetodu();
		
		input2.Toplam(ilksayi, ikincisayi);
		input2.Cikarma(ilksayi,ikincisayi);
		input2.Carpma(ilksayi,ikincisayi);
		input2.Bolme(ilksayi,ikincisayi);
		System.out.println("Metod �a�r�lma sayisi: " + input2.sayac);
	}

}
