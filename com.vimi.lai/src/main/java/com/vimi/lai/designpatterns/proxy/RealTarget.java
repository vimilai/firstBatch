package com.vimi.lai.designpatterns.proxy;

public class RealTarget implements Target {

	@Override
	public void getRequest() {
		System.out.println("this is concrete tagert method show");
	}

}
