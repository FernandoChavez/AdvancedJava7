package com.mitocode.LinkedHashSet;

public class Persona{
	private int id;
	private String nombre;
	private int edad;
	
	public Persona(int id, String nombre, int edad) {
		this.id=id;
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
	
	//En un hashset se puede ingresar objetos con valores identicos debido a que ocupan un espacio de memoria distinto
	//Para poder evitar ingresar objetos con valores repetidos, sobreescribiremos los metodos usando "hashcode()" y "equals" usando solo los valores con el que queremos hacer el criterio de evaluacion. En este caso serán las 3 variables
	//Click derecho -> Source -> generate hashCode() and equals()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	

	//Con el LinkedHashSet NO es necesario el comparable para poder caster un objeto Persona y agregarle el orden alfabetico debido a que se ordenará conforme se vaya agregando a la lista
	/*
	@Override
	public int compareTo(Persona per) {
		return this.edad - per.getEdad();
	}
	*/



	
}
