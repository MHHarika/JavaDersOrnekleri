

package com.harika2;

import java.util.Scanner ;

public class HaftaninG�n� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Haftan�n G�n� i�in bir k�saltma girin:");
		String text = input.nextLine();
		
		switch(text) {
		case "PTS":
			System.out.println("Pazartesi");
			break;
		case "SL":
			System.out.println("Sal�");
			break;
		case "CRS":
			System.out.println("�ar�amba");
			break;
		case "PRS":
			System.out.println("Per�embe");
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
			System.out.println("G�n Bulunamad�!");
			break;
		
		
	}

}
}

