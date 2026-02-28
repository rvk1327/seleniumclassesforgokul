package org.testing.chapter1;

public class ConditionalStatements {
	
	public static void main(String[] str) {
		
		int x = 300 , y = 300;
		
		//check whether the value of x is greater than 50
		
		if (x > 50) {
			
			System.out.println("X is greater than 50");
		}
		
		//compare x and y
		
		if (x > y) { // 300 > 300 : F
			
			System.out.println("X is greater than Y");
		
		}else {
			
			System.out.println("Y is greater than X");
		}
		
		//compare x and y with alternate way
		
		if (x > y) { // 300 > 300
			
			System.out.println("X is greater than Y");
		
		}else if (y > x) { // 300 > 300
			
			System.out.println("Y is greater than X");
		
		}else {
			
			System.out.println("Both values are equal");
		}
		
		//Switch statement
		//you can pass any data type values except boolean or conditions
		
		String z = "R";
		
		switch(z) {
			
		case "t":
			
			System.out.println("Triangle");  
			break;
			
		case "r":
			
			System.out.println("Rectangle"); //Rectangle
			break;
			
		case "s":
			
			System.out.println("Square"); // Square
			break;
			
		/*default:
			
			System.out.println("Invalid Input"); // Invalid Input
			break; */
		
		}
		
	}

}




