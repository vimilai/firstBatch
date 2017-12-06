package com.vimi.lai.designpatterns.template;

public class ConcreteTemplate extends AbstractTemplate {

	@Override
	void comeTrue() {
		System.out.println("ccccccccccccccccccc");
	}

	public static void main(String[] args) {
			AbstractTemplate template=new ConcreteTemplate();
			template.test();
	}

}
