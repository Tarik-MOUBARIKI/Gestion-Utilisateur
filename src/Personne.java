
public class Personne {
	private String matricule;
	private String nom;
	private String prénom;
	private String email;
	private String téléphone;
	private Double salaire;
	public Personne(String matricule, String nom, String prénom, String email, String téléphone, Double salaire) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prénom = prénom;
		this.email = email;
		this.téléphone = téléphone;
		this.salaire = salaire;
	}

	public Personne() {
		// TODO Auto-generated constructor stub
	}

	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrénom() {
		return prénom;
	}
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTéléphone() {
		return téléphone;
	}
	public void setTéléphone(String téléphone) {
		this.téléphone = téléphone;
	}
	public Double getSalaire() {
		return salaire ;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public Double calc(double salaire,double agm) {
		
		return salaire * (agm/100);
	}
	
	 public void afficher() {
		 
		 
	 }

	@Override
	public String toString() {
		return "Personne [matricule=" + matricule + ", nom=" + nom + ", prénom=" + prénom + ", email=" + email
				+ ", téléphone=" + téléphone + ", salaire=" + salaire + "]";
	}
	
	
}
