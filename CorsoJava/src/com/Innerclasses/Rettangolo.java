package com.Innerclasses;



public class Rettangolo {

    private double base;
    private double altezza;
    
    public Rettangolo(double base, double altezza) {
        super();
        this.base = base;
        this.altezza = altezza;
    }

    class Area {
        
        public double getArea() {
            return base*altezza;
        }
        
    }
    
    public static void main(String[] args) {
        
        Rettangolo rettangolo = new Rettangolo(5, 2);
        Rettangolo.Area area = rettangolo.new Area();
        System.out.println(area.getArea());

    }

}