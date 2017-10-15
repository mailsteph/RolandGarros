package DAO;

import entities.Arbitre;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ArbitreDAOMySQL implements ArbitreDAO {

    private Connection databaseConnection;

    public ArbitreDAOMySQL() {
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

    public List<Arbitre> getAll() {
        List<Arbitre> listeArbitre = new java.util.ArrayList();

        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from arbitre");
            while (rs.next()) {
                int id = rs.getInt("id");
                int sexe = rs.getInt("sexe");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String nationalite = rs.getString("nationalite");
                String niveau = rs.getString("niveau");

                Arbitre arbitre = new Arbitre();
                arbitre.setId(id);
                arbitre.setSexe(sexe);
                arbitre.setNom(nom);
                arbitre.setPrenom(prenom);
                arbitre.setNationalite(nationalite);
                arbitre.setNiveau(niveau);

                listeArbitre.add(arbitre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listeArbitre;
    }

    public Arbitre getOne(int _id) {
        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from arbitre WHERE id=" + _id);
            if (rs.next()) {
                int id = rs.getInt("id");
                int sexe = rs.getInt("sexe");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String nationalite = rs.getString("nationalite");
                String niveau = rs.getString("niveau");

                Arbitre arbitre = new Arbitre();
                arbitre.setId(id);
                arbitre.setSexe(sexe);
                arbitre.setNom(nom);
                arbitre.setPrenom(prenom);
                arbitre.setNationalite(nationalite);
                arbitre.setNiveau(niveau);

                return arbitre;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addArbitre(Arbitre arbitre) {
        try {
            String sqlQuery = "INSERT INTO arbitre (nom, prenom, sexe, nationalite, niveau) VALUES ('" + arbitre.getNom() + "', '"
                    + arbitre.getPrenom() + "', '"
                    + arbitre.getSexe() + "', '"
                    + arbitre.getNationalite() + "', '"
                    + arbitre.getNiveau() + "')";

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateArbitre(Arbitre arbitre) {
        try {
            String sqlQuery = "UPDATE arbitre SET 'nom' = '" + arbitre.getNom() 
                    + "', " + "'prenom'="
                    + arbitre.getPrenom() 
                     + "', " + "'sexe'="
                    + arbitre.getSexe()
                     + "', " + "'nationalite'="
                    + arbitre.getNationalite()
                     + "', " + "'niveau'="
                    + arbitre.getNiveau()         
                    + " WHERE id=" + arbitre.getId();

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteArbitre(int _id) {
        try {
            String sqlQuery = "DELETE FROM arbitre WHERE id=" + _id;

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
