package com.vimi.lai.desighpatterns.factory;

public class Test {

	public static void main(String[] args) {
		AbstractFactory factory=new Concrete1Factory();
		AbstractProdcutA productA = factory.getProductA();
		productA.getA();
		AbstractFactory factory1=new Concrete2Factory();
		AbstractProdcutA product1A = factory1.getProductA();
		product1A.getA();
	}

}
