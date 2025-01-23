package no.hvl.data102.filmarkiv.kilent;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;


public class Tekstgrensesnitt extends Film {
	
	// Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
	public Film lesFilm(){
	//TODO
	}
	// Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void skrivUtFilm(Film film) {
		System.out.println("Filmnummer: " + getFilmnr());
		System.out.println("Produsent: " + getProdusent());
		System.out.println("Film: " + getFilm());
		System.out.println("År: " + getAar());
		System.out.println("Sjanger: " + getSjanger().toString());
		System.out.println("Filmselskap: " + getFilmselskap());
	}
	// Skriver ut alle filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
		//TODO
			
	}
	
	// Skriver ut alle Filmer av en produsent (produsent er delstreng)
	public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
	// TODO
	}
	// Skriver ut en enkel statistikk som inneholder antall filmer totalt
	// og hvor mange det er i hver sjanger.
	public void skrivUtStatistikk(FilmarkivADT arkiv) {
	// TODO
	}
	// osv ... andre metoder
	}

