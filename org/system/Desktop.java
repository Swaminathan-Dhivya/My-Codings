package org.system;

public class Desktop extends Computer {
	public void desktop() {
		System.out.println("Desktop class");
	}
public static void main(String[] args) {
		
	Desktop d=new Desktop();
		d.computer();
		d.desktop();
	}

}
