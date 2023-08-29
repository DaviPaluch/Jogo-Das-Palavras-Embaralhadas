package com.example.scrambledWordGame.Embaralhador;

public class EmbaralhadorParImpar implements Embaralhador{

	@Override
	public String embaralhador(String palavra) {
		
		StringBuilder p = new StringBuilder();
		
		
		for(int i = 1; i < palavra.length(); i++ ) {
			
			
			if(i % 2 != 0 ) {
				
				char cImpar = palavra.charAt(i);
				char cPar = palavra.charAt(i - 1);
				p.insert(i - 1, cImpar);
				p.insert(i, cPar);
			}

		}
		return p.toString();
	}
}
