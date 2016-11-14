package gmit;

import java.util.*;

public class Detail {
	
	private List<Integer> pages = new ArrayList<Integer>();
	private String definition;
	
	public Detail(String definition) {
		this.definition = definition;
	}
	
	public String getDefinition() {
		return definition;
	}
	
	public void setDefintion(String definition) {
		this.definition = definition;
	}
	
	public void addIndex(int page){
		pages.add(page);
	}
	
	public List<Integer> getIndices() {
		return pages;
	}
}
