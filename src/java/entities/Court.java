package entities;

public class Court
{
  protected int id;
  protected String nom;
  
  public Court(int id, String nom) {
    this.id = id;
    this.nom = nom;
  }
  
  public Court() {
  }
  
  public int getId()
  {
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
}
