package com.vimi.lai.desighpatterns.factory;

public class Concrete2Factory extends AbstractFactory {

	@Override
	AbstractProdcutA getProductA() {
		return new Concrete2ProductA();
	}

	@Override
	AbstractProdcutB getProductB() {
		return new Concrete2ProductB();
	}

}
