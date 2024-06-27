package com.basicjava;

 class PolymorphismOverriding  extends Test{
	
	 void show() throws RuntimeException 
		{
			System.out.println("2");
		}
		public static void main(String[] args) {
			PolymorphismOverriding p = new PolymorphismOverriding();
			p.show();
			
			Test t = new Test();
			t.show();
		}
 }


	


