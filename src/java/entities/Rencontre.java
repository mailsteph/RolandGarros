package entities;

public class Rencontre {

    protected int id;
    protected String date;
    protected String heure;
    protected int idCourt;
    protected int idArbitre;
    protected int idTournoi;
    protected int idJoueur1;
    protected int idJoueur2;

    public Rencontre(int id, String date, String heure, int idCourt, int idArbitre, int idTournoi, int idJoueur1, int idJoueur2) {
        this.id = id;
        this.date = date;
        this.heure = heure;
        this.idCourt = idCourt;
        this.idArbitre = idArbitre;
        this.idTournoi = idTournoi;
        this.idJoueur1 = idJoueur1;
        this.idJoueur2 = idJoueur2;
    }

    public Rencontre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public int getIdCourt() {
        return idCourt;
    }

    public void setIdCourt(int idCourt) {
        this.idCourt = idCourt;
    }

    public int getIdArbitre() {
        return idArbitre;
    }

    public void setIdArbitre(int idArbitre) {
        this.idArbitre = idArbitre;
    }

    public int getIdTournoi() {
        return idTournoi;
    }

    public void setIdTournoi(int idTournoi) {
        this.idTournoi = idTournoi;
    }

    public int getIdJoueur1() {
        return idJoueur1;
    }

    public void setIdJoueur1(int idJoueur1) {
        this.idJoueur1 = idJoueur1;
    }

    public int getIdJoueur2() {
        return idJoueur2;
    }

    public void setIdJoueur2(int idJoueur2) {
        this.idJoueur2 = idJoueur2;
    }
}
