package com.vimi.lai.designpatterns.state;

public class Context {
	
	static int number=0;
	
	AbstractState abstractState;
	
	
	public AbstractState getAbstractState() {
		return abstractState;
	}


	public void setAbstractState(AbstractState abstractState) {
		this.abstractState = abstractState;
	}
	

	public void  handle(){
		abstractState.handle(this);
	}
	
}
