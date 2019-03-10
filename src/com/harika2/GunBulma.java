package com.harika2;

import java.util.Scanner;

public class GunBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir gün kýsaltmasý giriniz:");
		String gun = scanner.next();
		
		String bgun = gun.toUpperCase();
		
		switch (bgun) {
		case "PTS":
		case "SL":
		case "CRS":
		case "PRS":
		case "CM":
			System.out.println("Haftaiçi");
			break;
		case "CMT":
		case "PZ":
			System.out.println("Haftasonu");
			break;
			
		default :
			System.out.println("Gün girilmedi");
			break;
		}
		
	}

}


