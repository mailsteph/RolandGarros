<%@page import="entities.Joueur"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="DAO.JoueurDAOMySQL"%>
<%@page import="DAO.JoueurDAO"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <!-- La page Joueur marche, on peut ajouter et supprimer un joueur (depuis l'aside), la base de donnée est modifiée -->
    <head>
        <title>Joueur</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="FeuilleCSS.css" />
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

                    <h2><strong>Enregistrement d'un nouveau joueur</strong></h2>
                    <br />
                    <p>Enregistrer un nouveau joueur en indiquant son nom, son prénom, son sexe, sa nationalité, son rang mondial en simple et sa catégorie (adulte ou junior).</p>
                </section>

                <section class="col-md-6">
                    <form method='post' action='addjoueur'>
                        <div class="row">    
                            <div class="form-group">
                                <label for="nom" class="col-md-4 control-label">Nom</label>
                                <div class="col-md-8">
                                    <input type="text" name="nom" maxlength="30" id="nom" required="required" class="form-control"/> 
                                </div>
                            </div>
                        </div>

                        <div class="row">    
                            <div class="form-group">
                                <label for="prenom" class="col-md-4 control-label">Prénom</label>
                                <div class="col-md-8">
                                    <input type="text" name="prenom" maxlength="30" id="prenom" required="required" class="form-control"/> 
                                </div>
                            </div>
                        </div>

                        <div class="row">    
                            <div class="form-group">
                                <label for="sexe" class="col-md-4 control-label">Sexe</label>
                                <div class="col-md-8">
                                    <select name="sexe" id="sexe" required="required" class="form-control">
                                        <option value='2'>Féminin</option>
                                        <option value='1'>Masculin</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="row">    
                            <div class="form-group">
                                <label for="nationalite" class="col-md-4 control-label">Nation</label>
                                <div class="col-md-8">
                                    <select name="nationalite" id="nationalite" required="required" class="form-control">
                                        <option>Suisse</option>
                                        <option>Espagne</option>
                                        <option>Angleterre</option>
                                        <option>Autriche</option>
                                        <option>Japon</option>
                                        <option>Croatie</option>
                                        <option>Serbie</option>
                                        <option>France</option>        
                                        <option>Tchécoslovaquie</option> 
                                        <option>Ukraine</option> 
                                        <option>Roumanie</option>   
                                        <option>Lettonie</option> 
                                        <option>Danemark</option> 
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="row">    
                            <div class="form-group">
                                <label for="rangs" class="col-md-4 control-label">Rang mondial en Simple</label>
                                <div class="col-md-8">
                                    <input type="text" name="rangs" maxlength="30" id="rangs" required="required" class="form-control"/> 
                                </div>
                            </div>
                        </div>

                        <div class="row">    
                            <div class="form-group">
                                <label for="catg" class="col-md-4 control-label">Catégorie</label>
                                <div class="col-md-8">
                                    <select name="catg" id="catg" required="required" class="form-control">
                                        <option>Adulte</option>
                                        <option>Junior</option>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="row col-md-8">    
                            <div class="form-group">
                                <input type="submit" value="Enregistrer le joueur" class="form-control btn-primary" />
                            </div>
                        </div>
                    </form>
                </section>

            </div>


            <aside class="col-md-2">

                <ul class="list-group">
                    <li class="list-group-item active">Liste des joueurs enregistrés</li>
                        <c:forEach items="${listeJoueur}" var="joueur" varStatus="loop"> 
                        <li class="list-group-item">
                            <a href="#"> ${joueur.nom} ${joueur.prenom} </a>
                            <form style="display: inline ; float: right" method="post" action="deletejoueur">
                                <input type="hidden" name="id" value="${joueur.id}" />
                                <button type="submit" class="glyphicon glyphicon-remove " ></button>
                            </form>
                        </li>

                    </c:forEach>

                </ul>


            </aside>  

            <footer class="col-md-12">&#9400; 2017 Copyright, Inc.</footer>
        </div>
    </body>
</html>
