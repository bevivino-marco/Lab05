package it.polito.tdp.anagrammi.model;

import java.util.*;

public class TestModel {
	public static void main(String[] args) {
    Model model = new Model();
	List <Parola> lP = new LinkedList <Parola>();
	
	lP.add(new Parola ("tea"));
	lP.add(new Parola ("ciao"));
	lP.add(new Parola ("mio"));

	//model.controllaAnagrammi(lP);
	//System.out.println(model.stampaCorrette());
	//System.out.println(model.stampaNonCorrette());
    //System.out.println(model.mappa().toString());
	
	}	
}
