class Chainon{
	String nom;
	int age;
	Chainon suiv;
	String ajout;
	
	public Chainon(String _nom,int _age){ //constructeur
		nom=new String(_nom);
		age=_age;
		ajout = "Ajouté";
	}
	
	public String litNom(){ //3333333333333
	}
	
	public String litAge(){
		String s=new String();
		return s.valueOf(age);
	}
}
