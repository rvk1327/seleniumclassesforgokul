package org.testing.chapter1;

public class NestedForLoop {
	
	public static void main(String[] str) {
		
		for(int r=1; r<=3; r++) {
			
			for(int c=1; c<=3; c++) {
				
				System.out.println(r + " => " + c);
			}
			
			System.out.println();
		}
	}

}
