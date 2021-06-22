package week2.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	
	// LinkedHashSet - order in which u added
	// HashSet - Random
	// TreeSet - ASCII
	public static void main(String[] args) {
		Set<String> iphoneModels = new TreeSet<String>();
		System.out.println(iphoneModels.size());
		
		// add items into set 
		
		iphoneModels.add("6");
		iphoneModels.add("6S");
		iphoneModels.add("5C");
		iphoneModels.add("X");
		iphoneModels.add("4");
		iphoneModels.add("6S");
		iphoneModels.add("3");
		
		System.out.println(iphoneModels.size());
		// Print all items
		
		for (String eachIphone : iphoneModels) {
			System.out.println(eachIphone);
		}
		//Delete an item from the set
		//iphoneModels.remove("6S");
		
		// Push set into list to get items
		List<String> models = new ArrayList<String>();
		models.addAll(iphoneModels);
		
		System.out.println(models.get(0));
		
		

		
	}
	

}