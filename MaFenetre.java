import java.awt.*;

public class MaFenetre extends Frame {
	TextField tfNom;
	TextField tfAge;
	List list1;
	Button bNouv;
	Button bList;
	ListeChainee maListe = new ListeChainee();

	public MaFenetre() {
		setLayout(null);
		addNotify();
		setSize(322,305);
		setTitle("LISTE CHAINEE");
		tfNom=new TextField();
		tfNom.setBounds(40,40,80,30);
		add(tfNom);
		tfAge=new TextField();
		tfAge.setBounds(40,100,80,30);
		add(tfAge);
		list1 = new java.awt.List(0,false);
		list1.setBounds(192,24,100,175);
		add(list1);
		bNouv = new Button("Ajouter");
		bNouv.setBounds(72,228,72,40);
		add(bNouv);
		bList = new Button("Lister");
		bList.setBounds(180,228,72,40);
		add(bList);
	}

	public boolean handleEvent(Event event) {
  	if (event.id == Event.WINDOW_DESTROY) {
    	//hide();         // ferme la fenêtre
      dispose();      // libère les ressources systèmes
      System.exit(0); // quitte l'application
    }
    else
    	if (event.id==Event.ACTION_EVENT){
				if (event.target == bNouv){
					maListe.ajoutEnQueue(tfNom.getText(),Integer.valueOf(tfAge.getText()).intValue());
					tfNom.setText("");
					tfAge.setText("");
				}
				else
					if (event.target == bList){
						maListe.afficheListe(list1);
					}
    	}
		return super.handleEvent(event);
	}

	static public void main(String args[]) {
	  MaFenetre f1=new MaFenetre();
    f1.move(50, 50);		// positionne la fenetre à l'écran
	  f1.show();
	}

}