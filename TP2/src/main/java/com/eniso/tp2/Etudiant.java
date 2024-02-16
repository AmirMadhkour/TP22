/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2;

/**
 *
 * @author eniso2020
 */
public class Etudiant {
      
  private  String  Nom ; 
  private  String Prenom ; 
  private  String Email ;
  private  int Num ;
    
  public Etudiant (String  Nom , String Prenom , String Email ,int Num){
      this.Nom = Nom ; 
      this.Prenom = Prenom ;
      this.Num = Num ; 
      this .Email = Email ;
  }
    
  public String getName(){
  return this.Nom;
  }
  
  public void setName (String Nom){
      this.Nom= Nom; 
  
  }
  
  public String getPrenom (){
      return this.Prenom;
  }
  
  public void setPrenom (String Prenom){
      this.Prenom = Prenom;
  }
  
  public String getEmail(){
      return this.Email;
  }
  
  public void setEmail(String Email){
      this.Email=Email;
    }
 
  public int getNum(){
      return this.Num;
  }
  
  public void setNum(int Num){
      this.Num=Num;
  }
  
  public String toString (){
      return this.Nom + this.Email + this.Prenom + this.Num;    
  }
  
}
