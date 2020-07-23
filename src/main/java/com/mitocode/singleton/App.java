package com.mitocode.singleton;

public class App {

	public static void main(String[] args) {
		/*
		PaisDAOImpl dao = new PaisDAOImpl();
		
		for(Object obj: dao.getPaises()) {
			System.out.println(((Pais)obj).getNombre());
		}
		
		System.out.println("*****************");
		
		for(Object obj: dao.getPaises()) {
			System.out.println(((Pais)obj).getNombre());
		}
		
		
		//Lo siguiente es crear una nueva instancia 
		// ocupando memoria innecesaria
		System.out.println("*****************");
				
		PaisDAOImpl dao1 = new PaisDAOImpl();
		
		for(Object obj: dao1.getPaises()) {
			System.out.println(((Pais)obj).getNombre());
		}
		*/
		
			
		
		//CON SINGLETON
		
		
		
		PaisDAOImpl dao = PaisDAOImpl.getInstance();
		for(Object obj: dao.getPaises()) {
			System.out.println(((Pais)obj).getNombre());
		}
		
		
		for(Object obj: dao.getPaises()) {
			System.out.println(((Pais)obj).getNombre());
		}
		
		PaisDAOImpl daoi = PaisDAOImpl.getInstance();
		for(Object obj: daoi.getPaises()) {
			System.out.println(((Pais)obj).getNombre());
		}

	}

}
