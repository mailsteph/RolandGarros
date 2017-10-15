package servlet;

import DAO.JoueurDAO;
import DAO.JoueurDAOMySQL;
import entities.Joueur;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addjoueur")
public class AddJoueurServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String nationalite = req.getParameter("nationalite");
        String catg = req.getParameter("catg");
        int sexe = Integer.parseInt(req.getParameter("sexe"));
        int rangs = Integer.parseInt(req.getParameter("rangs"));

        Joueur joueur = new Joueur(nationalite, catg, rangs, 1, nom, prenom, sexe);
        JoueurDAO joueurDAO = new JoueurDAOMySQL();
        joueurDAO.addJoueur(joueur);
        
        resp.sendRedirect("joueur");
    }
}
