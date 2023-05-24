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
public class Note {
    @JsonProperty("conteur")
    private int conteur;
    @JsonProperty("numEt")
    private String numEt;
    @JsonProperty("codemat")
    private String codemat;
    @JsonProperty("note")
    private double note;
    
    public Note(){   

    
    }
    public Note(int conteur,String numEt,String codemat,int note){
        this.conteur=conteur;
        this.numEt=numEt;
        this.codemat=codemat;
        this.note=note;
    }
     public int getConteur(){
        return this.conteur;
    }
    public String getNumEt(){
        return this.numEt;
    }
    public String getCodeMat(){
        return this.codemat;
    }
    public double getNote(){
        return this.note;
    }
     public void setNumEt(String numEt){
        this.numEt=numEt;
    }
     public void setConteur(int conteur){
        this.conteur=conteur;
    }
    public void setCodeMat(String codemat){
        this.codemat=codemat;
    }
      public void setNote(double note){
        this.note=note;
    }
    public Note[] listeNotes() throws IOException{
        String url="http://127.0.0.1:8081/api/notes";
        HttpClient  client=new DefaultHttpClient();
        HttpGet request=new HttpGet(url);
        HttpResponse response=client.execute(request);
        ObjectMapper a=new ObjectMapper();
        Note[] notes=a.readValue(response.getEntity().getContent(), Note[].class);
        return notes;
     }

}
