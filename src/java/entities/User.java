package entities;

public class User extends Personne
{
    protected String mdp;
    protected String catg;

    public User(String mdp, String catg, int id, String nom, String prenom, int sexe) {
        super(id, nom, prenom, sexe);
        this.mdp = mdp;
        this.catg = catg;
    }

    public User() {
        super();
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getCatg() {
        return catg;
    }

    public void setCatg(String catg) {
        this.catg = catg;
    }
}
