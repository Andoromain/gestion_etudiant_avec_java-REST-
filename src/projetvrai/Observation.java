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
public class Observation {
    @JsonProperty("moyenne")
    private String moyenne;
    @JsonProperty("observation")
    private String observation;
    
    public Observation(){   

    
    }
    public Observation(String moyenne,String observation){
        this.moyenne=moyenne;
        this.observation=observation;
    }
    
    public String getMoyenne(){
        return this.moyenne;
    }
    public String getobservation(){
        return this.observation;
    }
}
