package com.vimi.lai.designpatterns.warpper;

public class Test {

	public static void main(String[] args) {
		Component component=new ComponentA();
		Wrapper wrapper=new WrapperA();
		wrapper.setComponent(component);
		Wrapper wrapperb=new WrapperB();
		wrapperb.setComponent(wrapper);
		wrapperb.comeTrue();
	}

}
