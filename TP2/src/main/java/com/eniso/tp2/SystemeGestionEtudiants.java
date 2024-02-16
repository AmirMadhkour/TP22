/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;
import java.util.ArrayList;
/**
 *
 * @author eniso2020
 */

public class SystemeGestionEtudiants {
    public int N ; 
    private ArrayList<Etudiant> T;
    
    public SystemeGestionEtudiants(ArrayList<Etudiant> T){ //le constructeur  dima public 
        this.T=T ;
    }
    
    public ArrayList<Etudiant> getT (){
        return this.T ;
    }
    
    public void setT(ArrayList<Etudiant> T){
            this.T=T ;
    } 
    
    public String toString (){ //this errerur
        return "La liste "+this.T; 
            } 
    
    public void ajouterEtudiant(String Nom , String Prenom , String Email , int Num ){
        Etudiant e = new Etudiant(Nom, Prenom, Email, Num);
        T.add(e) ; 
        
    }
    
    public void afficherEtudiants(){
        for (Etudiant e : this.T){
        System.out.println("le nom est "+e.getName());
        System.out.println("le Prenom"+e.getPrenom());
        System.out.println("L'Email"+e.getEmail()); //staamalna getEmail khaterhom prv 
        }
    }
    
    
    public void modifierEmailEtudiant(int Num , String Email1){
                for (Etudiant e : this.T){
                    if (e.getNum() == Num){
                            e.setEmail(Email1);
                        }
                }
    }
    
    public void supprimerEtudiant(int Num ){
        int i=0;
        for (Etudiant e : this.T){
            if( e.getNum() == Num ){
                this.T.remove(i);
                break;
            }
            i++;
        }
    }


}


    
