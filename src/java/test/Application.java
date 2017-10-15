package test;

import DAO.ArbitreDAO;
import DAO.ArbitreDAOMySQL;
import DAO.CourtDAO;
import DAO.CourtDAOMySQL;
import DAO.JoueurDAO;
import DAO.JoueurDAOMySQL;
import DAO.RencontreDAO;
import DAO.RencontreDAOMySQL;
import DAO.ResultatDAO;
import DAO.ResultatDAOMySQL;
import DAO.TournoiDAO;
import DAO.TournoiDAOMySQL;
import DAO.UserDAO;
import DAO.UserDAOMySQL;
import entities.Arbitre;
import entities.Court;
import entities.Joueur;
import entities.Rencontre;
import entities.Resultat;
import entities.Tournoi;
import entities.User;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class Application {

    public Application() {
    }

    static void afficherArbitre(List<Arbitre> arbitre) {
        System.out.println("");
        for (Arbitre e : arbitre) {
            System.out.println(e.getId() + "\t" + e.getNom() + "\t" + e.getPrenom() + "\t" + e.getSexe() + "\t" + e.getNationalite() + "\t" + e.getNiveau());
        }
    }

    static void afficherJoueur(List<Joueur> joueur) {
        System.out.println("");
        for (Joueur e : joueur) {
            System.out.println(e.getId() + "\t" + e.getNom() + "\t" + e.getPrenom() + "\t" + e.getSexe() + "\t" + e.getNationalite() + "\t"
                    + e.getCatg() + "\t" + e.getRangs());
        }
    }

    static void afficherTournoi(List<Tournoi> tournoi) {
        System.out.println("");
        for (Tournoi e : tournoi) {
            System.out.println(e.getId() + "\t" + e.getNom() + "\t" + e.getNbreSet());
        }
    }

    static void afficherCourt(List<Court> court) {
        System.out.println("");
        for (Court e : court) {
            System.out.println(e.getId() + "\t" + e.getNom());
        }
    }

    static void afficherRencontre(List<Rencontre> rencontre) {
        System.out.println("");
        for (Rencontre e : rencontre) {
            System.out.println(e.getId() + "\t" + e.getDate() + "\t" + e.getHeure() + "\t" + e.getIdCourt() + "\t" + e.getIdArbitre() + "\t" + e.getIdTournoi()
                    + "\t" + e.getIdJoueur1() + "\t" + e.getIdJoueur2());
        }
    }

    static void afficherResultat(List<Resultat> resultat) {
        System.out.println("");
        for (Resultat e : resultat) {
            System.out.println(e.getId() + "\t" + e.getIdRencontre() + "\t" + e.getDuree() + "\t" + e.getSet1J1() + "\t" + e.getSet2J1() + "\t" + e.getSet3J1()
                    + "\t" + e.getSet4J1() + "\t" + e.getSet5J1() + "\t" + e.getSet1J2() + "\t" + e.getSet2J2() + "\t" + e.getSet3J2()
                    + "\t" + e.getSet4J2() + "\t" + e.getSet5J2());
        }
    }

    static void afficherUser(List<User> user) {
        System.out.println("");
        for (User e : user) {
            System.out.println(e.getId() + "\t" + e.getNom() + "\t" + e.getPrenom() + "\t" + e.getMdp() + "\t" + e.getCatg());
        }
    }

    // Importation des méthodes ApplicationData du prof
    
    /**
	 * Récupère l'utilisateur en session, ou null si aucun
	 * 
	 * @param request
	 * @return
	 */
	public static User getConnectedUser( HttpServletRequest request )
	{
		return (User) request.getSession().getAttribute( "connectedUser" );
	}

	/**
	 * Enregistre l'utilisateur en session
	 * 
	 * @param request
	 * @param user
	 */
	public static void setConnectedUser( HttpServletRequest request, User user )
	{
		request.getSession().setAttribute( "connectedUser", user );
	}

	/**
	 * Récupère la liste des utilisateurs à partir du contexte applicatif
	 * 
	 * @param servletContext
	 * @return
	 */
	public static List<User> getUserDatabase( ServletContext servletContext )
	{
		List<User> userDatabase = (List<User>) servletContext.getAttribute( "userDatabase" );

		if( userDatabase == null )
		{
			userDatabase = new ArrayList<>();
			servletContext.setAttribute( "userDatabase", userDatabase );
		}

		return userDatabase;
	}

	/**
	 * Récupère la liste des utilisateurs à partir du traitement d'une requete Http
	 * 
	 * @param servletContext
	 * @return
	 */
	public static List<User> getUserDatabase( HttpServletRequest request )
	{
		return getUserDatabase( request.getServletContext() );
	}

    public static void main(String[] args) {
//        JoueurDAO joueurDAO = new JoueurDAOMySQL();
//        ArbitreDAO arbitreDAO = new ArbitreDAOMySQL();
//        TournoiDAO tournoiDAO = new TournoiDAOMySQL();
//        CourtDAO courtDAO = new CourtDAOMySQL();
//        RencontreDAO rencontreDAO = new RencontreDAOMySQL();
//        ResultatDAO resultatDAO = new ResultatDAOMySQL();
//        UserDAO userDAO = new UserDAOMySQL();
//
//        List<Joueur> listeJoueur = joueurDAO.getAll();
//        List<Arbitre> listeArbitre = arbitreDAO.getAll();
//        List<Tournoi> listeTournoi = tournoiDAO.getAll();
//        List<Court> listeCourt = courtDAO.getAll();
//        List<Rencontre> listeRencontre = rencontreDAO.getAll();
//        List<Resultat> listeResultat = resultatDAO.getAll();
//        List<User> listeUser = userDAO.getAll();
//
//        afficherJoueur(listeJoueur);
//        afficherArbitre(listeArbitre);
//        afficherTournoi(listeTournoi);
//        afficherCourt(listeCourt);
//        afficherRencontre(listeRencontre);
//        afficherResultat(listeResultat);
//        afficherUser(listeUser);
//
//        // Joueur j1 = new Joueur(55, "Julien", "Perrin", "fr", 1, 888, 999, 1);
//        // joueurDAO.addJoueur(j1);
//        // j1 = joueurDAO.getOne(3);
//        // j1.setNom("Toto");
//        // joueurDAO.updateJoueur(j1);
//        // joueurDAO.deleteJoueur(6);
//        // Arbitre a1 = new Arbitre(55, "Maillard", "Stephane");
//        // arbitreDAO.addArbitre(a1);
//        // arbitreDAO.deleteArbitre(3);
    }
}
