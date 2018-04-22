package com.rebeca.estruturadados.analisealgoritmo;

public class StopWatch {
	
	private double startTime = 0;
    private double stopTime = 0;
    private boolean running = false;


    public void start() {
    	this.startTime = System.currentTimeMillis();
    	this.running = true;
    }


    public void stop() {
    	this.stopTime = System.currentTimeMillis();
    	this.running = false;
    }


    //tempo decorrido em milissegundos
    public double getElapsedTime() {
    	double elapsed;
    	if (running) {
    		elapsed = (System.currentTimeMillis() - startTime);
    }
    else {
      elapsed = (stopTime - startTime);
    }
    return elapsed;
  }


  //tempo decorrido em segundos
  public double getElapsedTimeSecs() {
    double elapsed;
    if (running) {
      elapsed = ((System.currentTimeMillis() - startTime) / 1000);
    }
    else {
      elapsed = ((stopTime - startTime) / 1000);
    }
    return elapsed;
  }
}
