package com.learn.practiceexam;

public class Test {
	
	public Test() {
		System.out.print("Message 1" +", ");
	}
	public Test(String message) {
		System.out.print(message +", ");
		display();
	}
	public void display() {
		System.out.print("Message 2" +", ");
	}
	public void display(Object message) {
		System.out.print("Object" +", ");
	}
	public void display(String message) {
		System.out.print(message +", ");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.display("Message X");
	}

}
