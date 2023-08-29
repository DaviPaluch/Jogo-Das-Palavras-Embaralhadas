package com.example.scrambledWordGame.Embaralhador;

import java.util.Random;

public class EmbaralhadorRandomico implements Embaralhador{

	
	@Override
	public String embaralhador(String palavra) {

		Random r = new Random();
		StringBuilder s = new StringBuilder(palavra);
		
		for (int i = s.length() - 1; i > 0; i--) {
			int j = r.nextInt(i + 1);
			
			char t = s.charAt(i);
			
			s.setCharAt(i, s.charAt(j));
			s.setCharAt(j, t);
			
		}
		
		return s.toString();
	}
	
}
