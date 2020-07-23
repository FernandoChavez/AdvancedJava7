package com.mitocode.instanceOf;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	private List canasta = new ArrayList();
	
	private void verificar(Object objeto) {
		if(objeto instanceof Fruta) {
			canasta.add(objeto);
			System.out.println("Fruta agregada: " + ((Fruta)objeto).getNombre());
		}else {
			System.out.println("Elemento no permitido, solo frutas por favor");
		}
	}

	public static void main(String[] args) {
		/*
		String texto = new String("Mitocode");
		if(texto instanceof String) {
			System.out.println("Es un String");
		}
		*/
		
		/*
		Alumno al = new Alumno();
		
		if(al instanceof Persona) {
			System.out.println("Es una persona");
		}
		
		if(al instanceof Alumno) {
			System.out.println("Es un alumno");
		}
		*/
		
		//Se tienen una casta donde solo se debe permitir
		//ingresar frutas
		
		System.out.println("Canasta abierta, por favor ingresar solo FRUTAS");
		
		
		
		Manzana m1 = new Manzana("Roja");
		Manzana m2 = new Manzana("Verde");
		Naranja n1 = new Naranja("Naranja sin pepa");
		Galleta g1 = new Galleta("Chocolate");
		
		App app = new App();
		app.verificar(m1);
		app.verificar(m2);
		app.verificar(n1);
		app.verificar(g1);

	}

}
