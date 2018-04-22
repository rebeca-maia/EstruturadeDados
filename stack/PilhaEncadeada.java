package com.rebeca.estruturadados.stack;

import com.rebeca.estruturadados.arvore.*;
import com.rebeca.estruturadados.arvore.Node;
import com.rebeca.estruturadados.listas.*;


public class PilhaEncadeada<T> extends ListaEncadeada<T>{
	public PilhaEncadeada(){
		super();
	}
	
	public void empilha(Object item){
		super.addFirst(item);
	}
	
	public void empilhaTodos1(Node x){
		while(x!=null){
			empilha(x.getVal());
		}
	}
	
	public void empilhaTodos3(NodeBST x){
		while(x!=null){
			empilha(x.getVal());
		}
	}
	
	public void empilhaTodos2(BinNode<T> x){
		while(x!=null){
			empilha(x.getVal());
		}
	}
	public T desempilha(){
		return super.removeFirst();
	}
	
	public T topo(){
		return super.first();
	}
	
	public void vazio(){
		super.isEmpty();
	}

	public void tamanho(){
		super.size();
	}
}
