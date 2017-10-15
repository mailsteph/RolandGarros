package DAO;

import entities.Resultat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ResultatDAOMySQL implements ResultatDAO {

    private Connection databaseConnection;

    public ResultatDAOMySQL() {
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

    public List<Resultat> getAll() {
        List<Resultat> listeResultat = new ArrayList();

        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from resultat");
            while (rs.next()) {
                int id = rs.getInt("id");
                int idRencontre = rs.getInt("idRencontre");
                String duree = rs.getString("duree");
                int set1J1 = rs.getInt("set1J1");
                int set2J1 = rs.getInt("set2J1");
                int set3J1 = rs.getInt("set3J1");
                int set4J1 = rs.getInt("set4J1");
                int set5J1 = rs.getInt("set5J1");
                int set1J2 = rs.getInt("set1J2");
                int set2J2 = rs.getInt("set2J2");
                int set3J2 = rs.getInt("set3J2");
                int set4J2 = rs.getInt("set4J2");
                int set5J2 = rs.getInt("set5J2");

                Resultat resultat = new Resultat();
                resultat.setId(id);
                resultat.setIdRencontre(idRencontre);
                resultat.setDuree(duree);
                resultat.setSet1J1(set1J1);
                resultat.setSet2J1(set2J1);
                resultat.setSet3J1(set3J1);
                resultat.setSet4J1(set4J1);
                resultat.setSet5J1(set5J1);
                resultat.setSet1J2(set1J2);
                resultat.setSet2J2(set2J2);
                resultat.setSet3J2(set3J2);
                resultat.setSet4J2(set4J2);
                resultat.setSet5J2(set5J2);

                listeResultat.add(resultat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listeResultat;
    }

    public Resultat getOne(int _id) {
        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from resultat WHERE id=" + _id);
            if (rs.next()) {
                int id = rs.getInt("id");
                int idRencontre = rs.getInt("idRencontre");
                String duree = rs.getString("duree");
                int set1J1 = rs.getInt("set1J1");
                int set2J1 = rs.getInt("set2J1");
                int set3J1 = rs.getInt("set3J1");
                int set4J1 = rs.getInt("set4J1");
                int set5J1 = rs.getInt("set5J1");
                int set1J2 = rs.getInt("set1J2");
                int set2J2 = rs.getInt("set2J2");
                int set3J2 = rs.getInt("set3J2");
                int set4J2 = rs.getInt("set4J2");
                int set5J2 = rs.getInt("set5J2");

                Resultat resultat = new Resultat();
                resultat.setId(id);
                resultat.setIdRencontre(idRencontre);
                resultat.setDuree(duree);
                resultat.setSet1J1(set1J1);
                resultat.setSet2J1(set2J1);
                resultat.setSet3J1(set3J1);
                resultat.setSet4J1(set4J1);
                resultat.setSet5J1(set5J1);
                resultat.setSet1J2(set1J2);
                resultat.setSet2J2(set2J2);
                resultat.setSet3J2(set3J2);
                resultat.setSet4J2(set4J2);
                resultat.setSet5J2(set5J2);

                return resultat;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addResultat(Resultat resultat) {
        try {
            String sqlQuery = "INSERT INTO resultat (idRencontre, duree, set1J1, set2J1, set3J1, set4J1, set5J1, set1J2, set2J2, set3J2, set4J2, set5J5) VALUES ('"
                    + resultat.getIdRencontre() + "', '" + resultat.getDuree() + "', '" + resultat.getSet1J1() + "', '"
                    + resultat.getSet2J1() + "', '" + resultat.getSet3J1() + "', '" + resultat.getSet4J1() + "', '"
                    + resultat.getSet5J1() + "', '" + resultat.getSet1J2() + "', '" + resultat.getSet2J2() + "', '"
                    + resultat.getSet3J2() + "', '" + resultat.getSet4J2() + "', '" + resultat.getSet5J2()
                    + "')";

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public void updateResultat(Resultat resultat) {
        try {
            String sqlQuery = "UPDATE resultat SET 'idRencontre' = '" + resultat.getIdRencontre() + "', " + "'duree'=" + resultat.getDuree()
                    + "'set1J1'=" + resultat.getSet1J1() + "'set2J1'=" + resultat.getSet2J1() + "'set3J1'="
                    + resultat.getSet3J1() + "'set4J1'=" + resultat.getSet4J1() + "'set5J1'=" + resultat.getSet5J1()
                    + "'set1J2'=" + resultat.getSet1J2() + "'set2J2'=" + resultat.getSet2J2() + "'set3J2'="
                    + resultat.getSet3J2() + "'set4J2'=" + resultat.getSet4J2() + "'set5J2'=" + resultat.getSet5J2()
                    + " WHERE id=" + resultat.getId();

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteResultat(int _id) {
        try {
            String sqlQuery = "DELETE FROM resultat WHERE id=" + _id;

            Statement statement = databaseConnection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
