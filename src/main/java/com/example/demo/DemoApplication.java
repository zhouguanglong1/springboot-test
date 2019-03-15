package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping(value = "/test" ,method = RequestMethod.POST)
	@ResponseBody
    	public Map<String,Object> todayInvokingStat(@RequestBody Map<String,Object> req) throws Exception{
        	Map<String,Object> result = new HashMap<>();
		result.put("name","hello,I'm v1!");
        return result;
    }
}
