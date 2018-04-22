package com.rebeca.estruturadados.arvore;

public class Main {

	public static void main(String[] args) {
		//cria nodos como folha
		Tree arv = new Tree();
		Node a = arv.create(67);
		Node b = arv.create(39);
		Node c = arv.create(78);
		Node d = arv.create(21);
		Node e = arv.create(44);
		Node f = arv.create(9);

		//monta a hierarquia
		arv.insert(a, b);
		arv.insert(a, c);
		arv.insert(c, d);
		arv.insert(a, e);
		arv.insert(d, f);
		
		arv.print(a);
		System.out.println(arv.search(a, 21));
		System.out.println(arv.search(e, 45));
		System.out.println(arv.getAltura(a));
	}

}
