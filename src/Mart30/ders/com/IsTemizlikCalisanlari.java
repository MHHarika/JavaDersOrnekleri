package Mart30.ders.com;

public class IsTemizlikCalisanlari extends IsmekCalisanlari {
	String Gorev;
	String KullandiklariMalzeme;
	String CalistiklariKat;
	
	@Override
	  public void IseGelme() {
			System.out.println("Temizlik görevlileri sabah 06:00 da iþe gelirler.Sýnýflarý ve kantini temizleyerek güne hazýrlarlar.");
		} 
	
	 void YerTemizleme() {
		System.out.println("Temizlik çalýþanlarý her akþam sýnýflarýn ve ortak alanlarýn yerlerini temizler.");
	}
}