package com.learn.practiceexam;

public class Quetion11 {

	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("missingfile.txt");
			in.read();
			in.close();
		}
		catch() {
			System.out.println(e.getClass().getName());
		}
		catch() {
			System.out.println(e.getClass().getName());
		}
	}

}
