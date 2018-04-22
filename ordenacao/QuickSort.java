package com.rebeca.estruturadados.ordenacao;

public class QuickSort {
	private int[] input;
	
	public QuickSort(int tam){
		this.input=new int[tam];
        this.addLista();
        sort(0,input.length-1);
	}
	public void addLista(){
        for (int i = 0; i < input.length; i++) {
            input[i] = -20000 + (int) (Math.random()*(20000-(-20000)));
        }
	}
	
	public void sort(int lo,int hi){
		if(lo<hi){
			int p=quick(lo,hi);
			sort(lo,p-1);
			sort(p+1,hi);
		}
	 }
	
	public int quick(int lo, int hi){
		int p = input[lo];
		int i=lo+1;
		int f=hi;
		while(i<=f){
			if(input[i]<=p){
				i++;
			}else if(p<input[f]){
				f--;
			}else{
				int swap = input[i];
				input[i]=input[f];
				input[f]=swap;
				i++;
				f--;
			}
		}
		input[lo]=input[f];
		input[f]=p;
		return f;
	}

	public void show(){
        for (int i = 0; i < input.length; i++){
            System.out.print(input[i]);
            System.out.print(" ");
        }
    }
}
