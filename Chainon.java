class Chainon{
	String nom;
	int age;
	Chainon suiv;
	
	public Chainon(String _nom,int _age){ //constructeur
		nom=new String(_nom);
		age=_age;
	}
	
	public String litNom(){
		return nom;
	}
	
	public String litAge(){
		String s=new String();
		return s.valueOf(age);
	}
}