package com.fuerzadon.linkedlist;

import java.util.LinkedList;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Java");
		list.addFirst("C++");
		list.addLast("Python");
		System.out.println("Lista: " + list);
		
		list.remove("Java");
		System.out.println("Despues de remover: " + list);
		
		System.out.println("Primer elemento " + list.getFirst());
		System.out.println("Ultimo elemento: " + list.getLast());
		
		
	}

}
