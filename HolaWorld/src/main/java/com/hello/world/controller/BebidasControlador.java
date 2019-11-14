package com.hello.world.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hello.world.model.Bebida;
import com.hello.world.service.BebidaServicio;

@Controller
@RequestMapping("/bar")
public class BebidasControlador {
 
	@Autowired
	BebidaServicio bebidaServicio;
	 
	
    @RequestMapping("/cerveza")
    public String cerveza(ModelMap mp){
        Bebida b = new Bebida();
        mp.put("cerveza", b);
        return "bar/cerveza";
    }
 
    @RequestMapping("/refresco")
    public String refresco(ModelMap mp){
        Bebida b = new Bebida("Quantum", "Nuka Cola", 99);
        mp.put("refresco", b);
        return "bar/refresco";
    }
    
    
    @RequestMapping("/lista")
    public String lista(ModelMap mp){
        mp.put("lista", bebidaServicio.getLista());
        return "bar/lista";
    }
 
    @RequestMapping(value="/bebida/{i}", method = RequestMethod.GET)
    public String bebida(@PathVariable("i") int i, ModelMap mp){
        mp.put("bebida", bebidaServicio.getBebida(i));
        return "bar/bebida";
    }
    
    @RequestMapping("/listajson")
    @ResponseBody
    public List<Bebida> listaJson(ModelMap mp){
        return bebidaServicio.getLista();
    }
    
    // No funciona con el mismo nombre no parece ser case sensitive
    @RequestMapping("/ListaJson")
    public String listaJsonHtml(ModelMap mp){
        return "bar/ListaJson";
    }
    
    @RequestMapping("/ListaJson3")
    public String listaJsonHtmlBootStrap(ModelMap mp){
        return "bar/ListaJson3";
    }
    
}