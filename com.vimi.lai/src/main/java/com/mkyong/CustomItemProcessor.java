package com.mkyong;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.mkyong.model.Report;
@Component("itemProcessor")
public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		
		System.out.println("Processing..." + item);
		return item;
	}

}