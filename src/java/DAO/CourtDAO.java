package DAO;

import entities.Court;
import java.util.List;

public abstract interface CourtDAO {

    public abstract List<Court> getAll();

    public abstract Court getOne(int paramInt);

    public abstract void addCourt(Court paramCourt);

    public abstract void updateCourt(Court paramCourt);

    public abstract void deleteCourt(int paramInt);
}
