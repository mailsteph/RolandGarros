package DAO;

import entities.Joueur;
import java.util.List;

public abstract interface JoueurDAO {

    public abstract List<Joueur> getAll();

    public abstract Joueur getOne(int paramInt);

    public abstract void addJoueur(Joueur paramJoueur);

    public abstract void updateJoueur(Joueur paramJoueur);

    public abstract void deleteJoueur(int paramInt);
}
