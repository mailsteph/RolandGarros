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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletejoueur")
public class DeleteJoueurServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        
        int id = Integer.parseInt(req.getParameter("id"));

        JoueurDAO joueurDAO = new JoueurDAOMySQL();
        joueurDAO.deleteJoueur(id);
        
        resp.sendRedirect("joueur");
    }
    
    
}
