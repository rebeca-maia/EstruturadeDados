package com.rebeca.estruturadados.queue;

import com.rebeca.estruturadados.arvore.*;
import com.rebeca.estruturadados.listas.ListaEncadeada;

public class FilaEncadeada<T> extends ListaEncadeada<T> {
	
	public FilaEncadeada(){
		super();
	}
	
	public void enqueue(Object val){
		super.adiciona(val);
	}
	
	public void enfileiraTodos2(BinNode<T> x){
		while(x!=null){
			enqueue(x.getVal());
		}
	}
	public void enfileiraTodos1(Node x){
		while(x!=null){
			enqueue(x.getVal());
		}
	}
	
	public void enfileiraTodos3(NodeBST x){
		while(x!=null){
			enqueue(x.getVal());
		}
	}
	
	public T dequeue(){
		return super.removeFirst();
	}
	
	public void vazio(){
		super.isEmpty();
	}
	
	public void tamanho(){
		super.size();
	}
}
