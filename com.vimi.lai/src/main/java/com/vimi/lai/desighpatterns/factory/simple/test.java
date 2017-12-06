package com.vimi.lai.desighpatterns.factory.simple;

public class test {

	public static void main(String[] args) {
		AbstractProduct product = new SimpleFactory().getProduct("A");

	}

}
