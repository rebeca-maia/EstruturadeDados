package com.rebeca.estruturadados.ordenacao;
//import com.rebeca.estruturadados.analisealgoritmo.StopWatch;
import com.rebeca.estruturadados.*;

public class Main {
	public static void main(String[] args) {

		/*InsertionSort od = new InsertionSort(10);
		od.show();
		
		SelectionSort s = new SelectionSort(10);
		s.show();
		
		ShellSort l = new ShellSort(10);
		l.show();
		*/
		//StopWatch time = new StopWatch();
        //time.start();
		MergeSort m = new MergeSort(16);
		//time.stop();
		//System.out.println("tempo:  "+time.getElapsedTimeSecs());
		m.show();
		/*
		//time.start();
		QuickSort q = new QuickSort(10);
		//time.stop();
		//System.out.println("tempo:  "+time.getElapsedTimeSecs());
		q.show();
		
		StopWatch time = new StopWatch();
		time.start();
		RadixSort r = new RadixSort(16000);
		time.stop();
		System.out.println("tempo:  "+time.getElapsedTimeSecs());
		
		*/
	
	}
}
