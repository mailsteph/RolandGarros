package entities;

public class Arbitre extends Personne {

    protected String nationalite;
    protected String niveau;

    public Arbitre(String nationalite, String niveau, int id, String nom, String prenom, int sexe) {
        super(id, nom, prenom, sexe);
        this.nationalite = nationalite;
        this.niveau = niveau;
    }

    public Arbitre() {
        super();
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
