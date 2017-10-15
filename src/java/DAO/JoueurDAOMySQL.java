package DAO;

import entities.Joueur;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JoueurDAOMySQL implements JoueurDAO {

    private Connection databaseConnection;

    public JoueurDAOMySQL() {
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

    public List<Joueur> getAll() {
        List<Joueur> listeJoueur = new ArrayList();

        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from joueur");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String nationalite = rs.getString("nationalite");
                int sexe = rs.getInt("sexe");
                String catg = rs.getString("catg");
                int rangs = rs.getInt("rangs");

                Joueur joueur = new Joueur();
                joueur.setId(id);
                joueur.setNom(nom);
                joueur.setPrenom(prenom);
                joueur.setNationalite(nationalite);
                joueur.setSexe(sexe);
                joueur.setCatg(catg);
                joueur.setRangs(rangs);

                listeJoueur.add(joueur);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listeJoueur;
    }

    public Joueur getOne(int _id) {
        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from joueur WHERE id=" + _id);
            if (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String nationalite = rs.getString("nationalite");
                int sexe = rs.getInt("sexe");
                String catg = rs.getString("catg");
                int rangs = rs.getInt("rangs");

                Joueur joueur = new Joueur();
                joueur.setId(id);
                joueur.setNom(nom);
                joueur.setPrenom(prenom);
                joueur.setNationalite(nationalite);
                joueur.setSexe(sexe);
                joueur.setCatg(catg);
                joueur.setRangs(rangs);

                return joueur;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addJoueur(Joueur joueur) {
        try {
            String sqlQuery = "INSERT INTO joueur (nom, prenom, nationalite, sexe, catg, rangs) VALUES ('"
                    + joueur.getNom() + "', '" + joueur.getPrenom() + "', '" + joueur.getNationalite() + "', '"
                    + joueur.getSexe() + "', '" + joueur.getCatg() + "', '" + joueur.getRangs() + "')";

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void updateJoueur(Joueur joueur) {
        try {
            String sqlQuery = "UPDATE joueur SET 'nom' = '" + joueur.getNom() + "', " + "'prenom'=" + joueur.getPrenom()
                    + "'nationalite'=" + joueur.getNationalite() + "'sexe'=" + joueur.getSexe() + "'catg'="
                    + joueur.getCatg() + "'rangs'=" + joueur.getRangs() + " WHERE id=" + joueur.getId();

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteJoueur(int _id) {
        try {
            String sqlQuery = "DELETE FROM joueur WHERE id=" + _id;

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
