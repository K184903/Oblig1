package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {
	private Film[] filmer;  // Tabell for å lagre filmene
    private int antall;     // Antall filmer i arkivet

    public Filmarkiv(int kapasitet) {
        this.filmer = new Film[kapasitet];
        this.antall = 0;
    }

	@Override
	public Film finnFilm(int nr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub
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
