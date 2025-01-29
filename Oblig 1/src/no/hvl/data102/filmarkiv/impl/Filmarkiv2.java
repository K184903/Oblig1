package no.hvl.data102.filmarkiv.impl;

import java.util.ArrayList;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.LinearNode;

public class Filmarkiv2 implements FilmarkivADT {
	private int antall;
	private LinearNode<Film> start;

	public Filmarkiv2() {
		this.start = null;
		this.antall = 0;
	}

	@Override
	public Film finnFilm(int nr) {
	    LinearNode<Film> filmer = start;  
	    while (filmer != null) {
	        if (filmer.getData().getFilmnr() == nr) {
	            return filmer.getData();  
	        }
	        filmer = filmer.getNext(); 
	    }
	    return null;
	}


	@Override
	public void leggTilFilm(Film nyFilm) {
		LinearNode<Film>  nyNode = new LinearNode<>(nyFilm);
		nyNode.setNext(start);
		start = nyNode;
		antall++;
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		if(start == null) {
			return false;
		} 
		if( start.getData().getFilmnr() == filmnr) {
			start = start.getNext();
			antall--;
			return true;	
		}
		LinearNode<Film> filmer = start; 
		while(filmer.getNext()!= null) {
			if(filmer.getNext().getData().getFilmnr() == filmnr) {
				filmer.setNext(filmer.getNext().getNext());
				antall--;
				return true;
			}
			filmer = filmer.getNext();
				
			}
			return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		ArrayList<Film> resultater = new ArrayList<>();
		LinearNode<Film> aktuell = start;
		
		while(aktuell!=null) {
			if (aktuell.getData().getFilm().toLowerCase().contains(delstreng.toLowerCase())) {
                resultater.add(aktuell.getData());
            }
			aktuell = aktuell.getNext();
		}
		return resultater.toArray(new Film[0]);
	}
	

	@Override
	public Film[] soekProdusent(String delstreng) {
		
		ArrayList<Film> resultater = new ArrayList<>();
		for (int i = 0; i < antall; i++) {
			if (filmer[i].getProdusent().toLowerCase().contains(delstreng.toLowerCase())) {
				resultater.add(filmer[i]);
			}
		}

		return resultater.toArray(new Film[0]);
	}

	@Override
	public int antall(Sjanger sjanger) {
		 int antallfilmer = 0;
		 LinearNode<Film> aktuell = start; 
		 
		 while (aktuell != null) {
			 if (aktuell.getData().getSjanger().equals(sjanger)) {
				 antallfilmer+=1;
			 }
		 }
		 return antallfilmer;
	}

	@Override
	public int antall() {
		return antall;
	}

}