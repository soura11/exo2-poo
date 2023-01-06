package org.eclipse.model;

import java.util.Arrays;

public class Personne {
	private int num;
	private String nom;
	private String prenom;
	private Adresse[] adresses;
	private static int nbrPersonnes;
	public Personne(int num, String nom, String prenom, Adresse[] adresses) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresses = adresses;
	}
	
	
	
	{
		Personne.nbrPersonnes++;
	}
	
	public Personne( ) {
		
		
	}
	public Personne(int num, String nom, String prenom) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		
	}

	public void setNum(int value) {
		if (value > 0) {
			num = value;
		} else {
			num = 0;
		}
	}
	public Adresse[] getAdresses() {
		return adresses;
	}
	public void setAdresses(Adresse[] adresses) {
		this.adresses = adresses;
	}
	public int getNum() {
		return num;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public static int getNbrPersonnes() {
		return nbrPersonnes;
	}
	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresses="
				+ Arrays.toString(adresses) + "]";
	}


}
