/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2;
;

import java.util.ArrayList;

/**
 *
 * @author eniso2020
 */
public class TP2 {
    public static void main(String[] args) {
       
//exercice 1 

        Etudiant e = new Etudiant ("azert","dfghhj" , "azet@gmail.com" ,159 );  
        Etudiant e1 = new Etudiant ("monji","naamala" , "monji@gmail.com" ,963258 );
        ArrayList<Etudiant> T = new ArrayList<>();
        SystemeGestionEtudiants s = new SystemeGestionEtudiants( T ) ; 
        T.add(e);
        s.ajouterEtudiant("moha", "ren", "azezez@gmail.com", 1548);
        s.afficherEtudiants();
        s.modifierEmailEtudiant(1548 , "azeazcd@yaho.com" );
        s.supprimerEtudiant(1548);
        s.afficherEtudiants();
        
//exercice 2 
        
        Livre l = new Livre ();
        Livre l1 = new Livre ("ahmed" ,"chai");
        Livre l2 = new Livre("saas","najwa" , "2201");       
        Livre l3 = new Livre ("saio","sayer","2004","65");
        
        l.afficher();
        l1.afficher();
        l3.afficher();
        
    }

}



  
  
    

