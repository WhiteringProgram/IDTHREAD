package view;

import controller.NumThread;

public class Principal {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			Thread thread = new NumThread();
			thread.start();
		}
	}
}
