package com.rebeca.estruturadados.ordenacao;
//import com.rebeca.estruturadados.analisealgoritmo.StopWatch;

public class SelectionSort {
	int i,j;
	private Integer[] input;
	
	public SelectionSort(int tam) {
        this.input= new Integer[tam];
        this.addLista();
        this.sort();
    }
	
	private void addLista(){
        for (int i = 0; i < input.length; i++) {
            input[i] = -20000 + (int) (Math.random()*(20000-(-20000)));
        }
	}
	
	private void sort(){
		//StopWatch time = new StopWatch();
        //time.start();
		int val_min;
	    int index_min;
        for (i=0;i<input.length-1;i++) {
            // antes de comparar, considera-se menor o valor atual do loop
            index_min = i;
            // compara com os outros valores do vetor
            for (j=i+1;j<input.length;j++){
                if (input[j] < input[index_min]){
                    index_min=j;
                    }
            }
            // troca os valores menor e maior swap
            val_min = input[index_min];
            input[index_min]=input[i];
            input[i]=val_min;
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