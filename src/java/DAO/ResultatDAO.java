package DAO;

import entities.Resultat;
import java.util.List;

public abstract interface ResultatDAO {

    public abstract List<Resultat> getAll();

    public abstract Resultat getOne(int paramInt);

    public abstract void addResultat(Resultat paramUser);

    public abstract void updateResultat(Resultat paramUser);

    public abstract void deleteResultat(int paramInt);
}
