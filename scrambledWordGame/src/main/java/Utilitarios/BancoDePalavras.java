package Utilitarios;



import java.nio.file.Path;
import java.util.List;
import java.util.Random;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class BancoDePalavras {

	public static String readFileJson(String path) throws Exception{
		
		ObjectMapper om = new ObjectMapper();
		TypeReference<List<String>> typeReference = new TypeReference<List<String>>() {};
		Path testFilePath = Path.of(path);
		List<String> words = om.readValue(testFilePath.toFile(), typeReference);
		Random r = new Random();
		int t = r.nextInt(words.size());
		return words.get(t).toString();
	}
}
