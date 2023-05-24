/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetvrai;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Andrô Ajpr Romain
 */
public class Classement {
     @JsonProperty("numEt")
    private String numEt;
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("moyenne")
    private double moyenne;
    
    public Classement(){   

    
    }
    public Classement(String numEt,String nom,double moyenne){
        this.numEt=numEt;
        this.nom=nom;
        this.moyenne=moyenne;
    }
    
    public String getnumEt(){
        return this.numEt;
    }
    public String getNom(){
        return this.nom;
    }
    public double getMoyenne(){
        return this.moyenne;
    }

}
