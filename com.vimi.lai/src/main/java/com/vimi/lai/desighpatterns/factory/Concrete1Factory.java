package com.vimi.lai.desighpatterns.factory;

public class Concrete1Factory extends AbstractFactory {

	@Override
	AbstractProdcutA getProductA() {
		
		return new Concrete1ProductA();
	}

	@Override
	AbstractProdcutB getProductB() {
		return null;
	}
	
	

}
