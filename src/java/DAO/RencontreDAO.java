package DAO;

import entities.Rencontre;
import java.util.List;

public abstract interface RencontreDAO {

    public abstract List<Rencontre> getAll();

    public abstract Rencontre getOne(int paramInt);

    public abstract void addRencontre(Rencontre paramRencontre);

    public abstract void updateRencontre(Rencontre paramRencontre);

    public abstract void deleteRencontre(int paramInt);
}
