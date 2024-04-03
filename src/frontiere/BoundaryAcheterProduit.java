package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;
import personnages.Gaulois;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		int choix=Clavier.entrerEntier("1- je veux acheter un produit.\n 2- je veux avoir une vue d'ensemble du marché\n 3- quitter l'application " );
		if (choix==1) {
			StringBuilder chaine= new StringBuilder();
			if(!(controlAcheterProduit.isFromVillage(nomAcheteur))) {
				chaine.append("Je suis desole "+ nomAcheteur+ " mais il faut etre un habitant du village pour commercer ici");
			}
			String produit=Clavier.entrerChaine("Quel produit voulez-vous acheter ?");
			Gaulois [] vendeur =controlAcheterProduit.isMarcheProduit(produit);
			else if(vendeur==null) {
				chaine.append("Desole, personne ne vend ce produit au marche");
			}
			else if() {
				
			}
		}
	}
}
