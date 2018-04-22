package com.rebeca.estruturadados.ordenacao;
import java.util.*;

public class RadixSort {
	private int[]input;
	
	public RadixSort(int tam){
		this.input=new int[tam];
        this.addLista();
        this.sort();
	}
	
	private void addLista(){
        for (int i = 0; i < input.length; i++) {
            input[i] = 20000 + (int) (Math.random()*(40000-(20000)));
        }
	}
	
	//função para pegar o valor máximo do array
	private int getMax (){
		int mx=input[0];
		for(int i=1;i<input.length;i++){
			if(input[i]>mx){
				mx=input[i];
			}
		}
		return mx;
	}
	
	//função para contar a ordenação do array de acordo com o numero de casas representado pelo exp
	private void countSort(int exp){
		int output[]=new int[input.length];
		int i;
		int count[]=new int[10];
		Arrays.fill(count, 0);	//atribui 0 a cada elemento do array especificado
		
		//guarda o numero de ocorrências em count[]
		for(i=0;i<input.length;i++){
			count[(input[i]/exp)%10]++;
		}
		
		//calcula uma soma corrente dos contadores de modo que c[i] se torna o número de elementos em 
		//input menor ou igual a i.
		//altera count[i] para que este agora contenha a atual posição desse digito em output[]
		for(i=1;i<10;i++){
			count[i]+=count[i-1];
		}
		//Finalmente, o algoritmo explora input de trás para frente para colocar seus elementos, em ordem, 
		//no array output.
		for(i=input.length-1;i>=0;i--){
			output[count[(input[i]/exp)%10]-1]=input[i];
			count[(input[i]/exp)%10]--;
		}
		//copia o array output para input[], para que input[] agora contenha os numeros ordenados de acordo com
		//o digito atual
		for(i=0;i<input.length;i++){
			input[i]=output[i];
		}
	}
	
	//função principal para ordenar o array a[]
	public void sort(){
		int m=getMax(); //encontra o numero maximo para saber o numero de casas decimais
		
		//chama countSort para cada casa decimal.Em vez de passar o numero de digitos, exp é passado
		//exp = numero de casas decimais do valor máximo, onde i é o numero de casas decimais atual
		for(int exp=1;m/exp>0;exp*=10){
			countSort(exp);
		}
	}
	
	public void show(){
        for (int i = 0; i < input.length; i++)
            System.out.print(input[i]+"  ");
        
    }
	
}


