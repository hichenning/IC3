package cn.com.utils;

import org.springframework.stereotype.Component;

@Component
public class Encode {
	
	public static String encode(String password){

		return "HH"+password+"HH";
	}
	
}
