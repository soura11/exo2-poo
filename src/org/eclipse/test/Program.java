package org.eclipse.test;

import java.awt.desktop.AboutEvent;

import org.eclipse.model.Adresse;
import org.eclipse.model.Personne;

public class Program {

	public static void main(String[] args) {
		System.err.println(Personne.getNbrPersonnes());
		Personne personne = new Personne();
		personne.setNum(100);
		personne.setNom("wick");
		personne.setPrenom("john");
		System.out.println(personne);
		System.err.println(Personne.getNbrPersonnes());

		Personne personne2 = new Personne(200, "Dalton", "Jack");
		System.out.println(personne2);
		System.err.println(Personne.getNbrPersonnes());
		Adresse adresse1 = new Adresse("paradis", "13006", "Marseille");
		Adresse adresse2 = new Adresse("sauveur", "13007", "Marseille");

		Adresse[] adresse = new Adresse[] { adresse1, adresse2 };

		Personne personne3 = new Personne(300, "Maggio", "Candice", adresse);
		System.out.println(personne3);
	}

}
