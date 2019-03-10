package com.harika2.döngü;

import java.util.Scanner;

public class HaftaninGunuDongu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Haftanýn günü için bir kýsaltma giriniz: ");
		String gun = input.next();
		
		
		String bgun = gun.toUpperCase();
		while (true){
			switch(bgun) {
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
			System.out.println("Tekrardan denemek ister misin ?");
			String text =input.next();
			
			
			if (text== "evet") {
				
			}
			}
			
		}
	}


