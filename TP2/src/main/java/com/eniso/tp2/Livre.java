/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

/**
 *
 * @author eniso2020
 */
public class Livre {
   private String titre ;
   private String auteur;
   public String anner ;
   public String isbn ;
   
   public Livre (){
        this.titre="kallila";
        this.auteur = "ahmed chawki" ;
        this.anner = "1998";
        this.isbn = "255";
   }
   
   public String getTitre(){
       return this.titre ;
   }
   
   public void setTitre(String titre){
       this.titre=titre;
   }
   
   public String getAuteur (){
       return this.auteur;
   }
   
   public void setAuteur (String auteur){
       this.auteur=auteur;
   }
   
   public Livre (String titre, String auteur ){
       this.titre = titre;
       this.auteur = auteur ;       
       this.anner = "2001" ; 
       this.isbn = "45" ;
   }

   public Livre (String titre, String auteur , String anner ){
        this.titre=titre;
        this.auteur = auteur ;
        this.anner = anner;
        this.isbn = "88" ;
        
   }
   
   public Livre (String titre , String auteur, String anner , String isbn ){
       this.titre=titre;
       this.anner=anner;
       this.auteur=auteur;
       this.isbn=isbn;
   }

   public void afficher (){
       
       Livre l = new Livre (this.titre, this.auteur , this.anner , this.isbn);
       System.out.println("le titre "+l.getTitre());
       System.out.println("lauteur"+l.getAuteur());
       System.out.println("lanner"+anner);
       System.out.println("lisbn"+isbn);
       
   }
}

