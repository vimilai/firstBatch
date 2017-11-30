package com.vimi.lai.designpatterns.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

public class DeepCloneS  implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int a;
	private String name;
	
	public DeepCloneS(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	public Object deepClone(){
		try {
		ByteArrayOutputStream bo=new ByteArrayOutputStream();
		
			ObjectOutputStream ooObjectOutputStream=new ObjectOutputStream(bo);
			ooObjectOutputStream.writeObject(this);
			ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
			ObjectInputStream oi=new ObjectInputStream(bi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public static void main(String[] args) {
		DeepCloneS cloneS = new DeepCloneS(2, "aa");
		DeepCloneS clone=null;
		try {
			clone =(DeepCloneS) cloneS.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cloneS+"---------"+cloneS.getName()+"---"+cloneS.getA());
		System.out.println(clone+"---------"+clone.getName()+"---"+cloneS.getA());
		cloneS.setA(3);
		cloneS.setName("bbb");
		System.out.println(cloneS+"---------"+cloneS.getName()+"---"+cloneS.getA());
		System.out.println(clone+"---------"+clone.getName()+"---"+clone.getA());
	}
}
