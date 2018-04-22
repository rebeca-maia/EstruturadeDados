package com.rebeca.estruturadados.stack;

@SuppressWarnings("rawtypes")
public class Inversao{
	 int tam;
	 String[] el = new String[tam];
	 String t;
	 Pilha p;
	 
	 
	 public Inversao(String t, int tam) {
		this.tam=tam;
		this.t = t;
		this.p = new Pilha(10);
	}
	 
	 @SuppressWarnings("unchecked")
	public void reverse(){
		 aumentaCapacidade();
		 el = t.split(" ");
		 for(int i =el.length-1;i>=0;i--){
			 if(el[i] != null){
				 p.empilha(el[i]);
			 }
		 }
		 System.out.println(p);
	 }
	 private void aumentaCapacidade(){
			if(this.tam == this.el.length){
				String [] elementosNovos = new String[this.el.length *2];
				for(int i=0; i<this.el.length;i++){
					elementosNovos[i]=this.el[i];
				}
				this.el=elementosNovos;
			}
		}
	 
	
	
	 
	

}
