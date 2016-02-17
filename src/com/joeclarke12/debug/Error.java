package com.joeclarke12.debug;

import com.joeclarke12.main.Main;

public class Error {

	public static void error(int x, String y) {
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

	public void RunCheck() {
		if(Main.running = false) {
			Error.error(1, "Run Check error");
			System.exit(1);
		}
		
		
	}
}