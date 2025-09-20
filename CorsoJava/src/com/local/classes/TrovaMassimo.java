package com.local.classes;

public class TrovaMassimo {
	
	 public void trovaMassimo(int a,int b ) {
	   class Confronto {
		int massimo() {
			
			if (a >b) {
				return a;
			}else {
				return b;
			}
		}
	}	
		Confronto c = new Confronto();
		System.out.println ( "Il valore massimo è :" +c.massimo());
		
	}
	
	 

	public static void main(String[] args) {
		
	    TrovaMassimo tm = new TrovaMassimo();
        tm.trovaMassimo(7, 12); // 
	}

}
