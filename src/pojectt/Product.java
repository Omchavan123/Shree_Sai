/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojectt;

import javax.swing.ImageIcon;

/**
 *
 * @author omcha
 */
public class Product {
    
    private  int id ;
    private String Name;
    private String Type;
    private String Price;
    private String Add_date;
    private byte[] Picture;
    
    public Product( int pid , String pname ,  String pType ,String pprice , String pAdd_date , byte[] pimg)
    {
        this.id=pid;
        this.Name=pname;
        this.Price=pprice;
        this.Add_date=pAdd_date;
        this.Type=pType;
        this.Picture=pimg;
        
        
    }

    Product(String string, String string0, String string1, byte[] bytes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId()
    {
        return id;
    }
    
     public String getName()
    {
        return Name;
    }
     
      public String geType()
    {
        return Type;
    }
     
     public String getPrice()
    {
        return Price;
    }
     
     public String getAdd_date()
    {
        return Add_date;
    } 
    
    public byte[] getPicture()
    {
        return Picture;
    } 

    
     
   
    
     
    
    
}
