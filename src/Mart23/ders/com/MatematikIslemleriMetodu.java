package Mart23.ders.com;

public class MatematikIslemleriMetodu {
	
 
int sayac = 0;
  int Toplam(int a,int b) {
		int sonuc = a + b;
		sayac ++;
		System.out.println("Toplama i�lemi sonucu: " + sonuc);
		return sonuc;
	}

  int Cikarma(int a,int b) {
	  int sonuc = a - b;
	  sayac ++;
	  System.out.println("��karma i�lemi sonucu: " + sonuc);
	  return sonuc;
	  
  }

  int Carpma(int a ,int b) {
	  int sonuc = a * b;
	  sayac ++;
	  System.out.println("�arpma i�lemi sonucu: " + sonuc);
	  return sonuc;
  }
  
  float Bolme(int a ,int b) {
	 
	  if (b == 0) {
		  System.out.println("Tan�ms�zl�k..L�tfen 0 dan farkl� bir b�l�m giriniz.");
		  return -1;
	  }
	  
	  float sonuc = a / b;
	  sayac ++;
	  System.out.println("B�lme i�lemi sonucu: " + sonuc);
	  return sonuc;
	 
  }
  
}
