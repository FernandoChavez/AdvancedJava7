package com.mitocode.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class App {

	public static void main(String[] args) {	// TODO Auto-generated method stub
		ArrayList<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1, "Jaime", 25));
		lista.add(new Persona(1, "Mito", 15));
		lista.add(new Persona(1, "Code", 29));
		lista.add(new Persona(1, "AAA", 24));
		
		//java.util.Collections.sort() method is present in java.util.Collections class. It is used to sort the elements present in the specified list of Collection in ascending order.
		//Collections.sort(lista, new NombreComparator());
		Collections.sort(lista, new Comparator<Persona>(){

			@Override
			public int compare(Persona per1, Persona per2) {
				//Compare comparara ambos valores. Si es positiva entonces obj1>=obj2 y si es negativa entonces obj1<obj2

				int rpta = 0;
				if(per1.getEdad() > per2.getEdad()) {
					rpta = 1;
				}else if(per1.getEdad() < per2.getEdad()) {
					rpta = -1;
				}else {
					rpta = 0;
				}
				return rpta;
			}
			
		});
		//Collections.reverse(lista)
		
		for(Persona p : lista) {
			System.out.println(p.getNombre());
		}
		
		
	}

}
