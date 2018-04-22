package com.rebeca.estruturadados.arvore;

public class NodeBST {
	int key;
	private int val;
	NodeBST left, right;
	int N; // nós na subarvore enraizados aqui
	
	public NodeBST(int key, int val, int N){
		this.key=key;
		this.setVal(val);
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
}
