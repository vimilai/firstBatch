package com.vimi.lai.designpatterns.straegy;

public class Test {

	public static void main(String[] args) {
		Context context=new Context();
		StrategyA a=new StrategyA();
		StrategyB b=new StrategyB();
		context.setStrategy(a);
		context.getComeTrue();
		context.setStrategy(b);
		context.getComeTrue();
	}

}
