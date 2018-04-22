package com.rebeca.estruturadados.vetor;

public class VetorObjetos {
	
	private Object[] elementos;
	private int tamanho;
	
	public VetorObjetos(int capacidade){
		this.elementos=new Object[capacidade];
		this.tamanho=0;
	}
	
	//para adicionar elemento final do vetor 
	public boolean adiciona(Object elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
		this.elementos[this.tamanho]=elemento;
		this.tamanho++;
		return true;
		}else{
		return false;
		}
	}
	
	//para add elemento em qualquer posição
	public boolean adiciona(int posicao,Object elemento){
		//verifica se a posição é válida
		if(!(posicao >=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		this.aumentaCapacidade();
		//mover todos os elementos
		for(int i =this.tamanho-1; i>=posicao;i--){
			this.elementos[i+1]=this.elementos[i];
		}
		this.elementos[posicao]=elemento;
		this.tamanho++;
		
		return true;
	}
	
	//aumentar capacidade do vetor
	private void aumentaCapacidade(){
		if(this.tamanho == this.elementos.length){
			Object [] elementosNovos = new Object[this.elementos.length *2];
			for(int i=0; i<this.elementos.length;i++){
				elementosNovos[i]=this.elementos[i];
			}
			this.elementos=elementosNovos;
		}
	}
	
	
	
	//obter elemento de uma posição do array
	public Object busca (int posicao){
		if(!(posicao >=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
		}
	
	//verificar se o elemento existe através de busca sequencial
	public int busca( Object elemento){
		for(int i =0;i<this.tamanho;i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;

	}
	
	// método para remover elemento do vetor que tem como parâmetro a posição que se deseja remover
	public void remove(int posicao){
		if(!(posicao >=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		for(int i=posicao;i<this.tamanho-1;i++){
			this.elementos[i]=this.elementos[i+1];
		}
		this.tamanho--;
	}
		
	// para verificar quantidade de elementos(o tamanho real) no vetor
	public int tamanho(){
		return this.tamanho;
	}

	//para imprimir elementos de um vetor
	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0;i<this.tamanho-1;i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho > 0){
			s.append(this.elementos[(this.tamanho-1)]);
		}
		
		s.append("]");
		
		return  s.toString();
	}
	
	public Object[] getElementos() {
		return elementos;
	}

	public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}

}

	
