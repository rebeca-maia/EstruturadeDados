package com.rebeca.estruturadados.vetor;



public class Lista<T> {
//configurar tipo dinamicamente
	 protected T[] elementos;
	 protected int tamanho;
	 int last = 0;

	@SuppressWarnings("unchecked")
	public Lista(int capacidade){
		this.elementos=((T[]) new Object[capacidade]);
		this.tamanho=0;
	}
	/*public Lista(int capacidade,Class<T> tipoClasse){
			this.elementos= (T[]) Array.newInstance(tipoClasse, capacidade);
			this.tamanho=0;
		}*/

	//para adicionar elemento final do vetor 
	public boolean adiciona(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho]=elemento;
			this.tamanho++;
			return true;
		}else{
			return false;
		}
	}//O(1) Omega(1)

	//para add elemento em qualquer posição
	public boolean adiciona(int posicao,T elemento){
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
	//adiciona no começo
	public boolean adicionaNoComeco(T elemento){
		//mover todos os elementos
		for(int i =this.tamanho-1; i>=0;i--){
			this.elementos[i+1]=this.elementos[i];
		}
		this.elementos[0]=elemento;
		this.tamanho++;

		return true;
	}// No melhor dos casos, não tem nenhum elemento na lista ainda, e não é necessário mover todos os elementos
	//Omega(1)
	//No pior dos casos, O(N)

	//aumentar capacidade do vetor
	@SuppressWarnings("unchecked")
	private void aumentaCapacidade(){
		if(this.tamanho == this.elementos.length){
			T [] elementosNovos =(T[]) new Object[this.elementos.length *2];
			for(int i=0; i<this.elementos.length;i++){
				elementosNovos[i]=this.elementos[i];
			}
			this.elementos=elementosNovos;
		}
	}

	/*public T obtem(int posicao){
		return this.busca(posicao);
	}*/

	//obter elemento de uma posição do array
	public T busca (int posicao){
		if(!(posicao >=0 && posicao<tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	//verificar se o elemento existe através de busca sequencial

	public int busca( T elemento){
		for(int i =0;i<this.tamanho;i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;

	}
	
	public int ultimoIndice(T elemento){
	
		for(int i =this.tamanho-1;i>=0;i--){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	public boolean contem(T elemento){
		return busca(elemento) > -1;//>=0
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
	}// O(N) Omega(1)
	
	public void remove(T elemento){
		int pos = this.busca(elemento);
		if (pos > -1){
			this.remove(pos);
		}
	}// O(N) Omega(N)
	
	public void limpar(){
		//opção 1
		//this.elementos = (T[]) new Object[this.elementos.length];
		
		//opção 2
		//this.tamanho = 0;
		
		//opção 3
		for (int i=0; i<this.tamanho; i++){
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	// para verificar quantidade de elementos(o tamanho real) no vetor
	public int tamanho(){
		return this.tamanho;
	}

	public boolean isEmpty(){
		return tamanho ==0;
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
	

	public T getItem(int i){
        for (int j = 0; j < last-1; j++) {
            if(i == j){
                return elementos[j];
            }
        }
        return null;
    }
}
