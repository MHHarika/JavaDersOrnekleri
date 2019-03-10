

package com.harika2;

import java.util.Scanner ;

public class HaftaninGünü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Haftanýn Günü için bir kýsaltma girin:");
		String text = input.nextLine();
		
		switch(text) {
		case "PTS":
			System.out.println("Pazartesi");
			break;
		case "SL":
			System.out.println("Salý");
			break;
		case "CRS":
			System.out.println("Çarþamba");
			break;
		case "PRS":
			System.out.println("Perþembe");
			break;
		case "CM":
			System.out.println("Cuma");
			break;
		case "CMT":
			System.out.println("Cumartesi");
			break;
		case "PZ":
			System.out.println("PAZAR");
			break;
		default:
			System.out.println("Gün Bulunamadý!");
			break;
		
		
	}

}
}

