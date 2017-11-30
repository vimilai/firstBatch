/**
 * 
 */
package com.vimi.lai.designpatterns.clone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author wanlai
 *
 */
public class CloneA implements Cloneable{
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<CloneA > as=new ArrayList<CloneA>();
		long startDate=new Date().getTime();
		CloneA cloneA=new CloneA();
		for(int i=0;i<100;i++){
			try {
				CloneA cloneB =(CloneA) cloneA.clone();
				as.add(cloneB);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long endDate=new Date().getTime();
		System.out.println(endDate-startDate);
		//traditional new object
		long startDate1=new Date().getTime();
		
		for(int i=0;i<1000;i++){
			CloneA cloneA1=new CloneA();
			as.add(cloneA1);
		}
		long endDate1=new Date().getTime();
		System.out.println(endDate1-startDate1);
	}

}
