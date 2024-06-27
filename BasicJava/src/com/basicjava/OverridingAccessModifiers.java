package com.basicjava;

 class OverridingAccessModifiers extends Test2 {
	
	public void show() {
		System.out.println("2");
	}

	public static void main(String[] args) {
		OverridingAccessModifiers ov = new OverridingAccessModifiers();
		ov.show();
		
		Test2  t2 = new Test2();
		t2.show();
	}

}

