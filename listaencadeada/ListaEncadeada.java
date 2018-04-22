package com.rebeca.estruturadados.listas;

public class ListaEncadeada<T> {
	Node<T> first;
    Node<T> last;
    

	public ListaEncadeada() {
        this.first = new Node<T>();
        this.last = first;
    }
    
    // add no final
	public void adiciona(Object obj){
        last.next = new Node<T>();
        last = last.next;
        last.item = (T) obj;
        last.next = null;
    }
    //atualizar last, caso add na ultima posicao
    public void adiciona(T obj,int posicao){
        Node<T> aux = first;
        if(posicao<=size()){
            for (int i = 0; i < posicao; i++) {
                aux = aux.next;
            }
         if( posicao > size()){
            	
            throw new IllegalArgumentException("Posição inválida");	
         }
            Node<T> aux2 = aux.next;
            aux.next = new Node<T>();
            aux.next.item = obj;
            aux.next.next = aux2;
        }
    }
    
    public void addFirst(Object obj){
    	
    	Node<T> aux = new Node<T>();
        aux.item = (T) obj;
        aux.next = first.next;
        first.next = aux;
    }
    
    
    /*Algoritmo para remover o item na lista.
    public T remove(T obj){
        Node aux = first;
        while(aux.next != null && !aux.next.item.equals(obj)){
            aux = aux.next;
        }
        if(aux.next != null){
            T remove = (T) aux.next.item;
            aux.next = aux.next.next;
            return remove;
        }
        if(aux.next == null){
            last= aux;
        }
        return null;
    }*/
    
    // ajeitar o codigo
    public T remove(int posicao){
       Node<T> aux = first;
       int i = -1;
       while(aux.next != null && i< posicao){
           if(i+1 == posicao){
        	   T remove = (T) aux.next.item;
               aux.next = aux.next.next;
               return remove;
           }else{
               i++;
               aux = aux.next;
           }
               
       }
       return null;
    } 
    
    public T removeFirst(){
        T aux = (T) first.next.item;
        first.next = first.next.next;
        return aux;
    }
    
	public int busca(T obj){
        Node<T> aux = first;
        int i = -1;
        while(aux.next != null){
            i++;
            if(aux.next.item.equals(obj)){
                return i;
            }else{
                aux = aux.next;
            }
        }
        return -1;
    }
    
    public boolean isEmpty(){
        
        if(last == first){
            return true;
        }else{
            return false;
        }
    }
    
    public T first(){
        return (T) first.next.item;
    }
   
	public int size(){
        Node<T> aux = first;
        int cont = 0;
        while(aux.next != null){
            cont ++;
            aux = aux.next;
        }
        return cont;
    }
	
	public void imprimir(){
        Node<T> aux = new Node<>();
        aux = first;
        while(aux.next != null){
            System.out.println(aux.next.item);
            aux = aux.next;  
        }
        System.out.println("==The End==");
       
    }

    
    @Override
    public String toString(){
        if(isEmpty()){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node<T> x = first.next;
      
        while(x != null){
          
        builder.append(x.item);
            builder.append(" ");
         x = x.next;
              
        }
        
       builder.append("]");
       
       return builder.toString();
    }



	
}
