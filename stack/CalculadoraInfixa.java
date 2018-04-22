package com.rebeca.estruturadados.stack;


public class CalculadoraInfixa {
	
	PilhaEncadeada<Character> operator;
	PilhaEncadeada<Integer> operand;
	
	public CalculadoraInfixa(){
		this.operand = new PilhaEncadeada<>();
		this.operator = new PilhaEncadeada<>();
	}
	
	public void guardarValores(String val){
		int i = val.length()-1;
		while(i>=0){
			switch(val.charAt(i)){
			case '0':
				operand.empilha(0);
				break;
			case '1':
				operand.empilha(1);
				break;
			case'2':
				operand.empilha(2);
				break;
			case '3':
				operand.empilha(3);
				break;
			case '4':
				operand.empilha(4);
				break;
			case '5':
				operand.empilha(5);
				break;
			case '6':
				operand.empilha(6);
				break;
			case '7':
				operand.empilha(7);
				break;
			case '8':
				operand.empilha(8);
				break;
			case '9':
				operand.empilha(9);
				break;
			case '(':
			
			case ')':
			
			}
			
		}
	}
	

}
