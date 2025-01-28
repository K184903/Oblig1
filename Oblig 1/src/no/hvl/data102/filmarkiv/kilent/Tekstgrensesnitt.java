package no.hvl.data102.filmarkiv.kilent;

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


	public void skrivUtFilm(Film film) {
		System.out.println("Filmnummer: " + getFilmnr());
		System.out.println("Produsent: " + getProdusent());
		System.out.println("Film: " + getFilm());
		System.out.println("År: " + getAar());
		System.out.println("Sjanger: " + getSjanger().toString());
		System.out.println("Filmselskap: " + getFilmselskap());
<<<<<<< HEAD

=======
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
>>>>>>> a38e5339e345cc64aef2f9babf75015a2787ba64
	}

	
	public void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
		Film[] filmer = arkiv.soekTittel(delstreng);
        for (Film film : filmer) {
            System.out.println(film);
	}
}

	public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
		Film[] filmer = arkiv.soekProdusent(getProdusent());
        for (Film film : filmer) {
            System.out.println(film);
	}
}

	public void skrivUtStatistikk(FilmarkivADT arkiv) {
		// TODO
		System.out.println("Totalt antall filmer: " + arkiv.antall());
        for (Sjanger sjanger : Sjanger.values()) {
            System.out.println(sjanger + ": " + arkiv.antall(sjanger));
        }
	}
	// osv ... andre metoder
}
