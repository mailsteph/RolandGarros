package DAO;

import entities.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAOMySQL implements UserDAO {

    private Connection databaseConnection;

    public UserDAOMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rgbase?useSSL=false",
                    "root", "");
            System.out.println("CONNECTION EFFECTUÉE");
        } catch (SQLException e) {
            System.out.println("CONNECTION NON EFFECTUÉE");
            e.printStackTrace();
        }
    }

    public List<User> getAll() {
        List<User> listeUser = new ArrayList();

        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from user");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                int sexe = rs.getInt("sexe");
                String catg = rs.getString("catg");
                String mdp = rs.getString("mdp");

                User user = new User();
                user.setId(id);
                user.setNom(nom);
                user.setPrenom(prenom);
                user.setSexe(sexe);
                user.setCatg(catg);
                user.setMdp(mdp);

                listeUser.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listeUser;
    }

    public User getOne(int _id) {
        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from user WHERE id=" + _id);
            if (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                int sexe = rs.getInt("sexe");
                String catg = rs.getString("catg");
                String mdp = rs.getString("mdp");

                User user = new User();
                user.setId(id);
                user.setNom(nom);
                user.setPrenom(prenom);
                user.setSexe(sexe);
                user.setCatg(catg);
                user.setMdp(mdp);

                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addUser(User user) {
        try {
            String sqlQuery = "INSERT INTO user (nom, prenom, sexe, catg, mdp) VALUES ('"
                    + user.getNom() + "', '" + user.getPrenom() + "', '" + user.getSexe() + "', '"
                    + user.getCatg() + "', '" + user.getMdp() + "')";

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            String sqlQuery = "UPDATE user SET 'nom' = '" + user.getNom() + "', " + "'prenom'=" + user.getPrenom()
                    + "'sexe'=" + user.getSexe() + "'catge'=" + user.getCatg() + "'mdp'="
                    + user.getMdp() + " WHERE id=" + user.getId();

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int _id) {
        try {
            String sqlQuery = "DELETE FROM user WHERE id=" + _id;

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
