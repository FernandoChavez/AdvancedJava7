package com.mitocode.genericClassII;

public class Clase<K,T, V, E> {

	private K objetoK;
	private T objetoT;
	private V objetoV;
	private E objetoE;
	
	public Clase (K objetoK, T objetoT, V objetoV, E objetoE) {
		this.objetoK = objetoK;
		this.objetoT = objetoT;
		this.objetoV = objetoV;
		this.objetoE = objetoE;
	}
	
	public void mostrarTipo() {
		System.out.println("K es un: " + objetoK.getClass().getName());
		System.out.println("K es un: " + objetoT.getClass().getName());
		System.out.println("K es un: " + objetoV.getClass().getName());
		System.out.println("K es un: " + objetoE.getClass().getName());
	}
}
