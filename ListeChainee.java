import java.awt.*;

public class ListeChainee {
	private Chainon prem;
	private Chainon dern;
	
	public ListeChainee(){		//constructeur
		prem=null;
	}
	
	public boolean estVide(){
		return prem==null;
	}
	
	public void ajoutEnQueue(String ch, int n){
		Chainon cNouv = new Chainon(ch,n);	//crée un nouveau chainon
		if(!estVide()){											//si liste non vide
			dern.suiv=cNouv;
			dern=cNouv;
		}
		else {															//si liste vide
			prem=cNouv;
			dern=cNouv;
		}
	}
	
	public void afficheListe(List listEcran){
		String s=new String();
		listEcran.clear();			// efface contenu de la liste à l'écran
		Chainon c = prem;				// met dans c le premier chainon
		while(c != null){
			listEcran.addItem(c.litNom() +" "+ c.litAge());
			c = c.suiv;						// on passe au chainon suivant
		}	
	}
}
		
			