package controller;

public class NumThread extends Thread{
	
	public NumThread() {
		super ();
	}
	
	public void run () {
		System.out.println(getId());
	}
}
