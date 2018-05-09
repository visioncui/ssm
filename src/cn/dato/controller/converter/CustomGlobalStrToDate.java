package cn.dato.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomGlobalStrToDate implements Converter<String,Date>{

	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(source);
			return date;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
