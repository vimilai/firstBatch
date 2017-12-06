package com.vimi.lai.desighpatterns.factory;

public class Concrete1ProductB  extends AbstractProdcutB{

	@Override
	public void insert() {
			System.out.println("insert Concrete1 ProductB");
	}


	@Override
	public void getB() {
		System.out.println("get Concrete1 ProductB");
		
	}

}
