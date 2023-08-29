package com.example.scrambledWordGame;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.scrambledWordGame.FabricaMecanicaDoJogo.FabricaMecanicaDoJogo;
import com.example.scrambledWordGame.MecanicaDoJogo.Dificuldade;
import com.example.scrambledWordGame.MecanicaDoJogo.MecanicaDoJogo;

import Utilitarios.CustomMessages;

@SpringBootApplication
public class ScrambledWordGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrambledWordGameApplication.class, args);
		
		CustomMessages.helloWord();
		
		System.out.println("\nOlá,");
		System.out.println("Seja bem-vindo ao Jogo: ....");
		System.out.println("\nADIVINHE A PALAVRA CORRETA!");
		
		
		Scanner teclado = new Scanner(System.in);
		
		MecanicaDoJogo mecanicaDoJogo;

		
		boolean rodar = true;
		while(rodar) {
			
			System.out.println("\nDigite a dificuldade do game: `facil`, `medio` ou `dificil`.\nCaso deseje sair digite `sair`: ");
			String t = teclado.nextLine();
			
			if(t.equalsIgnoreCase("sair")) {
				rodar = false;
				break;
			} else {
				try {
					mecanicaDoJogo = FabricaMecanicaDoJogo.getMecanica(Dificuldade.valueOf(t));
					
					while (!mecanicaDoJogo.jogoAcabou()) {
						
						mecanicaDoJogo.iniciarLevel();
						
						while(!mecanicaDoJogo.isLevelFinished()) {
							
							System.out.println("Level: " + mecanicaDoJogo.getLevel());
							System.out.println("Tentativas: " + mecanicaDoJogo.getTentativas());
							System.out.println("Adivinhe qual é a palavra: " + mecanicaDoJogo.getPalavraEmbaralhada());
							System.out.print("Escreva: ");
							String t2  = teclado.nextLine();
							
							if(mecanicaDoJogo.verificarPalpite(t2))
								System.out.println("\nParabéns,você acertou!");
							else
								System.out.println("\nErrou, essa não é a palavra correta.");
						}
						
						
					}
					
					CustomMessages.gameOver();
					
					System.out.println("\nPontuação final: " + mecanicaDoJogo.getPontuacaoFinal());
					
				} catch (Exception e) {
					System.out.println("Digite um valor correto para continuar!");
				}
			}
			
		}
		teclado.close();
		
		CustomMessages.bye();
		
		
	}

}
