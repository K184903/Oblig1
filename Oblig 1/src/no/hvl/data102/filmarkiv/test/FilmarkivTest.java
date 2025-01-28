package no.hvl.data102.filmarkiv.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;

class FilmarkivTest {

	private Filmarkiv filmarkiv;

	@BeforeEach
	public void setUp() {
		filmarkiv = new Filmarkiv(10);

		filmarkiv.leggTilFilm(new Film(1, "Produsent1", "Film1", 2020, Sjanger.ACTION, "Selskap1"));
		filmarkiv.leggTilFilm(new Film(2, "Produsent2", "Film2", 2021, Sjanger.DRAMA, "Selskap2"));
		filmarkiv.leggTilFilm(new Film(3, "Produsent3", "Film3", 2022, Sjanger.ACTION, "Selskap3"));
	}

	
	// Test av finnFilm
	@Test
	void testFinnFilmSomFinnes() {
		Film film = filmarkiv.finnFilm(1);
		assertNotNull(film);
		assertEquals(1, film.getFilmnr());
	}

	@Test
	void testFinnFilmSomIkkeFinnes() {
		Film film = filmarkiv.finnFilm(99);
		assertNull(film);
	}

	
	// Test av leggTilFilm
	@Test
	void testLeggTilFilm() {
		Film nyFilm = new Film(4, "Produsent4", "Film4", 2023, Sjanger.COMEDY, "Selskap4");
		filmarkiv.leggTilFilm(nyFilm);
		assertEquals(4, filmarkiv.antall());
		assertEquals(nyFilm, filmarkiv.finnFilm(4));
	}

	@Test
	void testLeggTilFilmNårFull() {
		Filmarkiv liteFilmarkiv = new Filmarkiv(1);

		liteFilmarkiv.leggTilFilm(new Film(1, "Produsent1", "Film1", 2020, Sjanger.ACTION, "Selskap1"));
		liteFilmarkiv.leggTilFilm(new Film(2, "Produsent2", "Film2", 2021, Sjanger.DRAMA, "Selskap2"));

		assertEquals(2, liteFilmarkiv.antall());
		assertNotNull(liteFilmarkiv.finnFilm(2));
	}

	
	// Test av slettFilm
	@Test
	void testSlettFilmFinnes() {
	    boolean slettet = filmarkiv.slettFilm(1);
	    
	    assertTrue(slettet);
	    assertEquals(2, filmarkiv.antall()); // Sjekk at antall filmer er korrekt
	    assertNull(filmarkiv.finnFilm(1)); // Sjekk at filmen er slettet
	}

	@Test
	void testSlettFilmIkkeFinnes() {
        boolean slettet = filmarkiv.slettFilm(99);
        assertFalse(slettet);
        assertEquals(3, filmarkiv.antall());
	}
	
	
	// Test av soekTittel
	@Test
	void testSoekTittelFinnes() {
        Film[] resultater = filmarkiv.soekTittel("Film");
        assertEquals(3, resultater.length);

        resultater = filmarkiv.soekTittel("Film1");
        assertEquals(1, resultater.length);
        assertEquals(1, resultater[0].getFilmnr());
	}
	
	@Test
	void testSoekTittelFinnesIkke() {
        Film[] resultater = filmarkiv.soekTittel("Ukjent");
        assertEquals(0, resultater.length);
	}
	
	
	// Test av soekProdusent
	@Test
	void testSoekProdusentFinnes() {
		Film[] resultater = filmarkiv.soekProdusent("Produsent");
		assertEquals(3, resultater.length);
		
		resultater = filmarkiv.soekProdusent("Produsent1");
		assertEquals(1, resultater.length);
		assertEquals(1, resultater[0].getFilmnr());
	}
	
	@Test
	void testSoekProdusentFinnesIkke() {
		Film[] resultater = filmarkiv.soekProdusent("Ukjent");
		assertEquals(0, resultater.length);
	}
	
	
	// Test av antallSjanger
	@Test
	void testAntallSjanger() {
		assertEquals(2, filmarkiv.antall(Sjanger.ACTION));
		assertEquals(1, filmarkiv.antall(Sjanger.DRAMA));
		assertEquals(0, filmarkiv.antall(Sjanger.COMEDY));
	}
	
	
	// Test av antall
	@Test
	void testAntallTotalt() {
		assertEquals(3, filmarkiv.antall());
	}
}
