package com.hello.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MiController {

	
	@RequestMapping("")
	public String hola(ModelMap mp){
		
		mp.put("textoHola", "Hola Mundo3!!");
		
		return ("HolaMundo");
	}
	
	@RequestMapping(value="/adios")
	public String adios(ModelMap mp){
		
	    mp.put("textoAdios", "Adios Mundo3!!");
	    
	    return ("AdiosMundo");
	}
	
}
