package com.mitocode.instanciaAndStatic;

public class Alumno extends Persona{
	//Un metodo de instancia no puede ser sobreescrito por un metodo estatico
	// ni viceversa
	
	/*
	public static int sumar(int numero) {
		return numero + 2;
	}
	*/
	
	public static int sumar(int numero) {
		return numero + 2;
	}
}
