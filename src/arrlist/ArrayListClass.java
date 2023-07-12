package arrlist;

import java.util.ArrayList;

public class ArrayListClass {
	ArrayList<String> cars = new ArrayList<String>();
	public static void main(String[] args) {
		//create arraylist of type string
		
		ArrayListClass ls= new ArrayListClass();
		ls.addToList();
		
		//get first element 
		
		ls.getfirt();

	}
	void getfirt() {
    	System.out.println(cars.get(0));
    }
	 void addToList() {
		
		cars.add("Volvo");
		cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	}

}
