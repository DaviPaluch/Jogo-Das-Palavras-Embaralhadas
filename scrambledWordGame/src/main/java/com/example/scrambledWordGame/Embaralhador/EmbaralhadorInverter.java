package com.example.scrambledWordGame.Embaralhador;

public class EmbaralhadorInverter implements Embaralhador{

	@Override
	public String embaralhador(String palavra) {
		
		StringBuilder s = new StringBuilder(palavra);
		StringBuilder temp = new StringBuilder();
		
		for(int i = s.length() - 1; i >= 0 ;  i--) {
			temp.append(s.charAt(i));
		}
		
		return temp.toString();
	}
}
