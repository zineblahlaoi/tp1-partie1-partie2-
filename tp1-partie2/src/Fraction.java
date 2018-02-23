
import java.math.BigInteger;

public class Fraction {
	
	private BigInteger numerateur;
	private BigInteger denominateur;
	

	
	public Fraction() {
		super();
	
	}
	public Fraction(BigInteger numerateur, BigInteger denominateur) {
		super();
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}
	
	
	public Fraction(int numerateur, int denominateur) {
		super();
		this.numerateur = BigInteger.valueOf(numerateur);
		this.denominateur = BigInteger.valueOf(denominateur);
	}
	
	public Fraction(int numerateur) {
		super();
		this.numerateur = BigInteger.valueOf(numerateur);
		this.denominateur = BigInteger.valueOf(1);
	}
	public Fraction add(Fraction toAdd)
	{
		Fraction somme= new Fraction();
		somme.numerateur=this.denominateur.multiply(toAdd.numerateur).add(this.numerateur.multiply(toAdd.denominateur));
		somme.denominateur= this.denominateur.multiply(toAdd.denominateur);
		return(somme);
	}
	public Fraction sub(Fraction toSub)
	{
		Fraction difference= new Fraction();
		difference.numerateur=this.denominateur.multiply(toSub.numerateur).subtract(this.numerateur.multiply(toSub.denominateur));
		difference.denominateur= this.denominateur.multiply(toSub.denominateur);
		return(difference);
	}
	public Fraction mult(Fraction f) 
	{
		Fraction multiple= new Fraction();
		multiple.numerateur=this.numerateur.multiply(f.numerateur);
		multiple.denominateur=this.denominateur.multiply(f.denominateur);
		return (multiple);
	}
	public Fraction divi(Fraction f) 
	{
		Fraction division= new Fraction();
		division.numerateur=this.numerateur.multiply(f.denominateur);
		division.denominateur=this.denominateur.multiply(f.numerateur);
		return (division);
	}
	@Override
	public String toString() {
		return "Fraction [numerateur=" + numerateur + ", denominateur=" + denominateur + "]";
	}
	
	//afficher la fraction 
	public  void afficher()
	{
		System.out.println(toString());
	}
	
	public double doubleValue()
	{
		double valeur;
	     valeur=numerateur.doubleValue()/denominateur.doubleValue();
		return (valeur);
	}

}
