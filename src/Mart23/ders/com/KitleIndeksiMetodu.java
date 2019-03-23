package Mart23.ders.com;

import java.util.Scanner;

public class KitleIndeksiMetodu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz: ");
		float kilo = input.nextFloat();
		System.out.println("Boyunuzu giriniz: ");
		float boy = input.nextFloat();
		float vki = vkihesapla(kilo,boy);
		System.out.println(vki);
		
	}
	
	static float vkihesapla(float KullaniciKilo, float KullaniciBoy) {
		float sonuc= KullaniciKilo /(KullaniciBoy * KullaniciBoy);
		if (sonuc < 15 ) {
			System.out.println("çok ciddi derecede düþük kilolu.Saðlýk tehlikesi var !");
		}
		else if (sonuc>15 && sonuc < 16 ) {
			System.out.println("Ciddi derecede düþük kilolu.Kilo almalý !");
		}
		else if (sonuc >16 && sonuc < 18.5 ) {
			System.out.println("Düþük kilolu ");
		}
		else if (sonuc >18.5 && sonuc < 25) {
			System.out.println("Normal kilolu");
		}
		else if (sonuc >25 && sonuc < 30) {
			System.out.println("Fazla kilolu");
		}
		else if (sonuc >30 && sonuc < 35) {
			System.out.println("1. derece obez");
		}
		else if (sonuc >35 && sonuc < 40) {
			System.out.println("2. derece obez");
		}
		else {
			System.out.println("3. derece obez");
		}
		return sonuc;
	}

}
