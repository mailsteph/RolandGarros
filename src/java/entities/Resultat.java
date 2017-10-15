package entities;

public class Resultat {

    protected int id;
    protected int idRencontre;
    protected String duree;
    protected int set1J1;
    protected int set2J1;
    protected int set3J1;
    protected int set4J1;
    protected int set5J1;
    protected int set1J2;
    protected int set2J2;
    protected int set3J2;
    protected int set4J2;
    protected int set5J2;

    public Resultat(int id, int idRencontre, String duree, int set1J1, int set2J1, int set3J1, int set4J1, int set5J1, int set1J2, int set2J2, int set3J2, int set4J2, int set5J2) {
        this.id = id;
        this.idRencontre = idRencontre;
        this.duree = duree;
        this.set1J1 = set1J1;
        this.set2J1 = set2J1;
        this.set3J1 = set3J1;
        this.set4J1 = set4J1;
        this.set5J1 = set5J1;
        this.set1J2 = set1J2;
        this.set2J2 = set2J2;
        this.set3J2 = set3J2;
        this.set4J2 = set4J2;
        this.set5J2 = set5J2;
    }

    public Resultat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRencontre() {
        return idRencontre;
    }

    public void setIdRencontre(int idRencontre) {
        this.idRencontre = idRencontre;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public int getSet1J1() {
        return set1J1;
    }

    public void setSet1J1(int set1J1) {
        this.set1J1 = set1J1;
    }

    public int getSet2J1() {
        return set2J1;
    }

    public void setSet2J1(int set2J1) {
        this.set2J1 = set2J1;
    }

    public int getSet3J1() {
        return set3J1;
    }

    public void setSet3J1(int set3J1) {
        this.set3J1 = set3J1;
    }

    public int getSet4J1() {
        return set4J1;
    }

    public void setSet4J1(int set4J1) {
        this.set4J1 = set4J1;
    }

    public int getSet5J1() {
        return set5J1;
    }

    public void setSet5J1(int set5J1) {
        this.set5J1 = set5J1;
    }

    public int getSet1J2() {
        return set1J2;
    }

    public void setSet1J2(int set1J2) {
        this.set1J2 = set1J2;
    }

    public int getSet2J2() {
        return set2J2;
    }

    public void setSet2J2(int set2J2) {
        this.set2J2 = set2J2;
    }

    public int getSet3J2() {
        return set3J2;
    }

    public void setSet3J2(int set3J2) {
        this.set3J2 = set3J2;
    }

    public int getSet4J2() {
        return set4J2;
    }

    public void setSet4J2(int set4J2) {
        this.set4J2 = set4J2;
    }

    public int getSet5J2() {
        return set5J2;
    }

    public void setSet5J2(int set5J2) {
        this.set5J2 = set5J2;
    }
}
