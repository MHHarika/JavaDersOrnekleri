package Mart30.ders.com;

public class IsGuvenlikCalisanlari extends IsmekCalisanlari {
	String kullandiklariGuvAraci;
	boolean EmekliPolisMi ;
	
	@Override
	  public void IseGelme() {
			System.out.println("Guvenlik görevlileri Gece 24:00 da mesai deðiþimi yaparlar.");
		} 
	
	 void DurumaMudahale() {
		System.out.println("Güvenlik çalýþanlarý güvenliði ve huzuru kaçýran olaylara müdahale ederler.");
	}
	
}