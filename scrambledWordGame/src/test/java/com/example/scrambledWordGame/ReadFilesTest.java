package com.example.scrambledWordGame;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import Utilitarios.BancoDePalavras;

class ReadFilesTest {

	@Test
	void test() throws Exception {
		String words = BancoDePalavras.readFileJson("./src/main/resources/palavrasFaceis.json");
        assertNotNull(words);
	}

}
