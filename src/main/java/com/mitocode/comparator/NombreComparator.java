package com.mitocode.comparator;

import java.util.Comparator;

public class NombreComparator implements Comparator<Persona> {
	
	//Compare comparara ambos valores. Si es positiva entonces obj1>=obj2 y si es negativa entonces obj1<obj2
	@Override
	public int compare(Persona per1, Persona per2) {
		//Persona per1 = (Persona)obj1;
		//Persona per2 = (Persona)obj2;
		
		//retornara un valor negativo positivo, negativo o cero, de acuerdo al caso
		return per1.getNombre().compareTo(per2.getNombre()); 
		
	}
}
