package com.rebeca.estruturadados.arvore;

import com.rebeca.estruturadados.queue.FilaEncadeada;
import com.rebeca.estruturadados.stack.PilhaEncadeada;

public class BinTree {
	@SuppressWarnings("rawtypes")
	BinNode raiz;

	public boolean isEmpty() {
		return (raiz == null) ? true : false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes"})
	public boolean buscaProfundidade(BinNode no, int val) {
		PilhaEncadeada<Object> p = new PilhaEncadeada();
		p.empilha(val);
		while (p != null) {
			BinNode x;
			x = (BinNode) p.desempilha();
			if (x.getVal() == val) {
				return true;
			} else {
				p.empilhaTodos2(x.getEsq());
				p.empilhaTodos2(x.getDir());
			}
		}
		return false;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean buscaLargura(BinNode no, int val) {
		FilaEncadeada<Object> f = new FilaEncadeada();
		f.enqueue(no);
		while (f != null) {
			BinNode x;
			x = (BinNode) f.dequeue();
			if (x.getVal() == val) {
				return true;
			} else {
				f.enfileiraTodos2(x.getEsq());
				f.enfileiraTodos2(x.getDir());
			}
		}
		return false;
	}

	@SuppressWarnings("rawtypes")
	public int qtdNos(BinNode raiz) {
		return (raiz == null) ? 0 : 1 + qtdNos(raiz.getEsq()) + qtdNos(raiz.getDir());
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private void show(BinNode no) {
		if (no != null) {
			show(no.getEsq());
			System.out.print(no.getVal() + " ");
			show(no.getDir());
		}
	}
}
