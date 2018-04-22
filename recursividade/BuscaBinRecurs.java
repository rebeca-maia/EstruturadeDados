package com.rebeca.estruturadados.recursividade;

public class BuscaBinRecurs {
	
	public BuscaBinRecurs(){
		super();
	}
	
	public int pesquisa(int[]a,int x){
		int lo=0; 
		int hi=a.length-1;
		if(lo > hi){
			return -1;
		}
		int middle=(lo+(hi-lo))/2;
		if(a[middle] == x){
			return middle;
		}
		if(a[middle]<x){
			return pesquisa(a,middle-1);
		}else{
			return pesquisa(a,middle+1);
		}
	}

	
}
