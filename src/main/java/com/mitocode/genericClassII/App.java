package com.mitocode.genericClassII;


import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Seguridad de tipos
		//type safety: Es una proteccion en cuanto al tipo de dato
		
		//Una lista no es por defecto type safety
		//Desde java 1.6 en adelante, podemos dejar sin tipo el <> de la dereche
		// como en el siguiente ejemplo
		
		/*
		List<String> lista = new ArrayList<>();
		
		lista.add("MitoCode");
		//lista.add(25);
		
		
		//Una lista si es por defecto type safety
		String[] array = new String[5];
		array[0] ="Mitocode";
		//array[1] = 1; // no te permite asignarlo
		
		//Los genericos evitan el casteo (casting)
		//evitamos lo siguiente
		String texto = (String)lista.get(0);
		System.out.println(texto);
		*/
		
		Clase<String, Integer, String, Double> c = new Clase<>("Mitocode", 25, "Jaime", 25.5);
		//c.mostrarTipo();

		
		//Estamos iterando una lista con una implementacion generica, tiene un objeto llamado clase y a su vez, tiene un generico
		List<Clase<String, Integer, String, String>> lista = new ArrayList<>();
		lista.add(new Clase<String, Integer, String, String>("MitoCode", 25, "Fernando", "Hola a todos"));
		
		for(Clase <String, Integer, String, String> cl : lista) {
			c.mostrarTipo();
		}
	}

}
