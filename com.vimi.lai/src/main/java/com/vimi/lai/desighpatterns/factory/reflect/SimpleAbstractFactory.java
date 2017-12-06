package com.vimi.lai.desighpatterns.factory.reflect;

public class SimpleAbstractFactory {
	private  static String nameString="1";
	
	public static AbstractProdcutA getA(){
		switch (nameString) {
		case "1":
			
			return new Concrete1ProductA();
		case "2":
			
			return new Concrete2ProductA();
		default:
			break;
		}
		return null;
	}
	public static AbstractProdcutB getB(){
		switch (nameString) {
		case "1":
			
			return new Concrete1ProductB();
		case "2":
			
			return new Concrete2ProductB();
		default:
			break;
		}
		return null;
	}

}
