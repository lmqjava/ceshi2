package com.car.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
	


	@RequestMapping("/admin")
	public String showIndex() {

		
		return "hlogo";
	}
	@RequestMapping("/{jsp}")
	public String getView(@PathVariable("jsp") String jsp) {
		return jsp;

	}
	@RequestMapping("/login")
	public String showIndex2(){
		return "hmain";
	}


}
