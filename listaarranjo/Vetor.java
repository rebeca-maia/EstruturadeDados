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
	Esse algoritmo n�o � eficiente
	*/
	
	/*public void adiciona(String elemento) throws Exception{
		if(this.tamanho < this.elementos.length){
		this.elementos[this.tamanho]=elemento;
		this.tamanho++;
		}else{
			throw new Exception("O vetor j� est� cheio");
			}
	}
	Outra forma de fazer isso � usando o m�todo abaixo
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
	
	//para add elemento em qualquer posi��o
	public boolean adiciona(int posicao,String elemento){
		//verifica se a posi��o � v�lida
		if(!(posicao >=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
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
	
	// m�todo para remover elemento do vetor que tem como par�metro a posi��o que se deseja remover
	public void remove(int posicao){
		if(!(posicao >=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
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
	
	//obter elemento de uma posi��o do array
	public String busca (int posicao){
		if(!(posicao >=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
	}
	//verificar se o elemento existe atrav�s de busca sequencial
	/*public boolean busca( String elemento){
		for(int i =0;i<this.tamanho;i++){
			if(this.elementos[i].equals(elemento)){
				return true;
			}
		}
	return false;
	}
	*/
	
	//outra forma de fazer isso � utilizando o m�todo abaixo
	public int busca( String elemento){
		for(int i =0;i<this.tamanho;i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
	return -1;
	}
	














}

