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
public class Etudiant {
    @JsonProperty("numEt")
    private String numEt;
    @JsonProperty("nom")
    private String nom;
    @JsonProperty("niveau")
    private String niveau;
    
    public Etudiant(){
    
    }
     public Etudiant(String numEt,String nom,String niveau){
        this.numEt=numEt;
        this.nom=nom;
        this.niveau=niveau;
    }
    public String getnum(){
        return this.numEt;
    }
    public String getnom(){
        return this.nom;
    }
    public String getniveau(){
        return this.niveau;
    }
    
    public Etudiant[] listeEtudiants() throws IOException{
        String url="http://127.0.0.1:8081/api/etudiants";
        HttpClient  client=new DefaultHttpClient();
        HttpGet request=new HttpGet(url);
        HttpResponse response=client.execute(request);
        //BufferedReader rd=new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        
        ObjectMapper a=new ObjectMapper();
        Etudiant[] etudiants=a.readValue(response.getEntity().getContent(), Etudiant[].class);
        
        return etudiants;
     }
    
}
