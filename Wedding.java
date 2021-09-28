/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwedding;

import java.time.LocalDate;

/**
 *
 * @author keeskothemagician
 */
public class Wedding 
{
    String weddingLocation;
    LocalDate weddingDate;
    Couple names;
    
    public Wedding(LocalDate weddingDate, String weddingLocation, Couple names)
    {
        this.names = names;
        this.weddingDate = weddingDate;
        this.weddingLocation = weddingLocation;
    }
    
    public LocalDate getweddingDate()
    {
        return weddingDate;
    }
    
    public Couple getnames()
    {
        return names;
    }
    
    public String getweddingLocation()
    {
        return weddingLocation;
    }

}
