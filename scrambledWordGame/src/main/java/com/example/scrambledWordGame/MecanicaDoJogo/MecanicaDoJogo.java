package com.example.scrambledWordGame.MecanicaDoJogo;


public interface MecanicaDoJogo {


	 public void iniciarLevel() throws Exception;
	 public boolean isLevelFinished() throws Exception;
	 public boolean jogoAcabou();
	 public void setPontuacao();
	 public int getLevel();
	 public int getTentativas();
	 public String getPalavraEmbaralhada();
	 public int getPontuacaoFinal();
	 public boolean verificarPalpite(String palpite);


}
