package servlet;

import entities.User;
import DAO.UserDAO;
import DAO.UserDAOMySQL;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test.Application;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        String mdp = req.getParameter("mdp");
        UserDAO userDAO = new UserDAOMySQL();
        List<User> listeUser = userDAO.getAll();

        if (nom != null && !nom.trim().isEmpty() && mdp != null && !mdp.trim().isEmpty()) {
            // on cherche un utilisateur avec ce nom, ce prénom et ce mot de passe dans notre base d'utilisateurs

            for (User user : listeUser) {
                if (user.getNom().equals(nom) && user.getMdp().equals(mdp)) {
                    Application.setConnectedUser(req, user);

                    break;
                }
            }
        }
        resp.sendRedirect("home");
    }
}
