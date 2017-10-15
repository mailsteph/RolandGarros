/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.JoueurDAO;
import DAO.JoueurDAOMySQL;
import entities.Joueur;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rencontre")
public class RencontreServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JoueurDAO joueurDAO = new JoueurDAOMySQL();
        List<Joueur> listeJoueur = joueurDAO.getAll();
        
        req.setAttribute("listeJoueur", listeJoueur);
        req.getRequestDispatcher("rencontre.jsp").forward(req, resp);

    }

}
