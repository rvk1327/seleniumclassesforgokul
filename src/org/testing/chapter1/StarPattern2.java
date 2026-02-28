package org.testing.chapter1;

public class StarPattern2 {

	public static void main(String[] str) {
		
		for(int r=4; r>=1; r--) {
			
			for(int c=r; c<=4; c++) {
				
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	}
}
