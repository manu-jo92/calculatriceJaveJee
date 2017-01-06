package com.calculatrice.beans;

import javax.servlet.http.HttpServletRequest;

public class Calculs
{
    private double resultat;
    
    
    public double getResultat()
    {
        return resultat;
    }


    public void setResultat( double resultat )
    {
        this.resultat = resultat;
    }


    public void calculResultat(HttpServletRequest request)
    {
        double champ1 = Double.parseDouble( request.getParameter( "champ1" ));
        double champ2 = Double.parseDouble(request.getParameter( "champ2" ));
        
        resultat = champ1+ champ2;
    }

}
