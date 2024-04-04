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
		StringBuilder chaine = new StringBuilder();
		Gaulois[] vendeurs;

			if (!(controlAcheterProduit.isFromVillage(nomAcheteur)))
				chaine.append("Je suis desole " + nomAcheteur
						+ " mais il faut etre un habitant du village pour commercer ici");
			else {
				String produit = Clavier.entrerChaine("Quel produit voulez-vous acheter ?\n");
				vendeurs = controlAcheterProduit.VendeurProduit(produit);

				if (vendeurs == null) {
					chaine.append("Desole, personne ne vend ce produit au marche");
				} else {
					System.out.println("Chez quel commercant voulez-vous acheter?\n");
					for (int i = 0; i < vendeurs.length; i++)
						System.out.println((i + 1) + " - " + vendeurs[i]);
					int choixVendeur = Clavier.entrerEntier("");
					String nomVendeur = vendeurs[choixVendeur - 1].getNom();
					if (!(controlAcheterProduit.isFromVillage(nomVendeur))) {
						chaine.append("Je suis desole " + nomVendeur
								+ " mais il faut etre un habitant du village pour commercer ici");
					} else {
						int nbProduit = Clavier.entrerEntier(
								nomAcheteur + " se deplace jusqua letal du vendeur " + nomVendeur + "\nBonjour "
										+ nomAcheteur + "\nCombien de " + produit + " voulez-vous acheter ?");
						controlAcheterProduit.acheterProduit(nomVendeur, nbProduit);

					}
				}
			}
		
		chaine.toString();

	}
}