package onalt�.mart.com;

import java.util.Scanner;

public class BilgiTablosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] adlar = { "Ba�ak", "Kumru", "Bar��" };
		String[] soyadi = { "�amursoy", "Eker", "G�r�" };
		int[] kilo = { 54, 60, 90 };
		boolean[] ogrenciMi = { true, false, false };
		
		
		for (int i = 0; i < adlar.length; i++) {
			 String yazi ="Ogrencinin Ad� :" + adlar[i] + ", " + "Soyadi :" + soyadi[i] + ", " + "kilosu :"
					+ kilo[i] + ", " + "Ogrencilik durumu :";
			if (ogrenciMi[i] == true) {
				System.out.println(yazi + "Ki�i �grenci");
			} else {
				System.out.println(yazi + "Ki�i �grenci De�il");
			}
		}
	}
}