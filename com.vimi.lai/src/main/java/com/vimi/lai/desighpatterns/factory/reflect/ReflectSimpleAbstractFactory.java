package com.vimi.lai.desighpatterns.factory.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectSimpleAbstractFactory {
	private  static String nameString="2";
	static{
		InputStream filePath=null;
		try {
			filePath = ReflectSimpleAbstractFactory.class.getClassLoader().getResource("factory/factory.properties").openStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Properties properties=new Properties();
		try {
			properties.load(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ReflectSimpleAbstractFactory.nameString=properties.getProperty("name");
	}
	public static String getNameString() {
		return nameString;
	}
	public static void setNameString(String nameString) {
		ReflectSimpleAbstractFactory.nameString = nameString;
	}
	public static AbstractProdcutA getA(){
		try {
			return (AbstractProdcutA)Class.forName("com.vimi.lai.desighpatterns.factory.reflect.Concrete"+nameString+"ProductA").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static AbstractProdcutB getB(){
		try {
			return (AbstractProdcutB)Class.forName("com.vimi.lai.desighpatterns.factory.reflect.Concrete"+nameString+"ProductB").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
