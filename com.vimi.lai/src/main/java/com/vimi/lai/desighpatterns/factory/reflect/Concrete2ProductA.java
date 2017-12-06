package com.vimi.lai.desighpatterns.factory.reflect;

public class Concrete2ProductA  extends AbstractProdcutA{

	@Override
	public void insert() {
			System.out.println("insert Concrete2 ProductA");
	}

	@Override
	public void getA() {
		System.out.println("get Concrete2 ProductA");
	}

}
