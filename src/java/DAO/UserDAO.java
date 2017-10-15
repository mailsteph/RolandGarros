package DAO;

import entities.User;
import java.util.List;

public abstract interface UserDAO {

    public abstract List<User> getAll();

    public abstract User getOne(int paramInt);

    public abstract void addUser(User paramUser);

    public abstract void updateUser(User paramUser);

    public abstract void deleteUser(int paramInt);
}
