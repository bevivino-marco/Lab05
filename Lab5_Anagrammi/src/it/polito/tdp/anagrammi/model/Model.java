package it.polito.tdp.anagrammi.model;

import java.util.HashMap;
import java.util.List;

import it.polito.tdp.anaggrammi.DAO.ParolaDAO;

import java.util.*;

public class Model {
	private Map <Parola, Boolean> mappaP= new TreeMap <Parola, Boolean>();
	List <Parola> parole = new LinkedList <Parola>();
    ParolaDAO dao = new ParolaDAO();
	public Map <Parola, Boolean> controllaAnagrammi(List <Parola> listaP){
		for (Parola p : listaP) {
			mappaP.put(p, dao.getParola(p) );
			parole.add(p);
		}
		return mappaP;
	}

public String stampaCorrette() {
	for (Parola p : parole) {
		if (mappaP.containsKey(p)) {
			if (mappaP.get(p)==true)
			{
				return mappaP.get(p).toString();
			}
		}
	}
	return null;
}
public String stampaNonCorrette() {
	for (Parola p : parole) {
		if (mappaP.containsKey(p)) {
			if (mappaP.get(p)==false)
			{
				return mappaP.get(p).toString();
			}
		}
	}
	return null;
}
}
