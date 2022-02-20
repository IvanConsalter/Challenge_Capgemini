package com.ivanconsalter.questions.question02;

import com.ivanconsalter.questions.utils.ShowMessageOnConsole;

public class Password implements ShowMessageOnConsole{
	
	public final Integer MINIMUM_PASSWORD_SIZE = 6;
	
	public Boolean checkPasswordSize(String password) {
		if(password.length() < this.MINIMUM_PASSWORD_SIZE) {
			return true;
		}
		
		return false;
	}
	
	public Boolean checkIfThereIsDigit(String password) {
		
		int isDigit = 0;
		
		for(int i = 0; i <= 9; i++) {
			
			String convertStringToNumber = Integer.toString(i);
			
			if(password.contains(convertStringToNumber)) {
				isDigit ++;
			}
		}
		
		if(isDigit < 1) {
			return true;
		}
		
		return false;
	}
	
	public Boolean checkLowercaseLetter(String password) {
		
		int isLowercase = 0;
		
		for(int i = 97; i <= 122; i++) {
			
			char intToChar = (char)i;
			String convertCharToString = Character.toString(intToChar);
			
			if(password.contains(convertCharToString)) {
				isLowercase ++;
			}
		}
		
		if(isLowercase < 1) {
			return true;
		}
		
		return false;
	}
	
	public Boolean checkUppercaseLetter(String password) {
		
		int isUppercase = 0;
		
		for(int i = 65; i <= 90; i++) {
			
			char intToChar = (char)i;
			String convertCharToString = Character.toString(intToChar);
					
			if(password.contains(convertCharToString)) {
				isUppercase ++;
			}
		}
		
		if(isUppercase < 1) {
			return true;
		}
		
		return false;
	}
	
	public Boolean checkSpecialCharacters(String password) {
		
		if(
			!(
				password.contains("!") || password.contains("@") ||
				password.contains("#") || password.contains("$") ||
				password.contains("%") || password.contains("^") ||
				password.contains("&") || password.contains("*") ||
				password.contains("(") || password.contains(")") ||
				password.contains("-") || password.contains("+")
			) 			
		) {
			return true;
		}
		
		return false;
	}
	
	public Boolean isValidPassword(String password) {
		
		if(this.checkPasswordSize(password)) {
			this.showMessage("Senha deve ter no mínimo 6 caracteres!");
			this.showMessage(password.length(), MINIMUM_PASSWORD_SIZE);
			return false;
		}
		else if(this.checkIfThereIsDigit(password)) {
			this.showMessage("Senha deve ter no mínimo 1 digito!");
			return false;
		}
		else if(this.checkLowercaseLetter(password)) {
			this.showMessage("Senha deve ter no mínimo 1 letra minúscula!");
			return false;
		}
		else if(this.checkUppercaseLetter(password)) {
			this.showMessage("Senha deve ter no mínimo 1 letra maiúcula!");
			return false;
		}
		else if(this.checkSpecialCharacters(password)) {
			this.showMessage("Senha deve ter no mínimo 1 caractere especial!");
			return false;
		}
		else {
			this.showMessage("Parabéns! Senha válida");
			return true;
		}
	}

	@Override
	public void showMessage(String message) {
		System.err.println(message);
	}

	@Override
	public void showMessage(Integer passwordSize, Integer passwordMinimum) {
		System.out.println("Ainda faltam " + (passwordMinimum - passwordSize) + " letras!");
	}

}
