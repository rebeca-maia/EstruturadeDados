package com.rebeca.estruturadados.stack;

public class CalculadoraPosFixa {
	PilhaEncadeada<Character> operator;
	PilhaEncadeada<Integer> operand;
	
	public CalculadoraPosFixa(){
		this.operand = new PilhaEncadeada<>();
		this.operator = new PilhaEncadeada<>();
	}
	
	public void resultadoFinal(String val){
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
			case '+':
				operator.empilha(val.charAt(i));
				break;
			case '-':
				operator.empilha(val.charAt(i));
				break;
			case '*':
				operator.empilha(val.charAt(i));
				break;
			case '/':
				operator.empilha(val.charAt(i));
				break;
			default:
				throw new IllegalArgumentException("Cactere invalido!");
			}
			i--;
		}
		selecionarElementos();
		
	}
	
	
	
	public void selecionarElementos(){
		
		if(operator.size()+2 >= operand.size()){
            throw new IllegalStateException("Quantidade de numeros maior que a de operadores!");
        }else{
            while(operator.size() != 0 && operand.size()!= 1){
                Character operators = operator.desempilha();
                Integer numb1 = operand.desempilha();
                Integer numb2 = operand.desempilha();
       
                operand.empilha(calcular(operators, numb1, numb2));
        
            }
            operand.imprimir();
        }
	}
	
	public int calcular(Character op,Integer numb1,Integer numb2){
        if(op == '+'){
            return numb1+numb2;
        }
        else if(op == '-'){
            return numb1 - numb2;
        }
        else if(op == '*'){
            return numb1 * numb2;
        }
        else{
            if(numb2 != 0){
                return numb1 / numb2;
            }else{
                throw new ArithmeticException("Divisao por zero!");
            } 
        }
      
    }
}