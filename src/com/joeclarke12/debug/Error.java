package com.joeclarke12.debug;

public class Error {

	public void error(int x, String y) {
		/* 1 Major system error */
		if(x == 1) {
			System.err.print(y);
			System.exit(1);
		}
		/*Small basic error*/
		if(x == 2){
			System.err.print(y);
			
		}
	}
}