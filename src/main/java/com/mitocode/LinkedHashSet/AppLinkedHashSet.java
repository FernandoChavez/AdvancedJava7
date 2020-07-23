package com.mitocode.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppLinkedHashSet {

	public static void main(String[] args) {
	
		//LinkedHashSet se preocupa que todos los valores sean unicos se preocupa del orden en que los elementos se agregan; o sea el orden no será alfabeticamente si no será conforme se vayan agregando los objeto a la lista
		//Ahora con objetos. Sabemos que los objetos ocupan un espacio de memoria diferente, por lo tanto aun si se repiten valores, se agregaran al treeSet
		Set<Persona> lista = new LinkedHashSet<>();
		lista.add(new Persona(1, "MitoCode", 22));
		lista.add(new Persona(1, "Mito", 22));
		lista.add(new Persona(1, "Code", 22));
		lista.add(new Persona(1, "Code", 22));
		lista.add(new Persona(1, "MitoCode", 25));
		lista.add(new Persona(1, "AAA", 22));

		for(Persona per : lista) {
			System.out.println(per.getId() + "-" + per.getNombre());
		}
	}

}
