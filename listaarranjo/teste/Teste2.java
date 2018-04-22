package com.rebeca.estruturadados.vetor.teste;

//import com.rebeca.estruturadados.stack.*;
import com.rebeca.estruturadados.queue.*;
import com.rebeca.estruturadados.stack.Pilha;

public class Teste2 {

	public static void main(String[] args) {
		
		Pilha<Integer> p1 = new Pilha<Integer> (5);
		
		System.out.println(p1.tamanho());
		
		for(int i=1;i<=5;i++){
			p1.empilha(i);
		}
		System.out.println(p1);
		System.out.println(p1.tamanho());
		p1.empilha(8);
		System.out.println(p1);
		System.out.println(p1.topo());
		p1.desempilha();
		System.out.println(p1);
		 
		FilaCircular<String> f1 = new FilaCircular<String>(2);
		f1.enfileira("ABC");
		f1.enfileira("FGH");
		f1.enfileira("RST");
		f1.enfileira("WXY");
		f1.imprimir();
		//f1.desenfileira();
		//System.out.println(f1);
		
		/*
		
		PilhaEncadeada<Character> p2 = new PilhaEncadeada<Character>();
		p2.addFirst('H');
		p2.addFirst('I');
		p2.addFirst('Q');
		p2.imprimir();
		p2.removeFirst();
		p2.imprimir();
		
		
		FilaEncadeada<String> f2 = new FilaEncadeada<String>();
		f2.adiciona("Laus Deo");
		f2.adiciona("Mollitam");
		f2.adiciona("Cerne");
		f2.imprimir();
		f2.removeFirst();
		f2.imprimir();*/
	}

}
