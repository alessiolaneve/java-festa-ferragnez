package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome e cognome, se risulti in lista potrai accedere alla festa!");
		String nomeUtente = input.nextLine();
		
		boolean presente = false;
		
		for (int i = 0; i < invitati.length; i++) {
			
			String nomeInLista = invitati[i];
			System.out.println(nomeInLista);
			
			if (nomeInLista.equals(nomeUtente)) {
				
				presente = true;
				
			} 
		}
		
		if (presente == true) {
			
			System.out.println("Prego, puoi accedere alla festa!");
			
		} else {
			
			System.out.println("Mi spiace, purtroppo non sei nella lista degli invitati.");
		
		}
	}
}
