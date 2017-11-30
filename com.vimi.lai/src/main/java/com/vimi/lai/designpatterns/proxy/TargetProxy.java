/**
 * 
 */
package com.vimi.lai.designpatterns.proxy;

/**
 * @author wanlai
 *
 */
public class TargetProxy implements Target {
	private Target target;
	
	
	
	public Target getTarget() {
		return target;
	}



	public void setTarget(Target target) {
		this.target = target;
	}



	/* (non-Javadoc)
	 * @see com.vimi.lai.designpatterns.proxy.Target#getRequest()
	 */
	@Override
	public void getRequest() {
		System.out.println("aaaaaaaaaa");
		target.getRequest();
		System.out.println("bbbbbbbbbb");
		
	}

}
