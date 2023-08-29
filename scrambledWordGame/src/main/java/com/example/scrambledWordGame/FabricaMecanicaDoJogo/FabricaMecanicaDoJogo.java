package com.example.scrambledWordGame.FabricaMecanicaDoJogo;

import com.example.scrambledWordGame.MecanicaDoJogo.Dificuldade;
import com.example.scrambledWordGame.MecanicaDoJogo.MecanicaDificil;
import com.example.scrambledWordGame.MecanicaDoJogo.MecanicaDoJogo;
import com.example.scrambledWordGame.MecanicaDoJogo.MecanicaFacil;
import com.example.scrambledWordGame.MecanicaDoJogo.MecanicaMedia;

public class FabricaMecanicaDoJogo {

	public static MecanicaDoJogo getMecanica(Dificuldade dificuldade) {
		
		switch (dificuldade) {
		case facil:{			
			return new MecanicaFacil();
		}
		case medio: {
			return new MecanicaMedia();
		}
		case dificil: {
			return new MecanicaDificil();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + dificuldade);
		}
		
		
		
	}
	
}
