package Mart23.ders.com;

import java.util.Scanner;

public class MatematikProgramý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen iþlem yapýlacak ilk sayýyý giriniz:");
		int ilksayi = input.nextInt();
		System.out.println("Lütfen iþlem yapýlacak ilk sayýyý giriniz: ");
		int ikincisayi = input.nextInt();
		MatematikIslemleriMetodu input2 = new MatematikIslemleriMetodu();
		
		input2.Toplam(ilksayi, ikincisayi);
		input2.Cikarma(ilksayi,ikincisayi);
		input2.Carpma(ilksayi,ikincisayi);
		input2.Bolme(ilksayi,ikincisayi);
		System.out.println("Metod çaðrýlma sayisi: " + input2.sayac);
	}

}
