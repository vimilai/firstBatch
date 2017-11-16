package com.mkyong;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.mkyong.model.Report;
@Component("itemWriter")
public class CustomItemWriter implements ItemWriter<Report> {

	@Override
	public void write(List<? extends Report> items) throws Exception {
			System.out.println("*******************write*****************"+items.size());
	}
				
}
