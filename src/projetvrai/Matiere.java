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
public class Matiere {
    @JsonProperty("codemat")
    private String codemat;
    @JsonProperty("libelle")
    private String libelle;
    @JsonProperty("coef")
    private int coef;
    
    public Matiere(){   

    
    }
    public Matiere(String codemat,String libelle,int coef){
        this.codemat=codemat;
        this.libelle=libelle;
        this.coef=coef;
    }
    
    public String getCodeMat(){
        return this.codemat;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public int getCoefficient(){
        return this.coef;
    }
    public void setCodeMat(String codemat){
        this.codemat=codemat;
    }
     public void setLibelle(String libelle){
        this.libelle=libelle;
    }
      public void setCoefficient(int coef){
        this.coef=coef;
    }
    public Matiere[] listeMatieres() throws IOException{
        String url="http://127.0.0.1:8081/api/matieres";
        HttpClient  client=new DefaultHttpClient();
        HttpGet request=new HttpGet(url);
        HttpResponse response=client.execute(request);
        ObjectMapper a=new ObjectMapper();
        Matiere[] matieres=a.readValue(response.getEntity().getContent(), Matiere[].class);
        return matieres;
     }

    boolean geLibelle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
