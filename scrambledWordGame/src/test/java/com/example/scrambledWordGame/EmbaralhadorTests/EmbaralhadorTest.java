package com.example.scrambledWordGame.EmbaralhadorTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.scrambledWordGame.Embaralhador.EmbaralhadorInverter;
import com.example.scrambledWordGame.Embaralhador.EmbaralhadorParImpar;
import com.example.scrambledWordGame.Embaralhador.EmbaralhadorRandomico;

@SpringBootTest
class EmbaralhadorTest {

	@Test
	void testEmbaralhadorRandomico() {
		
		EmbaralhadorRandomico embaralhadorFacil = new EmbaralhadorRandomico();
		
		
		String p = new String("Palavra...");
		
		String t = new String(embaralhadorFacil.embaralhador(p));
		
		// verifica se todos os caractéres estão presentes no Anagrama
		for(char c: t.toCharArray()) {
			if (p.indexOf(c) == -1) {
				fail();
			}
		}	
	}
	
	
	@Test
	void testEmbaralhadorInverter() {
		
		EmbaralhadorInverter embaralhadorInverter = new EmbaralhadorInverter();
		
		String p = new String("Palavra...");
		
		String t = new String(embaralhadorInverter.embaralhador(p));
		
		assertEquals("...arvalaP", t);
		
	}
	
	
	@Test 
	void testEmbaralhadorParImpar() {
		
		EmbaralhadorParImpar embaralhadorParImpar = new EmbaralhadorParImpar();
		
		String s = new String("Palavra...");
		
		String t = new String(embaralhadorParImpar.embaralhador(s));
		
		assertEquals("aPalrv.a..", t);
		
	}
	

}
