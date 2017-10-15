package entities;

public class Joueur extends Personne {

    protected String nationalite;
    protected String catg;
    protected int rangs;

    public Joueur(String nationalite, String catg, int rangs, int id, String nom, String prenom, int sexe) {
        super(id, nom, prenom, sexe);
        this.nationalite = nationalite;
        this.catg = catg;
        this.rangs = rangs;
    }

    public Joueur() {
        super();
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getCatg() {
        return catg;
    }

    public void setCatg(String catg) {
        this.catg = catg;
    }

    public int getRangs() {
        return rangs;
    }

    public void setRangs(int rangs) {
        this.rangs = rangs;
    }
}
