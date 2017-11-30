package com.vimi.lai.designpatterns.proxy;

public class Test {

	public static void main(String[] args) {
		//this is only show simple static proxy pattern
		Target target=new RealTarget();
		TargetProxy targetProxy=new TargetProxy();
		targetProxy.setTarget(target);
		targetProxy.getRequest();
	}

}
