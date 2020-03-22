package it.polito.tdp.anagrammi.model;

import java.util.HashMap;
import java.util.List;

import it.polito.tdp.anaggrammi.DAO.ParolaDAO;

import java.util.*;

public class Model {
	private Map <Parola, Boolean> mappaP= new HashMap <Parola, Boolean>();
	List <Parola> parole = new LinkedList <Parola>();
    ParolaDAO dao = new ParolaDAO();
	Espandi e = new Espandi();
    
 public boolean isCorrect (Parola anagramma) {
	 return dao.isCorrect(anagramma);
 }
 
 public List <String> calcolaAnagrammi(Parola anagramma){
	 List <String > anagrammi = new LinkedList<String>();
	 String parziale ="";
	 e.calcola(parziale, anagramma , 0 , anagrammi);
	 return anagrammi;
		
	 }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*public Map <Parola, Boolean> controllaAnagrammi(List <Parola> listaP){
		for (Parola p : listaP) {
			if (dao.getParola(p)==true) {
				mappaP.put(p, true);
			}else mappaP.put(p, false);
		}
		return mappaP;
	}

public Map <Parola, Boolean> mappa(){
	return mappaP;
}
public String stampaCorrette() {
	for (Parola p : parole) {
		if (mappaP.containsKey(p)) {
			if (mappaP.get(p).equals(true))
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

public void getParolaCorretta(Parola p) {
	System.out.println(dao.getParoleCorrette(p));
}*/
}
