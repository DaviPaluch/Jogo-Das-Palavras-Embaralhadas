package com.example.scrambledWordGame.MecanicaDoJogo;

import com.example.scrambledWordGame.FabricaEmbaralhadores.FabricaEmbaralhadores;
import Utilitarios.BancoDePalavras;



public class MecanicaDificil implements MecanicaDoJogo {
	
	private int tentativas = 1;
	private int level = 0;
	private int pontuacao = 0;
	private boolean adivinhou = false;
	private String palavraEmbaralhada;
	private String palavraSorteada;
	
	

	@Override
	public void iniciarLevel() throws Exception {		
		this.palavraSorteada = BancoDePalavras.readFileJson("./src/main/resources/palavrasFaceis.json");
		this.palavraEmbaralhada = FabricaEmbaralhadores.getEmbaralhador().embaralhador(palavraSorteada);
		
		this.level++;
		this.tentativas = 2;
		this.adivinhou = false;
		
		
	}
	
	@Override
	public boolean isLevelFinished() {
		if(getTentativas() <= 0 || adivinhou) { 
			
			setPontuacao();
			
			return true; 
		}
		else return false;
		
	}

	
	@Override
	public boolean jogoAcabou() {
		
		if(getLevel() > 8 || getTentativas() == 0) return true; 
		else return false;
	}
	
	@Override
	public int getLevel() {
		return this.level;
	}
	
	@Override
		public int getTentativas() {
			return this.tentativas;
	}
	
	@Override
	public String getPalavraEmbaralhada() {
		return this.palavraEmbaralhada;
	}
	
	@Override
	public void setPontuacao() {
		this.pontuacao += (this.tentativas * this.level);
		
	}

	@Override
	public int getPontuacaoFinal() {
		return this.pontuacao;
	}

	@Override
	public boolean verificarPalpite(String palpite) {
		
		if(palpite.equalsIgnoreCase(palavraSorteada)) {
			adivinhou = true;
			return true; 
		} else {
			this.tentativas--;
			return false;
		}
		
	}
	

	
	
	

	

}
