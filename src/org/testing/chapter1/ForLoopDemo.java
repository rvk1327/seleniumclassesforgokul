package org.testing.chapter1;

public class ForLoopDemo {

	public static void main(String[] str) {
		
		//simple for loop
		
		for(int i=1; i<=5; i++) {
			
			System.out.println(i);
		}
		
		for(int i=11; i<=16; i++) {
			
			System.out.println(i);
		}
		
		for(int i=20; i<=40; i+=4) {
			
			System.out.println(i);
		}
		
		for(int i=40; i>=20; i-=4) {
			
			System.out.println(i);
		}
		
		for(char c='M'; c>='A'; c--) {
			
			System.out.println(c);
		}
	}
}
