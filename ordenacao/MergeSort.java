package com.rebeca.estruturadados.ordenacao;

//import com.rebeca.estruturadados.analisealgoritmo.StopWatch;

public class MergeSort{
	private Integer[]input;
	private Integer[] aux;
	
	public MergeSort(int tam){
		this.input=new Integer[tam];
                this.aux = new Integer[input.length];
                this.addLista();
                sort(0,input.length-1);
        
    }
	
	public void addLista(){
        for (int i = 0; i < input.length; i++) {
            input[i] = -20000 + (int) (Math.random()*(20000-(-20000)));
        }
	}
	
	public void merge(int lo,int mid, int hi){
	
		//se estiver ordenado,para a execução
		if(is_Sorted(0,input.length-1)==true){
			return;
		}
		for(int k=lo;k<=hi;k++){
			aux[k]=input[k];
		}
		int i=lo;
		int j=mid+1;
		for(int k=lo;k<=hi;k++){
			if(i>mid){
				input[k]=aux[j++];
			}else if(j>hi){
				input[k]=aux[i++];
			}else if(aux[j]<aux[i]){
				input[k]=aux[j++];
			}else{
				input[k]=aux[i++]; 
			}
		}
	}
	
	public boolean is_Sorted(int lo, int hi){
		for(int i=lo+1;i<=hi;i++){
			if(input[i]<input[i-1]){
				return false;
			}
		}	
	return true;
	}
	
	public void sort(int lo, int hi){
		if(hi<=lo){
			return;
		}
		int mid=(hi+lo)/2;
		sort(lo,mid);
		sort(mid+1,hi);
		merge(lo,mid,hi);
		
	}
	
	public void show(){
        for (int i = 0; i < input.length; i++){
            System.out.print(input[i]);
            System.out.print(" ");
        }
    }
}
