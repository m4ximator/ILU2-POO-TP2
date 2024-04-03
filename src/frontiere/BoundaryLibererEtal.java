package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibereEtal) {
		this.controlLibererEtal = controlLibereEtal;
	}

	public void libererEtal(String nomVendeur) {
		StringBuilder chaine = new StringBuilder();
		if (!controlLibererEtal.isVendeur(nomVendeur)) {
			chaine.append("Mais vous netes pas inscrit sur notre marche aujourdhui !");
		} else {
			String[] donneesEtal = controlLibererEtal.libererEtal(nomVendeur);

			chaine.append("Vous avez vendu ").append(donneesEtal[4]).append("sur ").append(donneesEtal[3] + "\t")
					.append(donneesEtal[2]);
			chaine.append(" Au revoir" + nomVendeur + " , passez une bonne journee");
			chaine.toString();
		}
	}

}
