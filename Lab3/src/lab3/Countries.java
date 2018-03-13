/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class Countries {
    private Map<String,String> countries= new HashMap();
    
    public Countries() {
        countries.put("Poland","Warsaw");
        countries.put("Germany","Berlin");
        countries.put("Russia","Moscow");
        countries.put("Great Britain","London");
        countries.put("France","Paris");
        countries.put("Spain","Madrid");
    }
    
    public Collection<String> capitals(){
        return countries.values();
    }
    
    public Collection<String> countries(){
        return countries.keySet();
    }
    
    public Collection<String> sortedCountries(){
        Set c2 = new TreeSet();
        for(String c1 : countries.keySet()){
            c2.add(c1);
        } return c2;
    }
    
    public Collection<String> sortedCapitals(){
        Set c2 = new TreeSet();
        for(String c1 : countries.values()){
            c2.add(c1);
        } return c2;
    }
    
    
    
    @Override
    public String toString(){
        return countries.toString();
    }
    
    public static void main(String[] args){
        Countries c=new Countries();
        System.out.println(c);
        System.out.println(c.capitals());
        System.out.println(c.countries());
        System.out.println(c.sortedCountries());
        System.out.println(c.sortedCapitals());
    }
}
