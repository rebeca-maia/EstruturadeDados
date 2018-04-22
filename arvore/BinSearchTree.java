package com.rebeca.estruturadados.arvore;

import java.util.NoSuchElementException;

import com.rebeca.estruturadados.queue.FilaEncadeada;
import com.rebeca.estruturadados.stack.PilhaEncadeada;

public class BinSearchTree {

    NodeBST raiz;

    public int size() {
        return size(raiz);
    }

    private int size(NodeBST x) {
        return (x == null) ? 0 : x.N;
    }

    public int pesquisa(int key) {
        return pesquisa(raiz, key);
    }

    private int pesquisa(NodeBST x, int key) {
        if (x == null) {
            return 0;
        }
        if (key < x.key) {
            return pesquisa(x.left, key);
        } else if (key > x.key) {
            return pesquisa(x.right, key);
        } else {
            return x.getVal();
        }
    }

    public int getAltura() {
        return getAltura(this.raiz);
    }

    private int getAltura(NodeBST raiz) {
        if (raiz == null) {
            return 0;
        }
        int altEsq = getAltura(raiz.left);
        int altDir = getAltura(raiz.right);
        if (altEsq > altDir) {
            return altEsq + 1;
        } else {
            return altDir + 1;
        }
    }

    public void adiciona(int key, int val) {
        raiz = adiciona(raiz, key, val);
    }

    private NodeBST adiciona(NodeBST x, int key, int val) {
        if (x == null) {
            return new NodeBST(key, val, 1);
        }
        if (key < x.key) {
            x.left = adiciona(x.left, key, val);
        } else if (key > x.key) {
            x.right = adiciona(x.right, key, val);
        } else {
            x.setVal(val);
        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public boolean isEmpty() {
        return (raiz == null) ? true : false;
    }

    public NodeBST remove(int key) {
        return remove(raiz, key);
    }

    private NodeBST remove(NodeBST no, int key) {
        if (isEmpty()) {
            throw new NullPointerException();
        } else {//verifica se o valor passado por parâmetro é maior ou menor do que o valor contido no nó passado por parâmetro
            if (key < no.key) {//se for menor, acessa o nó esquerdo e faz isso até encontrá-lo
                no.left = remove(no.left, key);
            } else if (key > no.key) {//mesma coisa se for maior
                no.right = remove(no.right, key);
            } else if (no.left != null && no.right != null) {//quando encontra o valor, verifica se ele tem filhos a esquerda											//e a direita
                no.setVal(findMinimum(no.right).key);//caso tenha, vá para a subarvore da direita e procura o nó de
                //menor valor à esquerda.
                no.right = removeMin(no.right);//atribui o valor desse menor nó ao nó que está sendo excluido
            } else { // se o nó passado como parâmetro for uma folha, remove seu valor, e atualiza o pai
                no = (no.left != null) ? no.left : no.right;//refazer a ligação que o pai do menor nó à esquerda tinha
            }
            return no;//o nó passado como parâmetro foi excluído
        }
    }

    private NodeBST removeMin(NodeBST no) {
        if (isEmpty()) {
            throw new NoSuchElementException("Árvore Vazia");
        } else if (no.left != null) {
            no.left = removeMin(no.left);
            return no;
        } else {
            return no.right;
        }
    }

    private NodeBST findMinimum(NodeBST no) {
        if (no != null) {
            while (no.left != null) {
                no = no.left;
            }
        }
        return no;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public boolean buscaProfundidade(NodeBST no, int val) {
        PilhaEncadeada<Object> p = new PilhaEncadeada();
        p.empilha(val);
        NodeBST x;
        while (p != null) {
            x = (NodeBST) p.desempilha();
            if (x.getVal() == val) {
                return true;
            } else {
                p.empilhaTodos3(x.left);
                p.empilhaTodos3(x.right);
            }
        }
        return false;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public boolean buscaLargura(NodeBST no, int val) {
        FilaEncadeada<Object> f = new FilaEncadeada();
        f.enqueue(no);
        while (f != null) {
            NodeBST x;
            x = (NodeBST) f.dequeue();
            if (x.getVal() == val) {
                return true;
            } else {
                f.enfileiraTodos3(x.left);
                f.enfileiraTodos3(x.right);
            }
        }
        return false;
    }

    public void inorder() {
        inorder(raiz);
    }

    private void inorder(NodeBST no) {
        if (no != null) {
            inorder(no.left);
            System.out.print(no.key + " ");
            inorder(no.right);
        }
    }
}
