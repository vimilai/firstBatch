package com.vimi.lai.desighpatterns.factory.reflect;

public class Test {

	public static void main(String[] args) {
		AbstractProdcutA a = ReflectSimpleAbstractFactory.getA();
		a.getA();
		AbstractProdcutB b = ReflectSimpleAbstractFactory.getB();
		b.getB();
	}

}
