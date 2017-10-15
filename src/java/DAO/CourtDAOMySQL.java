package DAO;

import entities.Court;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CourtDAOMySQL implements CourtDAO {

    private Connection databaseConnection;

    public CourtDAOMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rgbase?useSSL=false",
                    "root", "");
        } catch (SQLException e) {
            System.out.println("CONNECTION NON EFFECTUÉE");
            e.printStackTrace();
        }
    }

    public List<Court> getAll() {
        List<Court> listeCourt = new java.util.ArrayList();

        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from court");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");

                Court court = new Court();
                court.setId(id);
                court.setNom(nom);

                listeCourt.add(court);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listeCourt;
    }

    public Court getOne(int _id) {
        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from court WHERE id=" + _id);
            if (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");

                Court court = new Court();
                court.setId(id);
                court.setNom(nom);

                return court;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addCourt(Court court) {
        try {
            String sqlQuery = "INSERT INTO court (nom) VALUES ('" + court.getNom() + "')";

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCourt(Court court) {
        try {
            String sqlQuery = "UPDATE court SET 'nom' = '" + court.getNom() + " WHERE id=" + court.getId();

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCourt(int _id) {
        try {
            String sqlQuery = "DELETE FROM court WHERE id=" + _id;

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
