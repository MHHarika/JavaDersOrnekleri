package onaltý.mart.com;

import java.util.Scanner;

public class BilgiTablosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] adlar = { "Baþak", "Kumru", "Barýþ" };
		String[] soyadi = { "Çamursoy", "Eker", "Gürü" };
		int[] kilo = { 54, 60, 90 };
		boolean[] ogrenciMi = { true, false, false };
		
		
		for (int i = 0; i < adlar.length; i++) {
			 String yazi ="Ogrencinin Adý :" + adlar[i] + ", " + "Soyadi :" + soyadi[i] + ", " + "kilosu :"
					+ kilo[i] + ", " + "Ogrencilik durumu :";
			if (ogrenciMi[i] == true) {
				System.out.println(yazi + "Kiþi Ögrenci");
			} else {
				System.out.println(yazi + "Kiþi Ögrenci Deðil");
			}
		}
	}
}