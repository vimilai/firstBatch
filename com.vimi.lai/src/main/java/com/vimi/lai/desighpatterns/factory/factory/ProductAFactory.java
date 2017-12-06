package com.vimi.lai.desighpatterns.factory.factory;


public class ProductAFactory extends AbstractFactory {


	@Override
	AbstractProduct getProduct() {
		return new ProductA();
	}

}
