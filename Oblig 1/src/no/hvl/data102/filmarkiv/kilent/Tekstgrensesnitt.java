package no.hvl.data102.filmarkiv.kilent;

<<<<<<< HEAD
import java.util.Scanner;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;

public class Tekstgrensesnitt {
	
	// Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
	public Film lesFilm(){
	  Scanner scanner = new Scanner (System.in);
	    System.out.println("Filmnummer");
	    int nr = scanner.nextInt();
	  
	   System.out.println("Film: ");
	   String  film = scanner.nextLine();
	   
	   System.out.println("Navn på produsent: ");
	   String prod = scanner.nextLine();
	   
	   System.out.println("År for lansering :");
	   int aar = scanner.nextInt();
	   
	   System.out.println("Sjanger :");
	   String sjanger = scanner.nextLine();
	   
	   System.out.println("Navn på Filmselskap :");
	   String filmselskap = scanner.nextLine();
	   
	   
	   Film f = new Film(nr, prod, film, aar, sjanger, filmselskap);
	   return f;
	}
	// Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void skrivUtFilm(Film film) {
	
=======
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
>>>>>>> 2adc1b8c6bc4b66bb64ce6fcf8699dbacb66b1af
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

