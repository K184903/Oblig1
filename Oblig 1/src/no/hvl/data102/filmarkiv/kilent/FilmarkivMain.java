package no.hvl.data102.filmarkiv.kilent;

import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.adt.*;
public class FilmarkivMain {

	public static void main(String[] args) {
		FilmarkivADT filmarkiv = new Filmarkiv(100);
		Meny meny = new Meny(filmarkiv);
		meny.start();

	}
}
