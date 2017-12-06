package com.vimi.lai.desighpatterns.factory.simple;

public class SimpleFactory {
	
	public AbstractProduct getProduct(String Name){
		if(Name=="A"){return new ProductA();}
		else if(Name=="A"){return new ProductB();}
		else return null;
	}
}
