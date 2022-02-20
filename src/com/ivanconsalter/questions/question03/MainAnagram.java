package com.ivanconsalter.questions.question03;

import java.util.Scanner;

public class MainAnagram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Anagram anagramPairs = new Anagram();
		
		System.out.print("Entre com uma palavra: ");
		String string = scanner.nextLine();
		
		System.out.println("Essa palavra tem " + anagramPairs.checkSubstringPairs(string) + " pares.");
		
		scanner.close();
	}

}
