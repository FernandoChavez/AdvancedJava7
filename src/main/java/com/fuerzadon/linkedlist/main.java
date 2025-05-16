package com.fuerzadon.linkedlist;

import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		
		// Agregar
		list.add("A");               // al final
		list.add("B");               // al final
		list.add("C");               // al final
		list.add("f");               // al final
		list.addFirst("D");          // al inicio
		list.addLast("E");           // al final (igual que add())

		// Obtener
		String first = list.getFirst();
		String last = list.getLast();
		String atIndex = list.get(1); // como una lista normal

		
		//Ambos obtienen el primer elemento y lo eliminan (funcionan como una cola FIFO), pero si la lista esta vacia, poll devuelve null y removeFirst() lanza excepcion NoSuchElementException
		// Eliminar
		list.removeFirst();
		list.removeLast();
		list.remove(0);              // por índice
		list.remove("A");            // por valor
		list.poll();                 //Obtengo el primer valor y lo elimino
		
		//peek y getfirst obtienen el primer elemento. La diferencia es que si el linkedlist esta vaio, el peek devuelve un nul y el getFirst lanza una excepcion NoSuchElementException

		// Ver sin eliminar
		list.peek();                 // primero (null si vacío)
		list.peekFirst();
		list.peekLast();
		
	}

}
