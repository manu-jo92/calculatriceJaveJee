package com.calculatrice.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/accueil")
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Accueil() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher( "/WEB-INF/page.jsp").forward( request, response );
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    
	    this.getServletContext().getRequestDispatcher( "/WEB-INF/page.jsp").forward( request, response );
	    
	    // RESTE A TRANSMETTRE LE RESULTAT DU CALCUL A LA VUE PUIS CONDITION AFFICHAGE DANS LA VUE 
	}

}
