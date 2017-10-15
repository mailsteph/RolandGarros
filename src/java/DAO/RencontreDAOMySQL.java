package DAO;

import entities.Rencontre;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RencontreDAOMySQL implements RencontreDAO {

    private Connection databaseConnection;

    public RencontreDAOMySQL() {
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

    public List<Rencontre> getAll() {
        List<Rencontre> listeRencontre = new ArrayList();

        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from rencontre");
            while (rs.next()) {
                int id = rs.getInt("id");
                String date = rs.getString("date");
                String heure = rs.getString("heure");
                int idCourt = rs.getInt("idCourt");
                int idArbitre = rs.getInt("idArbitre");
                int idTournoi = rs.getInt("idTournoi");
                int idJoueur1 = rs.getInt("idJoueur1");
                int idJoueur2 = rs.getInt("idJoueur2");

                Rencontre rencontre = new Rencontre();
                rencontre.setId(id);
                rencontre.setDate(date);
                rencontre.setHeure(heure);
                rencontre.setIdCourt(idCourt);
                rencontre.setIdArbitre(idArbitre);
                rencontre.setIdTournoi(idTournoi);
                rencontre.setIdJoueur1(idJoueur1);
                rencontre.setIdJoueur2(idJoueur2);

                listeRencontre.add(rencontre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listeRencontre;
    }

    public Rencontre getOne(int _id) {
        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from rencontre WHERE id=" + _id);
            if (rs.next()) {
                int id = rs.getInt("id");
                String date = rs.getString("date");
                String heure = rs.getString("heure");
                int idCourt = rs.getInt("idCourt");
                int idArbitre = rs.getInt("idArbitre");
                int idTournoi = rs.getInt("idTournoi");
                int idJoueur1 = rs.getInt("idJoueur1");
                int idJoueur2 = rs.getInt("idJoueur2");

                Rencontre rencontre = new Rencontre();
                rencontre.setId(id);
                rencontre.setDate(date);
                rencontre.setHeure(heure);
                rencontre.setIdCourt(idCourt);
                rencontre.setIdArbitre(idArbitre);
                rencontre.setIdTournoi(idTournoi);
                rencontre.setIdJoueur1(idJoueur1);
                rencontre.setIdJoueur2(idJoueur2);

                return rencontre;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addRencontre(Rencontre rencontre) {
        try {
            String sqlQuery = "INSERT INTO rencontre (date, heure, idCourt, idArbitre, idJoueur1, idJoueur2) VALUES ('"
                    + rencontre.getDate() + "', '" + rencontre.getHeure() + "', '" + rencontre.getIdCourt() + "', '"
                    + rencontre.getIdArbitre() + "', '" + rencontre.getIdJoueur1() + "', '" + rencontre.getIdJoueur2() + "')";

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void updateRencontre(Rencontre rencontre) {
        try {
            String sqlQuery = "UPDATE rencontre SET 'date' = '" + rencontre.getDate() + "', " + "'heure'=" + rencontre.getHeure()
                    + "'idCourt'=" + rencontre.getIdCourt() + "'idArbitre'=" + rencontre.getIdArbitre() + "'idJoueur1'="
                    + rencontre.getIdJoueur1() + "'idJoueur2'=" + rencontre.getIdJoueur1() + " WHERE id=" + rencontre.getId();

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteRencontre(int _id) {
        try {
            String sqlQuery = "DELETE FROM rencontre WHERE id=" + _id;

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
