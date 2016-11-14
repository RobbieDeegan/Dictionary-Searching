package gmit;

import java.io.*;
import java.util.*;

public class Ignore {
	private Set<String> ignore = new TreeSet<String>();
	
	public Set<String> getWords() throws Exception {
		String line = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("stopwords.txt")));
		
		while ((line = br.readLine()) != null)
			ignore.add(line);
		
		return ignore;
	}
}
