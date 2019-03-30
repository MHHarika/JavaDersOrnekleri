package Mart24.ders.com;

public class SinavIslemleriMetodlar {

	int Fonksiyon(int x) {

		int sonuc = (x * x) * x + (x - 3) * (x - 3) + 5;

		return sonuc;

	}

	int Faktoriyel(int x) {
		int sonuc = 1;

		for (int i = 1; i <= x; i++) {
			sonuc = sonuc * i;
		}
		return sonuc;
	}

}
