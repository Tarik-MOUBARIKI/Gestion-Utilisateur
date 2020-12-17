
public class Profile {
    private int id=1 ;
    private int code;
    private String libelle;
	public Profile(int id, int code, String libelle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}
	public Profile() {
		
	}
	public int getId() {
		return id++;
	}
	public void setId() {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

    
    
}
