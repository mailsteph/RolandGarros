package DAO;

import entities.Arbitre;
import java.util.List;

public abstract interface ArbitreDAO {

    public abstract List<Arbitre> getAll();

    public abstract Arbitre getOne(int paramInt);

    public abstract void addArbitre(Arbitre paramArbitre);

    public abstract void updateArbitre(Arbitre paramArbitre);

    public abstract void deleteArbitre(int paramInt);
}
