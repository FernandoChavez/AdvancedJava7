package com.mitocode.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class App {

	public static void main(String[] args) {
		
		//Los maps se dividen en un key y value, los key no se repiten y si se agrega un valor cuyo key ya existe en la lista, entonces se remplaza
	
		
		//HashMap example
		//El hashmap no sigue un orden en particular. Podmeos agregar valors con un key en "null"
			
		/*
		Map<String, String> map = new HashMap<>();
		 
		map.put("3", "MitoCode");
		map.put("4", "Mito");
		map.put("1", "Code");
		map.put("2", "Fernando");
		map.put("5", null);
		map.put("5", "ABC");
		map.put(null, "Hola");
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String) it.next();
			System.out.println("Clave: " + key + "-> Valor: "+ map.get(key));
			
		}
		*/
		
		
		//TreeMap Example
		//Treemap sigue un orden ascendente y ya no podemos agregar keys en "null"
				
		/*
		Map<String, String> map = new TreeMap<>();
		 
		map.put("3", "MitoCode");
		map.put("4", "Mito");
		map.put("1", "Code");
		map.put("2", "Fernando");
		map.put("5", null);
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String) it.next();
			System.out.println("Clave: " + key + "-> Valor: "+ map.get(key));
			
		}
		*/
		
		/*
		//LinkedHashMap
		//Se preocupa por el orden en que se va agregando los valores
		Map<String, String> map = new LinkedHashMap<>();
		 
		map.put("3", "MitoCode");
		map.put("4", "Mito");
		map.put("1", "Code");
		map.put("2", "Fernando");
		map.put("5", null);
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String) it.next();
			System.out.println("Clave: " + key + "-> Valor: "+ map.get(key));
			
		}
		*/
		
		
		//Ahora con objetos
		//COn linkedHashMao no hay necesidad de implementar el comparable en la clase Persona debido que nos igue un orden ascendente o similar
		/*
		Map<Persona, String> map = new LinkedHashMap<>();
		 
		map.put(new Persona(1,"Mitocode",21), "MitoCode");
		map.put(new Persona(2,"Mitocode",21), "Mito");
		map.put(new Persona(4,"Mitocode",21), "Code");
		map.put(new Persona(5,"Mitocode",21), "Fernando");
		map.put(new Persona(3,"Mitocode",21), "AAA");
		map.put(new Persona(6,"Mitocode",21), null);
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			Persona key = (Persona) it.next();
			System.out.println("Clave: " + key + "-> Valor: "+ map.get(key));
			
		}
		*/
		
		
		//Para TreeMap si necesitamos el comparable debido a que sigue un orden ascendente
		/*
		Map<Persona, String> map = new TreeMap<>();
		 
		map.put(new Persona(1,"Mitocode",21), "MitoCode");
		map.put(new Persona(2,"Mitocode",22), "Mito");
		map.put(new Persona(4,"Mitocode",23), "Code");
		map.put(new Persona(5,"Mitocode",25), "Fernando");
		map.put(new Persona(3,"Mitocode",24), "AAA");
		map.put(new Persona(6,"Mitocode",26), null);
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			Persona key = (Persona) it.next();
			System.out.println("Clave: " + key + "-> Valor: "+ map.get(key));
			
		}
		*/
		
		//Para hashmap no importa el orden
		Map<Persona, String> map = new HashMap<>();
		 
		map.put(new Persona(1,"Mitocode",21), "MitoCode");
		map.put(new Persona(2,"Mitocode",22), "Mito");
		map.put(new Persona(2,"Mitocode",22), "Mito");
		map.put(new Persona(2,"Mitocode",25), "Fernando");
		map.put(new Persona(2,"Mitocode",22), "Mito");
		map.put(new Persona(3,"Mitocode",24), "AAA");
		map.put(new Persona(6,"Mitocode",26), null);
		
		
		//Iterator it = map.keySet().iterator();
		//while(it.hasNext()) {
		//	Persona key = (Persona) it.next();
		//	System.out.println("Clave: " + key + "-> Valor: "+ map.get(key));
		//}
		
		//Otra forma de iterar un map
		for(Entry<Persona,String> ent : map.entrySet()) {
			System.out.println("Clave: " + ent.getKey() + "-> Valor: "+ ent.getValue());
			
		}
		
	}

}
