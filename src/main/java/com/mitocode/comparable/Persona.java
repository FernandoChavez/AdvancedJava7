package com.mitocode.comparable;

public class Persona implements Comparable<Persona>{
	private int id;
	private String nombre;
	private int edad;
	
	public Persona(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;	
		this.edad=edad;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//CompareTo es el metodo abstracto necesario para implementar la interface Comparable
	@Override
	public int compareTo(Persona persona) {
		//edad se resta con la edad que venga del parametro con la clase Persona
		//El numero compareTo retorna un entero positivo, negativo o 0. SI es 0, son iguales y si es positivo o negativo, el orden varia
		
		//Ascendente por edad
		//System.out.println(this.edad+" - " + persona.getEdad() + " = "+ (this.edad -persona.getEdad()));
		//return this.edad -persona.getEdad();
		
		//decendente por edad
		//System.out.println(persona.getEdad()+" - " + this.edad + " = "+ (persona.getEdad()-this.edad));
		//return persona.getEdad()-this.edad;
		
		//Por nombre en orden ascendente
		return this.nombre.compareTo(persona.getNombre());
	}

	
}

