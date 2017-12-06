package com.vimi.lai.designpatterns.state;

public class Concrete2State extends AbstractState {

	@Override
	void handle(Context context) {
		System.out.println("this is end");
	}

}
