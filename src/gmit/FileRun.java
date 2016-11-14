package gmit;

import java.util.*;
import java.io.*;

public class FileRun {
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{

		String wordEntered = null;
		String text = null;

		text = "WarAndPeace-LeoTolstoy.txt"; 
		//text = "PoblachtNaHEireann.txt"; 
		//text = "DeBelloGallico.txt";
			
		Map<String, Detail> index = new Reader().parse(text);
		
		System.out.println("A Java Indexing and Dictionary API");
		System.out.println("Robert Deegan - G00320583");
		System.out.println("Set Text is " + text);
		System.out.println("============================================================");
		
		while(wordEntered != "stopsearch"){
			System.out.print("Enter Word You Want to Search for: ");
			wordEntered = console.nextLine();
			System.out.print("\n");
			
			wordEntered = wordEntered.toLowerCase();
			
			System.out.print("Definition of " + index.get(wordEntered).getDefinition());
			System.out.print("\n\nThis Word Appears on pages: " + index.get(wordEntered).getIndices());
			System.out.println("\n============================================================");
		} // while
	
	}
}
