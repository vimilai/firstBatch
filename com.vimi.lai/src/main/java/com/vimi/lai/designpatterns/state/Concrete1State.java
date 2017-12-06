package com.vimi.lai.designpatterns.state;

public class Concrete1State extends AbstractState {

	@Override
	void handle(Context context) {
		if(context.number==1)System.out.println("this is begin");
		context.setAbstractState(new Concrete2State());
		context.handle();
	}

}
