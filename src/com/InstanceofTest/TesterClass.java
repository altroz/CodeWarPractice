package com.InstanceofTest;

public class TesterClass {
	public static void main(String[]args){
		TestClass1 testclass1 = new TestClass1();
		TestClass1 testclass2 = (TestClass2) testclass1;
		testclass2.draw();
	
	}
}
