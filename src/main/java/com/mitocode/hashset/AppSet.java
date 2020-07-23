package com.mitocode.hashset;

import java.util.HashSet;
import java.util.Set;

public class AppSet {

	public static void main(String[] args) {
		//Hashset es para encontrar una coleccion sin valores repetidos
		//Hashset no tiene un orden de agregacion y ordenacion
		/*
		Set<String> lista = new HashSet<>();
		lista.add("MitoCode");
		lista.add("Mito");
		lista.add("Code");
		lista.add("Code");
		lista.add("MitoCode");
		lista.add("AAA");

		
		  for(String elementor : lista) {
			System.out.println(elemento);
		  }
		 */
		
		Set<Persona> lista = new HashSet<>();
		lista.add(new Persona(1,"MitoCode",22));
		lista.add(new Persona(1,"Mito",22));
		lista.add(new Persona(1,"Code",22));
		lista.add(new Persona(1,"Code",22));
		lista.add(new Persona(1,"MitoCode",22));
		lista.add(new Persona(1,"AAA",22));
		
		for(Persona per : lista) {
			//Se imprimira valores repetidos ya que cada instancia de un objeto apunta a un bloque diferente de memoria y por lo tanto nunguno es repetido
			//Para ellos es importante sobre escribir los metodos en la clase del objeto con hashcode e equals
			System.out.println(per.getNombre());
		}
	}

}
