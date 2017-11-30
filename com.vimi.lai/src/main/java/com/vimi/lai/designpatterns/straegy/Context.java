package com.vimi.lai.designpatterns.straegy;

/**
 * 适用于各个算法的替换
 * @author wanlai
 *
 */
public class Context {
	public Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public void getComeTrue(){
		if(strategy!=null)strategy.comeTrue();
		
	}
	
}
