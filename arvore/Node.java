package com.rebeca.estruturadados.arvore;


public class Node{
	private int val;
	//Lista<Node> filhos;
	private Node prim;
	private Node prox;
	
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Node getPrim() {
		return prim;
	}
	public void setPrim(Node prim) {
		this.prim = prim;
	}
	public Node getProx() {
		return prox;
	}
	public void setProx(Node prox) {
		this.prox = prox;
	}
	
	//public Node(int val){
		//this.val=val;
		//this.filhos=null;
	//}
	
}
