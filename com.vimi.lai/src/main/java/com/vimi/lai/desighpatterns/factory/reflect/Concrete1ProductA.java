package com.vimi.lai.desighpatterns.factory.reflect;

public class Concrete1ProductA  extends AbstractProdcutA{

	@Override
	public void insert() {
			System.out.println("insert Concrete1 ProductA");
	}

	@Override
	public void getA() {
		System.out.println("get Concrete1 ProductA");
	}

}
