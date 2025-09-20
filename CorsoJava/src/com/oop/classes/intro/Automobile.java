package com.oop.classes.intro;


public class Automobile {
    
    protected double resaCarburante;
    protected double gas;
    protected boolean benzina;
    
    public void drive(double km) {
        gas = gas - (km / resaCarburante);
    }
    
    public double getResaCarburante() {
        return resaCarburante;
    }

    public void setResaCarburante(double resaCarburante) {
        this.resaCarburante = resaCarburante;
    }

    public double getGas() {
        return gas;
    }
    
    public void addGas(double rifornimento) {
        gas += rifornimento;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }
    
    
    public Automobile(  double kmL) {
        this.resaCarburante = kmL;
        this.gas = 0;
    }
    
    

}