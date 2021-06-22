
package week2.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileShop {

	public static void main(String[] args) {
		// Creating a list
		List<String> mobiles = new ArrayList<String>();
		// To get the size
		int size = mobiles.size();
		System.out.println(size);
		
		// Add items to list
		mobiles.add("Samsung S9");
		mobiles.add("IPhone X");
		mobiles.add("One Plus 6");
		
		//System.out.println(mobiles.size());
		//System.out.println(mobiles.get(0));
		
		// Delete an item from the list
		mobiles.remove("IPhone X");
		//System.out.println(mobiles.size());
		
		mobiles.add("IPhone 10");
		/*for (String eachMobile : mobiles) {
			System.out.println(eachMobile);
		}*/
		
		// to sort the list
		Collections.sort(mobiles);
		
		// To display all the mobiles
		for (String eachMobile : mobiles) {
			System.out.println(eachMobile);
		}
		// To delete all the items in the list
		
		mobiles.clear();
		System.out.println(mobiles.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}









}