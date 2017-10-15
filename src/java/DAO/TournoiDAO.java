package DAO;

import entities.Tournoi;
import java.util.List;

public abstract interface TournoiDAO {

    public abstract List<Tournoi> getAll();

    public abstract Tournoi getOne(int paramInt);

    public abstract void addTournoi(Tournoi paramTournoi);

    public abstract void updateTournoi(Tournoi paramTournoi);

    public abstract void deleteTournoi(int paramInt);
}
