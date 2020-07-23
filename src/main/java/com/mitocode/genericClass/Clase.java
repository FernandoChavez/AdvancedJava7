package com.mitocode.genericClass;

public class Clase <T>{
	//T es un estereotipo. La lista de estereotipos es la siguiente:
	//E -Element(used extensively by the Java Collections Frameworks)
	//K - Key (Example for hashmaps)
	//N - Number
	//T - Type
	//V - Value
	//S,U,V,etc - 2nd, 3rd, 4th types
	
	private T objeto;
	
	public Clase (T objeto) {
		this.objeto = objeto;
	}
	
	public void mostrarTipo() {
		System.out.println("T es un: "+ objeto.getClass().getName());
	}

}
