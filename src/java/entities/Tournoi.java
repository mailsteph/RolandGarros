package entities;

public class Tournoi {

    protected int id;
    protected String nom;
    protected int nbreSet;

    public Tournoi(int id, String nom, int nbreSet) {
        this.id = id;
        this.nom = nom;
        this.nbreSet = nbreSet;
    }

    public Tournoi() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbreSet() {
        return nbreSet;
    }

    public void setNbreSet(int nbreSet) {
        this.nbreSet = nbreSet;
    }   
}
