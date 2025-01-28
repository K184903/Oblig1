package no.hvl.data102.filmarkiv.kilent;

import no.hvl.data102.filmarkiv.adt.FilmarkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;

import java.util.Scanner;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;

	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}
		    public void start() {
		        // Legg til noen forhåndsdefinerte filmer
		    	filmarkiv.leggTilFilm(new Film(1, "Christopher Nolan", "Inception", 2010, Sjanger.ACTION, "Warner Bros"));
		        filmarkiv.leggTilFilm(new Film(2, "Peter Jackson", "The Lord of the Rings", 2001, Sjanger.DRAMA, "New Line Cinema"));
		        filmarkiv.leggTilFilm(new Film(3, "George Lucas", "Star Wars", 1977, Sjanger.SCIFI, "Lucasfilm"));
		        filmarkiv.leggTilFilm(new Film(4, "Ridley Scott", "Gladiator", 2000, Sjanger.HISTORY, "DreamWorks"));

		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println(" FILMARKIV MENY ");
		            System.out.println("1. Legg til en ny film");
		            System.out.println("2. Søk etter filmer (delstreng i tittel)");
		            System.out.println("3. Søk etter filmer av produsent");
		            System.out.println("4. Slett en film");
		            System.out.println("5. Vis statistikk");
		            System.out.println("6. Vis alle filmer");
		            System.out.println("7. Avslutt");
		            System.out.print("Velg handling (1-7): ");

		            int valg = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (valg) {
		                case 1:
		                    leggTilNyFilm();
		                    break;
		                case 2:
		                    soekEtterTittel();
		                    break;
		                case 3:
		                    soekEtterProdusent();
		                    break;
		                case 4:
		                    slettFilm();
		                    break;
		                case 5:
		                    visStatistikk();
		                    break;
		                case 6:
		                    visAlleFilmer();
		                    break;
		                case 7:
		                    System.out.println("Avslutter programmet...");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("Ugyldig valg, prøv igjen.");
		            }
		    }
 }

		    private void leggTilNyFilm() {
		        Film nyFilm = tekstgr.lesFilm();
		        filmarkiv.leggTilFilm(nyFilm);
		        System.out.println("Ny film er lagt til.");
		    }

		    private void soekEtterTittel() {
		        System.out.print("Skriv inn delstreng for tittel: ");
		        String delstreng = new Scanner(System.in).nextLine();
		        tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, delstreng);
		    }

		    private void soekEtterProdusent() {
		        System.out.print("Skriv inn delstreng for produsent: ");
		        String delstreng = new Scanner(System.in).nextLine();
		        tekstgr.skrivUtFilmProdusent(filmarkiv, delstreng);
		    }

		    private void slettFilm() {
		        System.out.print("Skriv inn filmnummeret til filmen du vil slette: ");
		        int filmnr = new Scanner(System.in).nextInt();
		        boolean slettet = filmarkiv.slettFilm(filmnr);
		        if (slettet) {
		            System.out.println("Filmen ble slettet.");
		        } else {
		            System.out.println("Fant ikke filmen med gitt filmnummer.");
		        }
		    }

		    private void visStatistikk() {
		        tekstgr.skrivUtStatistikk(filmarkiv);
		    }

		    private void visAlleFilmer() {
		        Film[] filmer = filmarkiv.soekTittel(""); // Tom streng for å hente alle
		        for (Film film : filmer) {
		            Tekstgrensesnitt.skrivUtFilm(film);
		        }
		    }
		}
