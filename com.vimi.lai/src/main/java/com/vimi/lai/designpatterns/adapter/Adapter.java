package com.vimi.lai.designpatterns.adapter;


public class Adapter implements  com.vimi.lai.designpatterns.adapter.Target {

	Adaptee adaptee=new Adaptee();

	@Override
	public void request() {
		adaptee.otherRequet();
	}
	
	

}
