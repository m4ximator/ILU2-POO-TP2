package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String [] infosMarche=controlAfficherMarche.donnerInfosMarche();
		if(infosMarche.length==0) {
			System.out.println("Le marché est vide, revenez plus tard.");
		}
		else {
			StringBuilder chaine=new StringBuilder ();
			chaine.append(nomAcheteur+" Vous trouverez au marché: \n");
			int i=0;
			while(i<infosMarche.length){
				chaine.append("-"+infosMarche[i]);
				i++;
				chaine.append(" qui vend "+infosMarche[i]);
				i++;
				chaine.append("\t"+ infosMarche[i]);
				i++;
				
			}
		}
	}
}
