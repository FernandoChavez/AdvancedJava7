package com.mitocode.genericClassIIIWillcards;

import java.util.ArrayList;
import java.util.List;

public class AppWild {
	
	//wildcard es cuando asignas un signo de ? que indicaria que seria un objeto de tipo desconocido
	//public void listar(List<?> lista) {
	//El extends en wildcard hace concepto no solo a herencia, si no tambien  a implementaciones
	//UpperBounded hace mencion que va a recibir cualquier tipo que sea un sublcase de la clase que le estmaos indicando (herencia o interfaz)
	public void listarUpperBounded(List<? extends Persona> lista) {
		for(Persona per : lista) {
			//if(a instanceof Alumno) {
				System.out.println(per.getNombre());
			//}else if (a instanceof Profesor) {
				//System.out.println(((Profesor) a).getNombre());
			//}
		}
	}
	
	//metodo que reconoce a las clases que son mayores a la clase indicada en ese aspecto
	public void listarLowerBounded(List<? super Alumno> lista) {
		for(Object a1 : lista) {
			//if(a instanceof Alumno) {
				System.out.println(((Persona)a1).getNombre());
			//}else if (a instanceof Profesor) {
				//System.out.println(((Profesor) a).getNombre());
			//}
		}
	}
	
	//No estamos indicando el tipo
	public void listarUnBounded(List<?> lista) {
		for(Object a1 : lista) {
			//if(a instanceof Alumno) {
				System.out.println(((Persona)a1).getNombre());
			//}else if (a instanceof Profesor) {
				//System.out.println(((Profesor) a).getNombre());
			//}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppWild aw = new AppWild();
		
		Persona al1 = new Profesor("MITOCODE");
		Persona al2 = new Profesor("FERNANDO");
		Persona al3 = new Profesor("MITO");
		
		List<Persona> lista = new ArrayList<>();
		lista.add(al1);
		lista.add(al2);
		lista.add(al3);
		
		aw.listarUpperBounded(lista);
		System.out.println();
		aw.listarLowerBounded(lista);
		System.out.println();
		aw.listarUnBounded(lista);
		
	}

}
