package com.eksad.latihanspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControler {
	
	//1setelah buat classbuat@controller
	//buat publicStringHellowor1
	//buatrequestmappinghello
	
	//lalu buat@responsebody, stop trus running lagi
	
	
	@RequestMapping("/hello") //alamatnya
	@ResponseBody
	public String sayHello() {
		return "Woi ANJING";
	}
		
		@RequestMapping("/myName") //alamatnya
		@ResponseBody
		public String myName(@RequestParam String myName) {
			return "Hello " + myName;
		}

		@RequestMapping("/namaSaya/{myName}") //alamatnya
		@ResponseBody
		public String namaSaya(@PathVariable String myName) {
			return "Hello " + myName;
	}
		@RequestMapping("/toGoogle") //alamatnya
		@ResponseBody
		public String toGoogle() {
			return "<a href='https://www.google.com' target='_blank'> Klik disini menuju google </a>"
				+"</br> <a href='https://www.youtube.com'> Klik disini menuju youtube </a>"
					+"</br> <a href='https://www.instagram.com/ezrasote/?hl=id'> Klik disini menuju orang keren </a>";
			
			
			
		
	
		}
		
}
