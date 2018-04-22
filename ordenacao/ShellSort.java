package com.rebeca.estruturadados.ordenacao;

//import com.rebeca.estruturadados.analisealgoritmo.StopWatch;

public class ShellSort {
	int j;
	private Integer[] input;
	
	public ShellSort(int tam) {
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
		int h = 1; //tamanho do salto
		int aux;
		while(h < input.length){ //calcula o h inicial
			h *=3 + 1;
		}
		h/=3; //atualiza o valor de h
		while(h > 0){
			for(int i=h;i<input.length;i++){
				aux= input[i];
				j = i;
				while(j>=h && input[j-h]>aux){ //efetua comparações entre elementos com distância h
					input[j] = input[j-h];
					j -=h;
				}
				input[j]=aux;
			}
			h/=2;
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