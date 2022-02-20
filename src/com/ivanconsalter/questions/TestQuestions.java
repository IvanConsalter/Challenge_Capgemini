package com.ivanconsalter.questions;

import java.util.Scanner;

import com.ivanconsalter.questions.question01.Ladder;
import com.ivanconsalter.questions.question02.Password;
import com.ivanconsalter.questions.question03.Anagram;

public class TestQuestions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Integer answer = 0;

		do {

			System.out.println("Qual questão deseja testar?:");
			System.out.println("1 - Questão 01");
			System.out.println("2 - Questão 02");
			System.out.println("3 - Questão 03");
			System.out.println("4 - Sair");

			System.out.println();
			System.out.print("Digite um código: ");
			answer = scanner.nextInt();
			scanner.nextLine();

			switch (answer) {
			case 1:
				runQuestion01(scanner);
				break;

			case 2:
				runQuestion02(scanner);
				break;

			case 3:
				runQuestion03(scanner);
				break;

			case 4:
				System.out.println("Obrigado por testar!");
				break;

			default:
				System.err.println("Este código não existe!");
				System.out.println();
				break;
			}

		} while (answer != 4);

		scanner.close();
	}

	public static void runQuestion01(Scanner scanner) {

		Ladder ladder = new Ladder();

		System.out.print("Informe o tamanho da escada: ");
		Integer numberOfSteps = scanner.nextInt();

		while (!ladder.checkSize(numberOfSteps)) {
			System.out.print("Informe o tamanho da escada: ");
			numberOfSteps = scanner.nextInt();
		}

		ladder.createLadder(numberOfSteps);
		System.out.println();
	}

	public static void runQuestion02(Scanner scanner) {

		Password createPassword = new Password();

		System.out.print("Entre com uma senha: ");

		String password = scanner.nextLine();

		while (!createPassword.isValidPassword(password)) {
			System.out.print("Entre com uma senha: ");
			password = scanner.nextLine();
		}

		System.out.println();

	}

	public static void runQuestion03(Scanner scanner) {

		Anagram anagramPairs = new Anagram();

		System.out.print("Entre com uma palavra: ");
		String string = scanner.nextLine();

		System.out.println("Essa palavra tem " + anagramPairs.checkSubstringPairs(string) + " pares.");
		System.out.println();

	}

}
