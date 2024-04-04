package controleur;

import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}
	public  Gaulois [] VendeurProduit(String produit) {
		return village.rechercherVendeursProduit(produit);
				
	}
	public boolean isFromVillage(String nomVillageois) {
		return controlVerifierIdentite.verifierIdentite(nomVillageois);
	}
	public Etal trouverEtalVendeur(String nomVendeur) {
		return controlTrouverEtalVendeur.trouverEtalVendeur(nomVendeur);
		
	}
	public int  acheterProduit(String nomVendeur,int quantity) {
			return trouverEtalVendeur(nomVendeur).acheterProduit(quantity);
	}
}
