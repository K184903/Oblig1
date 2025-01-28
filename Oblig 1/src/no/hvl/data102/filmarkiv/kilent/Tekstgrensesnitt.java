package no.hvl.data102.filmarkiv.kilent;
import no.hvl.data102.filmarkiv.impl.*;


import java.util.Scanner;
import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;

public class Tekstgrensesnitt extends Film {

	private Scanner scanner = new Scanner(System.in);

	public Film lesFilm() {

		System.out.println("Filmnummer");
		int nr = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Navn på produsent: ");
		String produsent = scanner.nextLine();

		System.out.println("Filmtittel: ");
		String film = scanner.nextLine();


		System.out.println("År for lansering :");
		int aar = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Sjanger :");
		String navn = scanner.nextLine();
		Sjanger sjanger = Sjanger.finnSjanger(navn.toUpperCase());
		

		System.out.println("Navn på Filmselskap :");
		String filmselskap = scanner.nextLine();

		return new Film();
		//return new Film(nr, produsent, film, aar, sjanger, filmselskap);
		
	}

	// Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public static void skrivUtFilm(Film film) {
		System.out.println("Filmnummer: " + film.getFilmnr());
		System.out.println("Produsent: " + film.getProdusent());
		System.out.println("Film: " + film.getFilm());
		System.out.println("År: " + film.getAar());
		if (film.getSjanger() != null) {
			System.out.println("Sjanger: " + film.getSjanger().toString());
		} else {
			System.out.println("Sjanger: Ikke satt");
		}
		System.out.println("Filmselskap: " + film.getFilmselskap());
	}
	
	// Skriver ut alle filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {

		Film[] filmer = arkiv.soekTittel(delstreng);
        for (Film film : filmer) {
            System.out.println(film);
	}
}
	// Skriver ut alle Filmer av en produsent (produsent er delstreng)
	public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
		  Film[] filmer = arkiv.soekProdusent(getProdusent());
	        for (Film film : filmer) {
	            System.out.println(film);
	        }
	    }
	
	// Skriver ut en enkel statistikk som inneholder antall filmer totalt
	// og hvor mange det er i hver sjanger.
	public void skrivUtStatistikk(FilmarkivADT arkiv) {
		  System.out.println("Totalt antall filmer: " + arkiv.antall());
	        for (Sjanger sjanger : Sjanger.values()) {
	            System.out.println(sjanger + ": " + arkiv.antall(sjanger));
	        }
	    }
	}
	// osv ... andre metoder

