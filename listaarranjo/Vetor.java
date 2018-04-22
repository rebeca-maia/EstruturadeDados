package com.rebeca.estruturadados.vetor;

public class Vetor {
	private String [] elementos;
	private int tamanho;
	
	public Vetor(int capacidade){
		this.elementos=new String [capacidade];
		this.tamanho=0;
	}
	
	/*public void adiciona(String elemento){
		for(int i=0; i<this.elementos.length;i++){
			if(this.elementos[i] == null){
				this.elementos[i]=elemento;
				break;
			}
		}
	}
	Esse algoritmo não é eficiente
	*/
	
	/*public void adiciona(String elemento) throws Exception{
		if(this.tamanho < this.elementos.length){
		this.elementos[this.tamanho]=elemento;
		this.tamanho++;
		}else{
			throw new Exception("O vetor já está cheio");
			}
	}
	Outra forma de fazer isso é usando o método abaixo
	*/
	
	//para adicionar elemento final do vetor 
	public boolean adiciona(String elemento){
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
	public boolean adiciona(int posicao,String elemento){
		//verifica se a posição é válida
		if(!(posicao >=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
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
			String [] elementosNovos = new String[this.elementos.length *2];
			for(int i=0; i<this.elementos.length;i++){
				elementosNovos[i]=this.elementos[i];
			}
			this.elementos=elementosNovos;
		}
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
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return  s.toString();
	}
	
	//obter elemento de uma posição do array
	public String busca (int posicao){
		if(!(posicao >=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	//verificar se o elemento existe através de busca sequencial
	/*public boolean busca( String elemento){
		for(int i =0;i<this.tamanho;i++){
			if(this.elementos[i].equals(elemento)){
				return true;
			}
		}
	return false;
	}
	*/
	
	//outra forma de fazer isso é utilizando o método abaixo
	public int busca( String elemento){
		for(int i =0;i<this.tamanho;i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
	return -1;
	}
	














}

