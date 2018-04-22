package com.rebeca.estruturadados.arvore;

import com.rebeca.estruturadados.queue.FilaEncadeada;
import com.rebeca.estruturadados.stack.PilhaEncadeada;

public class Tree {
	Node raiz;

	public Node create(int val) { // criação de nós
		Node n = new Node();
		n.setVal(val);
		n.setPrim(null);
		n.setProx(null);
		return n;
	}

	// insere uma nova sub-arvore como filha de um dado no
	public void insert(Node n, Node sub_n) {
		sub_n.setProx(n.getPrim());
		n.setPrim(sub_n);
	}

	public void print(Node a) {
		System.out.println(a.getVal());
		for (Node p = a.getPrim(); p != null; p = p.getProx()) {
			print(p); // imprime cada sub-arvore filha
		}
	}

	public boolean search(Node n, int val) {
		if (n.getVal() == val) {
			return true;
		} else {
			for (Node p = n.getPrim(); p != null; p = p.getProx()) {
				if (search(p, val)) {
					return true;
				}
			}
		}
		return false;
	}

	public int getAltura(Node n) {
		int hmax = -1; // caso de arvore sem filhos
		for (Node p = n.getPrim(); p != null; p = p.getProx()) {
			int h = getAltura(p);
			if (h > hmax) {
				hmax = h;
			}
		}
		return hmax + 1;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean buscaProfundidade(Node no, int val) {
		PilhaEncadeada<Object> p = new PilhaEncadeada();
		p.empilha(val);
		while (p != null) {
			Node x;
			x = (Node) p.desempilha();
			if (x.getVal() == val) {
				return true;
			} else {
				p.empilhaTodos1(x.getPrim());
				p.empilhaTodos1(x.getProx());
			}
		}
		return false;
	}

	@SuppressWarnings({ "rawtypes", "null" })
	public boolean buscaLargura(int val) {
		FilaEncadeada fila = null;
		fila.enqueue(raiz);
		while (fila != null) {
			Node x = (Node) fila.dequeue();
			if (x.getVal() == val) {
				return true;
			} else {
				fila.enfileiraTodos1(x);
			}
		}
		return false;
	}

}
