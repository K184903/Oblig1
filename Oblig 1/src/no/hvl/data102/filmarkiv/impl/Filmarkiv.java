package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.impl.Sjanger;

import java.util.ArrayList;

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
		for (int i = 0; i < filmer.length; i++) {
			if (filmer[i].getFilmnr() == nr) {
				return filmer[i];
			}
		}
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if (filmer.length > nesteLedig) {
			filmer[nesteLedig] = nyFilm;
			nesteLedig++;
		} else {
			System.out.println("Tabellen er full");
		}
	}

	@Override
	public boolean slettFilm(int filmnr) {
		for (int i = 0; i < filmer.length; i++) {
			if (filmer[i].getFilmnr() == filmnr) {
				filmer[i] = filmer[nesteLedig-1];
				filmer[nesteLedig - 1] = new Film();
				nesteLedig--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {

		ArrayList<Film> resultater = new ArrayList<>();

		for (int i = 0; i < nesteLedig; i++) {
			if (filmer[i].getFilm().toLowerCase().contains(delstreng)) {
				resultater.add(filmer[i]);
			}
		}
		return resultater.toArray(new Film[0]);
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		
		ArrayList<Film> resultater = new ArrayList<>();
		for (int i = 0; i < nesteLedig; i++) {
			if (filmer[i].getProdusent().toLowerCase().contains(delstreng.toLowerCase())) {
				resultater.add(filmer[i]);
			}
		}

		return resultater.toArray(new Film[0]);
	}

	@Override
	public int antall(Sjanger sjanger) {
		 int antall = 0;
		 for (int i = 0; i < nesteLedig; i++) {
			 if(filmer[i].getSjanger() == sjanger) {
				 antall++;
				 
			 }
		// if (filmer[i].getSjanger().toString().equals(sjanger.toString())) {
	     // antall += 1;
			 }
		 
		 return antall;
	}


	@Override
	public int antall() {
		return nesteLedig - 1;
	}

}
