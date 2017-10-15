package DAO;

import entities.Tournoi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TournoiDAOMySQL implements TournoiDAO {

    private Connection databaseConnection;

    public TournoiDAOMySQL() {
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

    public List<Tournoi> getAll() {
        List<Tournoi> listeTournoi = new java.util.ArrayList();

        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from tournoi");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                int nbreSet = rs.getInt("nbreSet");

                Tournoi tournoi = new Tournoi();
                tournoi.setId(id);
                tournoi.setNom(nom);
                tournoi.setNbreSet(nbreSet);

                listeTournoi.add(tournoi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listeTournoi;
    }

    public Tournoi getOne(int _id) {
        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from tournoi WHERE id=" + _id);
            if (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                int nbreSet = rs.getInt("nbreSet");

                Tournoi tournoi = new Tournoi();
                tournoi.setId(id);
                tournoi.setNom(nom);
                tournoi.setNbreSet(nbreSet);

                return tournoi;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addTournoi(Tournoi tournoi) {
        try {
            String sqlQuery = "INSERT INTO tournoi (nom, nbreSet) VALUES ('" + tournoi.getNom() + "', '"
                    + tournoi.getNbreSet() + "')";

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateTournoi(Tournoi tournoi) {
        try {
            String sqlQuery = "UPDATE tournoi SET 'nom' = '" + tournoi.getNom()
                    + "', " + "'nbreSet'="
                    + tournoi.getNbreSet()
                    + " WHERE id=" + tournoi.getId();

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTournoi(int _id) {
        try {
            String sqlQuery = "DELETE FROM tournoi WHERE id=" + _id;

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
