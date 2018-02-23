


public class Ecole {

	public static void main(String[] args) {
	
		professeur prof=new professeur("hafidi Imade",1,"imad,hafidi@gmail.com","chef de departement");
		Module module=new Module("JAVA",1,4,prof);
		module.afficher();
	}

}

