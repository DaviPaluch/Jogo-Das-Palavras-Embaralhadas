package com.example.scrambledWordGame.FabricaEmbaralhadores;

import java.util.Random;

import com.example.scrambledWordGame.Embaralhador.Embaralhador;
import com.example.scrambledWordGame.Embaralhador.EmbaralhadorParImpar;
import com.example.scrambledWordGame.Embaralhador.EmbaralhadorRandomico;
import com.example.scrambledWordGame.Embaralhador.EmbaralhadorInverter;

public class FabricaEmbaralhadores {
	
	public static Embaralhador getEmbaralhador(){
		
		Random r = new Random();
		int i = r.nextInt(3);
		
		switch (i) {
			case 0:
				return new EmbaralhadorRandomico();
			case 1:
				return new EmbaralhadorInverter();
			case 2:
				return new EmbaralhadorParImpar();
			default:
				return new EmbaralhadorRandomico();
		}
	}
}
