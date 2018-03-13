package lab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class cities {
    private Map<String,List<String>> provinces = new HashMap();
    private List<String> cities = new ArrayList();
    public Cities(){
         List<String> list1 = new ArrayList();
         list1.add("Elblag");
         list1.add("Olsztyn");
         privinces.put("Warminsko-Mazurskie",lst1);
         List<String> list2 = Array.asList("Gdansk","Sopot","Gdynia");
         provinces.put("Pomorskie",list2);
    }
    public static void main (String[]args)
    {
        Cities c = Cities();
        System.out.println(c.provinces);
    }
}
