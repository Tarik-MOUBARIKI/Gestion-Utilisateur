
public class Utilisateur extends Personne{
	 private String login;
	 private String passwrd;
	 private String service;
	 
	public Utilisateur(String matricule, String nom, String prénom, String email, String téléphone, Double salaire,
			String login, String passwrd, String service) {
		super(matricule, nom, prénom, email, téléphone, salaire);
		this.login = login;
		this.passwrd = passwrd;
		this.service = service;
	}
	public Utilisateur() {
		
		super();
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
public Double calc(double salaire,double agm) {
		
		return super.calc(salaire, agm);
	}
	 

	
	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", passwrd=" + passwrd + ", service=" + service + ", toString()="
				+ super.toString() + "]";
	}
	public Double calculerSalaire (Double salaire){
		return salaire;
		
		
	}
	public void affiche() {
		
		
	}
	
	
	
	
	
	
	
	 
	 
}
