/**
 * @author LAHLAOI 
 *
 */
public class etudiant {

	
	
	private String nom;
	private Integer  nummerEtudiant;
	private String email;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getNummerEtudiant() {
		return nummerEtudiant;
	}
	public void setNummerEtudiant(Integer nummerEtudiant) {
		this.nummerEtudiant = nummerEtudiant;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public etudiant(String nom, Integer nummeretudiant, String email) {
		super();
		this.nom = nom;
		this.nummerEtudiant = nummeretudiant;
		this.email = email;
	}
	public etudiant() {
		super();
		
	}
	
	
	public String toString() {
		return "Etudiant [nom=" + nom + ", nummerEtudiant=" + nummerEtudiant + ", email=" + email + "]";
	}
	
	public void afficher()
	{
		System.out.println(toString());
	}
	
	

}

