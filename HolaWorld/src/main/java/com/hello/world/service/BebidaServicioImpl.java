package com.hello.world.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hello.world.model.Bebida;

@Service
public class BebidaServicioImpl implements BebidaServicio {
    List<Bebida> lista = new ArrayList<Bebida>();
 
    public BebidaServicioImpl() {
        //añadimos la bebida por defecto
        Bebida b = new Bebida();
        lista.add(b);
        //añadimos otra bebida
        b = new Bebida("quantum", "nuka cola", 99);
        lista.add(b);
    }
 
    @Override
    public List<Bebida> getLista() {
        // TODO Auto-generated method stub
        return lista;
    }
 
    @Override
    public Bebida getBebida(int i) {
        // TODO Auto-generated method stub
        if(i < lista.size() && i >-1) {
         
        	return lista.get(i);
        }
        return new Bebida("agua", "del grifo", 200);
    }
 
}