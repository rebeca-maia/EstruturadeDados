package com.rebeca.estruturadados.arvore;
//import com.rebeca.estruturadados.queue.FilaEncadeada;
public class BinNode<T>{
	private BinNode<T> esq;
	private int val;
	private BinNode<T> dir;
	
	public BinNode<T> getEsq() {
		return esq;
	}

	public void setEsq(BinNode<T> esq) {
		this.esq = esq;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public BinNode<T> getDir() {
		return dir;
	}

	public void setDir(BinNode<T> dir) {
		this.dir = dir;
	}

	public BinNode(int val){
		this.val=val;
	}
	
	
	
}
