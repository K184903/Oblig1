package no.hvl.data102.filmarkiv.impl;

import java.util.Objects;

public class Film {
	private int filmnr;
	private String produsent;
	private String film;
	private int Aar;
	private Sjanger sjanger;
	private String filmselskap;
	
	 public enum Sjanger {
	        ACTION, DRAMA, KOMEDIE, SKREKK, SCI_FI, ANIMASJON, DOKUMENTAR
	    }
	 
	 //tom konstruktør
	 public Film() {
	        this.filmnr = 0;
	        this.produsent = "";
	        this.film = "";
	        this.Aar = 0;
	        this.sjanger = null; 
	        this.filmselskap = "";
	    }

	public Film(int filmnr, String produsent, String film, int aar,Sjanger sjanger, String filmselskap) {
		super();
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.film = film;
		this.Aar = aar;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
	}

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

	public int getAar() {
		return Aar;
	}

	public void setAar(int aar) {
		Aar = aar;
	}
	public Sjanger getSjanger() {
        return sjanger;
    }

    public void setSjanger(Sjanger sjanger) {
        this.sjanger = sjanger;
    }

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Aar, film, filmnr, filmselskap, produsent, sjanger);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return Aar == other.Aar && Objects.equals(film, other.film) && filmnr == other.filmnr
				&& Objects.equals(filmselskap, other.filmselskap) && Objects.equals(produsent, other.produsent)
				&& sjanger == other.sjanger;
	}

	

}
