package org.testing.chapter1;

public class CalculateGrossPay {

	public static void main(String[] str) {
		
		double basic_pay = 25000.00;
		double gross_pay = 0.0;
		
		if(basic_pay <= 10000.00) {
			
			gross_pay = basic_pay + ((basic_pay*20)/100) + ((basic_pay * 5)/100);
	
		} else if ((basic_pay > 10000.00) && (basic_pay <= 20000.00)) {
			
			gross_pay = basic_pay + ((basic_pay * 25)/100) + ((basic_pay *6)/100);
		
		}else {
			
			gross_pay = basic_pay + ((basic_pay * 30)/100) + ((basic_pay * 7)/100);
		}
		
		System.out.println("Basic Pay : " + basic_pay);
		
		System.out.println("Gross Pay : " + gross_pay);
		
	}
}
