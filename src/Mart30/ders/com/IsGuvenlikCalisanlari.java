package Mart30.ders.com;

public class IsGuvenlikCalisanlari extends IsmekCalisanlari {
	String kullandiklariGuvAraci;
	boolean EmekliPolisMi ;
	
	@Override
	  public void IseGelme() {
			System.out.println("Guvenlik g�revlileri Gece 24:00 da mesai de�i�imi yaparlar.");
		} 
	
	 void DurumaMudahale() {
		System.out.println("G�venlik �al��anlar� g�venli�i ve huzuru ka��ran olaylara m�dahale ederler.");
	}
	
}