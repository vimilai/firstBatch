package com.vimi.lai.desighpatterns.factory.factory;


public class ProductBFactory extends AbstractFactory {

	@Override
	AbstractProduct getProduct() {
		
		return new ProductB();
	}

	

}
