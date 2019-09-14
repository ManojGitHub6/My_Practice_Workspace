package arrays;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		//Arraylist is used to store the multiple datatype values with out declaring size
		//List<datatype> name=new ArrayList<>();
		
		List<Object> array=new java.util.ArrayList<>();
		array.add("manoj");
		array.add(45467);
		array.add(false);
		
		for(int i=0;i<array.size();i++) {
			
			System.out.println(array.get(i));
		}
	}
}
