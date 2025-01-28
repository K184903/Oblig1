package no.hvl.data102.filmarkiv.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Film.Sjanger;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;

class FilmarkivTest {
	
	private Filmarkiv filmarkiv;
	
	@BeforeEach
	public void setUp() {
		filmarkiv = new Filmarkiv(10);
		
		filmarkiv.leggTilFilm(new Film(1, "Produsent1", "Film1", 2020, Sjanger.ACTION, "Selskap1"));
		filmarkiv.leggTilFilm(new Film(2, "Produsent2", "Film2", 2021, Sjanger.DRAMA, "Selskap2"));
	}
	

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
}
