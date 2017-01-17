package QAInfotech.Session_2;

import java.util.HashMap;
import java.util.Set;

public class entrySetMap {
	
	public void newMap()
	{
		 HashMap<String, Comparable> map = new HashMap<String, Comparable>();
	      
		   // populate hash map
		   map.put("FirstName", "Shikha");
		   map.put("LastName", "Mudgal");
		   map.put("Employee ID", 3427);
		      
		   // create set view for the map
		   Set set=map.entrySet();
		      
		   // check set values
		   System.out.println("Set values: " + set);
	}

	public static void main(String[] args) {
		
		entrySetMap obj = new entrySetMap();
		obj.newMap();
	}

}
