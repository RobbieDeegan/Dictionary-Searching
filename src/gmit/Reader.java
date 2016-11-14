package gmit;

import java.util.*;
import java.io.*;

public class Reader{
	private Map<String, Detail> index = new HashMap<String, Detail>();
	
	public Map<String, Detail> parse(String text) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(text)));
		Set<String> ignore = new Ignore().getWords();
		Map<String, String> dictionary = new Dictionary().getDictionary();
		int lineCounter = 0;
		int page = 1;
		String line = null;
		
		while ((line = br.readLine()) != null){
			lineCounter++;
			if (lineCounter % 40 == 0) {
				page++;
				
				String[] words = line.split(" ");
				for (int i = 0; i < words.length; i++) {
					if (ignore.contains(words[i]))
						continue;
					
					if (index.containsKey(words[i])){
						Detail wd = index.get(words[i]);
					
					if (wd.getIndices().contains(page)){
						continue;
					}
					else
						wd.addIndex(page);
					}
		
					else{
						Detail wd;
						if(dictionary.get(words[i]) == null)
							wd = new Detail("Not Found");
						else
							wd = new Detail(dictionary.get(words[i]));
						
						wd.addIndex(page);
						index.put(words[i], wd);
					} // else
				}//if
			} // if
		} // while
		return index;
	} // parse
} // wordDetail
