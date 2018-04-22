package com.rebeca.estruturadados.queue;

public class FilaCircular<T> {
	private T item[];
	private int frente=0,tras=0;
	private int tam;
	
	@SuppressWarnings("unchecked")
	public FilaCircular(int maxTam){
		this.item =(T[]) new Object [maxTam];
		this.tam=maxTam;
		
	}
	
	public void enfileira(T x){
		if((this.tras+1)% this.tam== this.frente){
			this.aumentarTamanho();
			this.item[this.tras] = x;
			this.tras=(this.tras+1)%this.tam;
		}else{
		this.item[this.tras] = x;
		this.tras= (this.tras+1)%this.tam;
		}
	}
	
	public boolean isEmpty(){
		return (this.frente == this.tras);
	}
	
	public T desenfileira(){
		T item = null;
		if(isEmpty()){
			throw new IndexOutOfBoundsException ("Fila vazia!");
		}
		item = this.item[this.frente];
		this.item[this.frente]=null;
		this.frente= (this.frente+1)%this.tam;
		return item;
	}
	
	public boolean full(){
		return (tras+1)%tam==frente;
	}
	
	
	public int realSize(){
		 if (tras < frente) {
	            return tam - (frente - tras);
	     }else if(tras>frente){
	     return tras - frente;
	     }
		return -1;
   }
	
	
	@SuppressWarnings("unchecked")
	public void aumentarTamanho(){
		T novosItens[] = (T[]) new Object [2*tam];
		for(int i=0;i>realSize();i++){
			novosItens[i]= item[(frente+i)%tam];
		}
		item=novosItens;
		frente=0;
		tras=realSize();
		tam=tam*2;
	}
	
	public void imprimir() {
        for (int i = 0; i < item.length; i++) {
            if (item[i] != null) {
                System.out.println(" " + item[i]);
            }
        }
        System.out.println("------- "+item[frente+1]);
    }

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0;i<realSize();i++){
			if(item[i] != null){
			s.append(this.item[i]);
			s.append(", ");
			}
		}
		
		if(realSize() > 0){
			s.append(this.item[(realSize())]);
		}
		
		s.append("]");
		
		return  s.toString();
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public T[] getItem() {
		return item;
	}

	public void setItem(T[] item) {
		this.item = item;
	}

	public int getFrente() {
		return frente;
	}

	public void setFrente(int frente) {
		this.frente = frente;
	}

	public int getTras(){
		return tras;
	}

	public void setTras(int tras) {
		this.tras = tras;
	}

}
