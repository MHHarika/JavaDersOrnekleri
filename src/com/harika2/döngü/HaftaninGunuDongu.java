package com.harika2.d�ng�;

import java.util.Scanner;

public class HaftaninGunuDongu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Haftan�n g�n� i�in bir k�saltma giriniz: ");
		String gun = input.next();
		
		
		String bgun = gun.toUpperCase();
		while (true){
			switch(bgun) {
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
			System.out.println("Tekrardan denemek ister misin ?");
			String text =input.next();
			
			
			if (text== "evet") {
				
			}
			}
			
		}
	}


