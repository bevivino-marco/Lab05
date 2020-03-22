package it.polito.tdp.anagrammi.model;

import java.util.List;

public class Espandi {
      
	public void calcola(String parziale, Parola anagramma, int passo, List<String> anagrammi) {
	
		if (passo == anagramma.getNome().length()) {
			anagrammi.add(parziale);
			return;
		}
			
			
		

		for (int i = 0; i< anagramma.getNome().length(); i++) {
	

			if () {
			}
		
	}
}


public static int charCounter(String string , char c) {
	int count=0;
	for (int i=0; i< string.length();i++) {
		if (string.charAt(i)==c) {
			count++;
		}
	}
	return count;
}

























}
   /*private Parola p ;
   private int N;
	/*private void controllaAnagrammi(String s) {
		N = s.length();
		p = new Parola (s);
		

		if () {
			
			return;
		}

		for () {
	

			if (!parziale.contains(i)) {
				parziale.add(i);

				cerca(parziale, L + 1);

				parziale.remove(i);
			}
		}
	}

}*/
