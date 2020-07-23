package com.mitocode.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {

	public static void main(String[] args) {
		//TreeSet permite agregar elementos a la lista que sean unicos y a la vez te los ordena de forma ascendente
		/*
		Set<String> lista = new TreeSet<>();
		lista.add("MitoCode");
		lista.add("Mito");
		lista.add("Code");
		lista.add("Mito");
		lista.add("Fernando");
		lista.add("AAA");

		for(String elemento : lista) {
			System.out.println(elemento);
		}
		*/
		
		//Ahora con objetos. Sabemos que los objetos ocupan un espacio de memoria diferente, por lo tanto aun si se repiten valores, se agregaran al treeSet
		Set<Persona> lista = new TreeSet<>();
		lista.add(new Persona(1, "MitoCode", 22));
		lista.add(new Persona(2, "Code", 23));
		lista.add(new Persona(3, "Mito", 24));
		lista.add(new Persona(4, "Fernando", 25));
		lista.add(new Persona(3, "Mito", 24));
		lista.add(new Persona(6, "AAA", 27));

		for(Persona per : lista) {
			System.out.println(per.getId() + "-" + per.getNombre() + "-" +per.getEdad());
		}
	}

}
