package com.basicjava;

 class CoveriantReturnType extends Test1 {

	 String show() {
			System.out.println("20");
			return null;
		}
	 
	public static void main(String[] args) {

		Test1 t = new Test1();
		t.show();
		
		CoveriantReturnType co = new CoveriantReturnType();
		co.show();
	}

}
