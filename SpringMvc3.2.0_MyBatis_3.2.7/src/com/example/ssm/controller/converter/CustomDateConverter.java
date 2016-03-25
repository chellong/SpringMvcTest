package com.example.ssm.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class CustomDateConverter implements Converter<String,Date>{

	@Override
	public Date convert(String arg0) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return simpleDateFormat.parse(arg0);
		} catch (ParseException e) {
			//e.printStackTrace();
		}
		return null;	
	}

}
