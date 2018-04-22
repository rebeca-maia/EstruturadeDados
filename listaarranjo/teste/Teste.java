package com.rebeca.estruturadados.vetor.teste;

import com.rebeca.estruturadados.vetor.VetorObjetos;

public class Teste {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);
		vetor.adiciona("F");
		vetor.adiciona("G");
		vetor.adiciona("H");
		vetor.adiciona("J");
		vetor.adiciona("K");
		
		//adicionar elementos em qualquer posi��o
		System.out.println(vetor);
		vetor.adiciona(0,"E");
				
		System.out.println(vetor);
		vetor.adiciona(3,"D");
				
		System.out.println(vetor);
		
		//obter elemento de uma posi��o do array
		//System.out.println(vetor.busca(posicao));
		System.out.println(vetor.busca(1));
		
		//verificar se o elemento existe, se existir, retorna sua posi��o no vetor
		//se n�o, retorna -1
		System.out.println(vetor.busca("elemento 1"));
		
		//remover elemento
		vetor.remove(1);
		System.out.println(vetor);
		
	}

}
