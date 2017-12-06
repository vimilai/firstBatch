package com.vimi.lai.designpatterns.template;

import static org.junit.Assert.*;

import org.junit.Test;

public abstract class AbstractTemplate {
	
	
	private void templateA(){
		System.out.println("AAAAAAAAAAAAAAAAAAAA");
	}
	
	private void templateB(){
		System.out.println("BBBBBBBBBBBBBBBBBBBB");
	}
	
	public void test() {
		templateA();
		templateB();
		comeTrue();
		
	}
	abstract void comeTrue();
}
