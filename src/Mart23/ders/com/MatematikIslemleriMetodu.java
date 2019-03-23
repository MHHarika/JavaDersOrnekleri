package Mart23.ders.com;

public class MatematikIslemleriMetodu {
	
 
int sayac = 0;
  int Toplam(int a,int b) {
		int sonuc = a + b;
		sayac ++;
		System.out.println("Toplama iþlemi sonucu: " + sonuc);
		return sonuc;
	}

  int Cikarma(int a,int b) {
	  int sonuc = a - b;
	  sayac ++;
	  System.out.println("Çýkarma iþlemi sonucu: " + sonuc);
	  return sonuc;
	  
  }

  int Carpma(int a ,int b) {
	  int sonuc = a * b;
	  sayac ++;
	  System.out.println("Çarpma iþlemi sonucu: " + sonuc);
	  return sonuc;
  }
  
  float Bolme(int a ,int b) {
	 
	  if (b == 0) {
		  System.out.println("Tanýmsýzlýk..Lütfen 0 dan farklý bir bölüm giriniz.");
		  return -1;
	  }
	  
	  float sonuc = a / b;
	  sayac ++;
	  System.out.println("Bölme iþlemi sonucu: " + sonuc);
	  return sonuc;
	 
  }
  
}
