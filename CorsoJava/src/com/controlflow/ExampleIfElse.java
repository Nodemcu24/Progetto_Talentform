package com.controlflow;

public class ExampleIfElse {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
//		if (a == b) {
//			
//		System.out.println("ERRATO");
//		
//		} else if (a != b) {
//			
//			System.out.println(true);
//		}	
		
		if (a ==b && c==d) { 
			System.out.println(false);
		}
	    else {
		System.out.println(true);
	}
		
		if( a < b && c < d) {
			System.out.println(true);
		}
		
		else {
			System.out.println(false);
		}
		
		// TODO Auto-generated method stub

	}

}
