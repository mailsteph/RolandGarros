<%@page import="entities.Joueur"%>
<%@page import="DAO.JoueurDAOMySQL"%>
<%@page import="java.util.List"%>
<%@page import="DAO.JoueurDAO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <!-- La page Rencontre marche mais la servlet est en cours d'écriture pour ajouter des rencontres, les listes sont statiques, 
    nous avons essayer d'ajouter une fonction pour vérifier à la soumission du formulaire que le joueur 1 et le joueur 2 sont différents, 
    la fonction doit être vérifiée-->
    <head>
        <title>Rencontre</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="FeuilleCSS.css" />
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />

        <script src=" http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/i18n/jquery-ui-i18n.min.js"></script>

        <script>

            $(function () {
                $("#date").datepicker($.datepicker.regional["fr"]);
            });


            function verifFormulaire(form)
            {
                if (form.idJoueur1.value == form.idJoueur2.value)
                {
                    alert("Joueur 1 et Joueur 2 identiques");
                    font.idJoueur1.focus()
                } else
                {
                    form.submit();
                }
            }

        </script>

    </head>
    <body>

        <div class="container col-md-12">

            <nav class="navbar navbar-inverse navbar-fixed-top">
                <div class="container-fluid">

                    <div class="navbar-header">
                        <img class="nav navbar-nav thumbnail" src="images/LogoRG.jpg" alt="Logo Roland-Garros"/>
                        <a class="navbar-brand" href="#">ROLAND-GARROS</a>
                    </div>

                    <ul class="nav navbar-nav">
                        <li class="active"><a href="home.html">Home</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
            </nav>


            <div class="col-md-offset-1 col-md-9 smallscreen"> 

                <section class="jumbotron col-md-12 col-sm-12 col-xs-12">

                    <h2><strong>Planifier les rencontres</strong></h2>
                    <br />
                    <p>Planifier une nouvelle rencontre en indiquant le type de tournoi, les 2 joueurs, l'arbitre, le court, la date et l'heure.</p>
                </section>

                <section class="col-md-6">

                    <div class="row">    
                        <div class="form-group">
                            <label for="idTournoi" class="col-md-4 control-label">Tournoi</label>
                            <div class="col-md-8">
                                <select name="idTournoi" id="idTournoi" required="required" class="form-control">
                                    <option>Simple Messieurs</option>
                                    <option>Simple Dames</option>
                                    <option>Simple Juniors Garçons</option>
                                    <option>Simple Juniors Filles</option>
                                </select>      
                            </div>
                        </div>
                    </div>



                    <div class="row">    
                        <div class="form-group">
                            <label for="idJoueur1" class="col-md-4 control-label">Joueur 1</label>
                            <div class="col-md-8">
                                <select name="idJoueur1" id="idJoueur1" required="required" class="form-control">
                                    <c:forEach items="${listeJoueur}" var="joueur" varStatus="loop">
                                        <option value="${joueur.id}">${joueur.nom} ${joueur.prenom}</option>
                                    </c:forEach>


                                </select>      
                            </div>
                        </div>
                    </div>    

                    <div class="row">    
                        <div class="form-group">
                            <label for="idJoueur2" class="col-md-4 control-label">Joueur 2</label>
                            <div class="col-md-8">
                                <select name="idJoueur2" id="idJoueur2" required="required" class="form-control">
                                    <c:forEach items="${listeJoueur}" var="joueur" varStatus="loop">
                                        <option value="${joueur.id}"> ${joueur.nom} ${joueur.prenom}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="row">    
                        <div class="form-group">
                            <label for="idArbitre" class="col-md-4 control-label">Arbitre</label>
                            <div class="col-md-8">
                                <select name="idArbitre" id="idArbitre" required="required" class="form-control">
                                    <option>Manuel Absolu</option>
                                    <option>Pierre Bacchi</option>
                                    <option>Thierry Carel</option>
                                    <option>Romain Dairiam-ubassy</option>
                                    <option>Stéphane Edouard</option>
                                    <option>Joël Fabas</option>
                                    <option>Arnaud Gabas</option>
                                    <option>Kim Hoan Ha Thuc</option>
                                </select>      
                            </div>
                        </div>
                    </div>    

                    <div class="row">    
                        <div class="form-group">
                            <label for="idCourt" class="col-md-4 control-label">Court</label>
                            <div class="col-md-8">
                                <select name="idCourt" id="idCourt" required="required" class="form-control">
                                    <option>Philippe Chatrier</option>
                                    <option>Suzanne Lenglen</option>
                                    <option>Court 1</option>
                                    <option>Court 2</option>
                                </select>      
                            </div>
                        </div>
                    </div>    

                    <div class="row">    
                        <div class="form-group">
                            <label for="date" class="col-md-4 control-label">Date du match</label>
                            <div class="col-md-8">
                                <input name="date" id="date" required="required" placeholder="jj/mm/aaaa" class="form-control">

                            </div>
                        </div>
                    </div>        

                    <div class="row">    
                        <div class="form-group">
                            <label for="heure" class="col-md-4 control-label">Heure du match</label>
                            <div class="col-md-8">
                                <input type="time" name="heure" id="heure" required="required" pattern="[0-2][0-9]:[0-9][0-9]" placeholder="hh:mm" class="form-control">

                            </div>
                        </div>
                    </div> 

                    <div class="row col-md-8">    
                        <div class="form-group">
                            <input type="submit" value="Planifier la rencontre" class="form-control btn-primary" onclick="verifFormulaire(form)" />
                        </div>
                    </div>

                </section>

            </div>

            <aside class="col-md-2">

                <ul class="list-group">
                    <li class="list-group-item active">Liste des rencontres</li>
                    <li class="list-group-item"><a href="#">
                            <p>Simple Messieurs - Rafael Nadal / Stan Wawrinka - Manuel Absolu - Philippe Chatrier - 10/06/2016 15:00</p>
                        </a></li>

                </ul>
            </aside>  

            <footer class="col-md-12">&#9400; 2017 Copyright, Inc.</footer>
        </div>
    </body>
</html>
