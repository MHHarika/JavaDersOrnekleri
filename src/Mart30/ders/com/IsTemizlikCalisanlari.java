package Mart30.ders.com;

public class IsTemizlikCalisanlari extends IsmekCalisanlari {
	String Gorev;
	String KullandiklariMalzeme;
	String CalistiklariKat;
	
	@Override
	  public void IseGelme() {
			System.out.println("Temizlik g�revlileri sabah 06:00 da i�e gelirler.S�n�flar� ve kantini temizleyerek g�ne haz�rlarlar.");
		} 
	
	 void YerTemizleme() {
		System.out.println("Temizlik �al��anlar� her ak�am s�n�flar�n ve ortak alanlar�n yerlerini temizler.");
	}
}