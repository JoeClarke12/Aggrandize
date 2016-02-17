package com.joeclarke12.main;

import com.joeclarke12.graphics.MainGraphics;

public class Main implements Runnable{
	
	public static boolean running = false;
	
	int h = MainGraphics.height;
	int w = MainGraphics.width;
	int s = MainGraphics.scale;

	
	public void start() {
		running = true;
		
		run();
		return;
		
	}
	

	
	public void stop() {
		System.exit(1);
	}
	
	
	@Override
	public void run() {
		Main.Main();
		
	}
	
	private static void Main() {
		// TODO Auto-generated method stub
		
	}



}
