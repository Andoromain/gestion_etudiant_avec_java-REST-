/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetvrai;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Andrô Ajpr Romain
 */
public class Notage {
    @JsonProperty("libelle")
    private String libelle;
    @JsonProperty("coef")
    private int coef;
    @JsonProperty("note")
    private double note;
    @JsonProperty("ponderee")
    private double ponderee;
    
    public Notage(){   

    
    }
    public Notage(String libelle,int coef,double note,double ponderee){
        this.libelle=libelle;
        this.coef=coef;
        this.note=note;
        this.ponderee=ponderee;
    }
    
    public String getLibelle(){
        return this.libelle;
    }
    public int getCoef(){
        return this.coef;
    }
    public double getNote(){
        return this.note;
    }
    public double getPonderee(){
        return this.ponderee;
    }
}
