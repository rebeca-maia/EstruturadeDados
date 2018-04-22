package com.rebeca.estruturadados.ordenacao;
//import com.rebeca.estruturadados.analisealgoritmo.StopWatch;
public class InsertionSort {
	int key;  
    int i;
    int j;  //o número de itens ordenados 
  
    private Integer[] input;
	
	private void addLista(){
        for (int i = 0; i < input.length; i++) {
            input[i] = -20000 + (int) (Math.random()*(20000-(-20000)));
        }
	}
	
	public InsertionSort(int tam) {
        this.input = new Integer[tam];
        this.addLista();
        this.sort(); 
    }
	
    private void sort(){
    	//StopWatch time = new StopWatch();
        //time.start();
    	for ( j = 1;j<input.length;j++){ // começa com 1
    		key = input[j];
    		for (i=j-1;(i > -1) && ( input[i] > key );i -- ) { // movendo os menores valores
    			input[i+1] = input[i];
    		}
    		input[i+1]=key; //colocando a chave no local apropriado
    	}
    	//System.out.println("tempo:  "+time.getElapsedTimeSecs());
    }
    
    public void show(){
        for (int i = 0; i < input.length; i++){
            System.out.print(input[i]);
            System.out.print(" ");
        }
    }
    
}