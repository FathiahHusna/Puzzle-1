/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Data {
    
    public String name;
    public String crop1;
    public String crop2;
    public String crop3;
    public String crop4;
    
    //default constructor
    public Data(){
        name = "xxx";
        crop1 = "xxx";
        crop2 = "xxx";
        crop3 = "xxx";
        crop4 = "xxx";
    }
  
    //normal constructor
    public Data(String name, String crop1, String crop2, String crop3, String crop4){
        this.name = name;
        this.crop1 = crop1;
        this.crop2 = crop2;
        this.crop3 = crop3;
        this.crop4 = crop4;
    }
    
    
   
    
    
}
