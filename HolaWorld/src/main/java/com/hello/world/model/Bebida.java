package com.hello.world.model;

public class Bebida {

	 private String nombre;
	    private String marca;
	    private int precio;
	 
	    public Bebida() {
	        super();
	        // TODO Auto-generated constructor stub
	        this.nombre = "cerveza";
	        this.marca = "duff";
	        this.precio = 99;
	    }
	 
	    public Bebida(String nombre, String marca, int precio) {
	        super();
	        this.nombre = nombre;
	        this.marca = marca;
	        this.precio = precio;
	    }
	 
	    public String getNombre() {
	        return nombre;
	    }
	 
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	 
	    public String getMarca() {
	        return marca;
	    }
	 
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }
	 
	    public int getPrecio() {
	        return precio;
	    }
	 
	    public void setPrecio(int precio) {
	        this.precio = precio;
	    }
	
}
