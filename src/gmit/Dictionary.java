package gmit;

import java.io.*;
import java.util.*;

public class Dictionary {
	private Map<String, String> dictionary = new HashMap<String,String>();
	
	public Map<String, String> getDictionary() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("dictionary.csv")));
		
		String line = null;
		String word = null;
		
		while ((line = br.readLine()) != null){
			line = line.substring(1);
			word = line.split("\",")[0];  // ("\",")
			word = word.toLowerCase();
			
			dictionary.put(word, line);
		}
		return dictionary;
	}
}