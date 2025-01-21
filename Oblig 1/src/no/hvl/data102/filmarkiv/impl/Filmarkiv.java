package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {
	private Film[] filmer; 
    private int nesteLedig;

    public Filmarkiv(int antall) {
        this.filmer = new Film[antall];
        this.nesteLedig = 0;
    }

	@Override
	public Film finnFilm(int nr) {
	  for(int i = 0; i<filmer.length;i++) {
		  if(filmer[i].getFilmnr()==nr) {
			  return filmer[i];
		  }
	  }
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if(filmer.length<nesteLedig) {
			nesteLedig++;
		}
		
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		for (int i = 0; i < filmer.length; i++) {
			if (filmer[i].getFilmnr() == filmnr) {
				filmer[i] = new Film();
				return true;
			}
		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
