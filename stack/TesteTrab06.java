package com.rebeca.estruturadados.stack;

public class TesteTrab06 {

	public static void main(String[] args) {
		Inversao w = new Inversao("Encape seu livro", 20);
		w.reverse();
		
		
		CalculadoraPosFixa a = new CalculadoraPosFixa();
	       String expressao = "682+*2/";
	       a.resultadoFinal(expressao);
	}

}
