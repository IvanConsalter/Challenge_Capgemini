package com.ivanconsalter.questions.question01;

import java.util.Scanner;

public class MainLadder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Ladder ladder = new Ladder();
		
		System.out.print("Informe o tamanho da escada: ");
		Integer numberOfSteps = scanner.nextInt();
		
		while(!ladder.checkSize(numberOfSteps)) {
			System.out.println();
			System.out.print("Informe o tamanho da escada: ");
			numberOfSteps = scanner.nextInt();
		}
		
		ladder.createLadder(numberOfSteps);
		
		scanner.close();

	}

}
