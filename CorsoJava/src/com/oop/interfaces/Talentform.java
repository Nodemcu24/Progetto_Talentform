package com.oop.interfaces;

public class Talentform implements IBackend, IFrontEnd {
	
	 private int numeroOre;
	 private String Tecnologia;
	 private int numeroStudenti;
	 private String ProjectWork;
	
	
	

	public Talentform(int numeroOre, String tecnologia, int numeroStudenti, String projectWork) {
		super();
		this.numeroOre = numeroOre;
		Tecnologia = tecnologia;
		this.numeroStudenti = numeroStudenti;
		ProjectWork = projectWork;
	}


	@Override
	public String getProjectWork() {
		
		return getProjectWork();
	}

	@Override
	public int getNumeroOre() {
		
		return getNumeroOre();
	}

	@Override
	public String getTecnologia() {
		
		return  getTecnologia();
	}

	@Override
	public int getNumeroStudenti() {
		
		return getNumeroStudenti();
	}




public static void main(String[] args) {
	
      Talentform backend = new Talentform (148,"java",  13,  "ApplicativoFullstack ");
       Talentform frontEnd = new Talentform (60, "React   " , 13, "ApplicativoFrontEnd " );
    		  
    	System.out.println(backend.numeroOre);	  
        System.out.println(backend.Tecnologia);
        System.out.println(backend.numeroStudenti);
        System.out.println(backend.ProjectWork);
        
        System.out.println(frontEnd.numeroOre);
        System.out.println(frontEnd.Tecnologia);
        System.out.println(frontEnd.numeroStudenti);
        System.out.println(frontEnd.ProjectWork);
        
    }


}
