package com.rebeca.estruturadados.listas;


public class Teste {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ListaEncadeada we = new ListaEncadeada();
		
		we.adiciona(123);
		we.adiciona(12, 1);
		we.addFirst(68);
		we.addFirst(74);
		we.addFirst("Renato");
		System.out.println(we);
		we.remove(3);
		we.removeFirst();
		System.out.println(we);
		System.out.println(we.busca(123));
		System.out.println(we.size());
		
		
		
		
		

	}

}
