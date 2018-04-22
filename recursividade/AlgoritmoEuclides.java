package com.rebeca.estruturadados.recursividade;


public class AlgoritmoEuclides{
	
	public AlgoritmoEuclides(){
		super();
	}
	
	public int mdc(int p,int q){
		if(q>p){
			return mdc(q,p);
		}
		if(q==0){
			return p;
		}else{
			return mdc(q,p%q);
		
		}
	}

	

	
	public int mdcTres(int p,int q,int r){
		if(r==0){
			return p%q;
		}else if(r ==0 & q==0){
			return p;	
		}else{
			return mdcTres(r,(p%q),((p%q)%r));
		}
	}

	
	
}
