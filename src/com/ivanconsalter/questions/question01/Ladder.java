package com.ivanconsalter.questions.question01;

import com.ivanconsalter.questions.utils.ShowMessageOnConsole;

public class Ladder implements ShowMessageOnConsole {

	public Boolean checkSize(Integer numberOfSteps) {
		if(numberOfSteps <= 1) {
			this.showMessage("O tamanho da escada deve ser maior do que 1.");
			return false;
		}
		
		return true;
	}
	
	public void createLadder(Integer numberOfSteps) {
		
		for (int i = 1; i <= numberOfSteps; i++) {
			for (int j = 1; j <= numberOfSteps; j++) {
				if ((i + j) > numberOfSteps) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	@Override
	public void showMessage(String message) {
		System.err.println(message);
	}

	@Override
	public void showMessage(Integer passwordSize, Integer passwordMinimum) {		
	}

}
