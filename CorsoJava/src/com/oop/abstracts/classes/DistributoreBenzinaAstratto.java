package com.oop.abstracts.classes;

import com.oop.classes.intro.Auto;

public abstract class DistributoreBenzinaAstratto {

    
    public abstract void rifornisci(double unaQuantita);

   
    public abstract void vendi(double euro, Auto auto);

    
    public abstract void aggiorna(double unPrezzoPerLitro);
}
