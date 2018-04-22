package com.rebeca.estruturadados.analisealgoritmo;

public class ThreeSum {
	
	private Integer[] la;
	
	
	public ThreeSum(int tam) {
        this.la = new Integer[tam];
        
    }
	
	public void addLista(){
        for (int i = 0; i < la.length; i++) {
            la[i] = -20000 + (int) (Math.random()*(20000-(-20000)));
        }
	}
	
	public void count() {
        int count = 0;
        StopWatch time = new StopWatch();
        time.start();
        for (int i = 0; i < la.length; i++) {
            for (int j = i+1; j < la.length; j++) {
                for (int k = j+1; k < la.length; k++) {
                    if (la[i] + la[j] + la[k] == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println("tempo:  "+time.getElapsedTimeSecs()+" valor de cont: "+count);
    } 

}
