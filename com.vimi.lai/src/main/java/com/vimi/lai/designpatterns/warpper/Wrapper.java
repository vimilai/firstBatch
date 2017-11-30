package com.vimi.lai.designpatterns.warpper;

public abstract class Wrapper extends Component{
	private  Component component;

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}
	
	@Override
	public void comeTrue() {
		component.comeTrue();
	}
	
}
