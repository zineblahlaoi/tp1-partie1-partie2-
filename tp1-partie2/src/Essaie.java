
public class Essaie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Fraction f1=new Fraction(1,2);
     Fraction f2=new Fraction(1);
     
     Fraction somme=new Fraction();
     Fraction sub=new Fraction();
     Fraction multiple=new Fraction();
     Fraction division=new Fraction();
     
     somme=f1.add(f2);
     sub=f1.sub(f2);
     multiple=f1.mult(f2);
     division=f2.divi(f1);
     
     f1.afficher();
     f2.afficher();
     
     double valeur;
     valeur=somme.doubleValue();
     System.out.println("f1+f2= "+valeur);
     
     valeur=sub.doubleValue();
     System.out.println("f1-f2= "+valeur);
     
     valeur=multiple.doubleValue();
     System.out.println("f1*f2= "+valeur);
     
     valeur=division.doubleValue();
     System.out.println("f1/f2= "+valeur);
	}

}
