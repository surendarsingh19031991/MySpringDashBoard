package com.spring.angular.dashboard.spring_angular_dashboard;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DashBoardController {
	
	//@GetMapping("/test")
	//public String getallCustomer(){
		
		//return new String("welcome to dashboard from spring");
	//}
	
	
	int[] dataArr={122,45,78,34,233};
	String[] dataNameArr={"Red","Pink","Green","Yellow","Orange","Blue"};
	
	@GetMapping("/test")
	public DashBoard getallCustomer(){
		System.out.println("api calling");
		return new DashBoard("welcome to dashboard from spring",dataNameArr,dataArr);
	}
	

	//@GetMapping(value = "/test",produces="application/json")
	//public Map<String,String> getallCustomer(){
		//Map<String,String> mapRes=new HashMap<>();
		//mapRes.put("name", "welcome to dashboard from spring");
		//return mapRes;
	
	//}
}
