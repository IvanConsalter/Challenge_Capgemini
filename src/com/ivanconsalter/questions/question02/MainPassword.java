package com.ivanconsalter.questions.question02;

import java.util.Scanner;

public class MainPassword {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Password createPassword = new Password();
		
		System.out.print("Entre com uma senha: ");
		
		String password = scanner.nextLine();
		
		while(!createPassword.isValidPassword(password)) {
			System.out.print("Entre com uma senha: ");
			password = scanner.nextLine();
		}
		
		
		scanner.close();
	}

}
