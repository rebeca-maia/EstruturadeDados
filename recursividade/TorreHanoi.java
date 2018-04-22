package com.rebeca.estruturadados.recursividade;

public class TorreHanoi {
	
	public void resolve(int qtd,int origem, int destino,int aux){
		if(qtd>0){
			resolve(qtd-1,origem,aux,destino);
			System.out.printf("Torre %s --> Torre %s", +origem,+destino);
			resolve(qtd-1,aux,destino,origem);
		}
	}
	
	

}
