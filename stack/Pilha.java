package com.rebeca.estruturadados.stack;

import com.rebeca.estruturadados.vetor.Lista;

public class Pilha<T> extends Lista<T>{
	
	/*public Pilha(){
		super();
	}*/
	
	public Pilha(int capacidade){
		super(capacidade);
	}
	
	public void empilha(T elemento){
		super.adiciona(elemento);
	}
	
	public T topo(){
		if(this.isEmpty()){
			return null;
		}
		return this.elementos[tamanho-1];
	}
	
	public T desempilha(){
		if(this.isEmpty()){
			return null;
		}
		T elemento = this.elementos[tamanho-1];
		tamanho --;
		return elemento;
		
		
	}
	
	
}
