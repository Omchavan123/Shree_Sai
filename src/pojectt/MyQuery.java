/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojectt;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;


/**
 *
 * @author omcha
 */
public class MyQuery {
    
    public Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","omkar");
        } catch (SQLException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return conn;
    }

public ArrayList<Product> BindTable()
      {
        
            ArrayList<Product> productList = new ArrayList<Product>();
            Connection conn=getConnection();
            String query = " SELECT * FROM Products where Type='T-shirt'";
            Statement st ;
            ResultSet rs ;
            
         try {   
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Product product;
            
            
            while(rs.next())
            {
                product = new Product(rs.getInt("id") , rs.getString("Name") , rs.getString("Type"), rs.getString("Price"),rs.getString("Add_date") , rs.getBytes("Image"));
                productList.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
         return productList;
     
      }


public ArrayList<Product> BindTable1()
      {
        
            ArrayList<Product> productList = new ArrayList<Product>();
            Connection conn=getConnection();
            String query = " SELECT * FROM Products where Type='Banner'";
            Statement st ;
            ResultSet rs ;
            
         try {   
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Product product;
            
            
            while(rs.next())
            {
               product = new Product(rs.getInt("id") , rs.getString("Name") , rs.getString("Type"), rs.getString("Price"),rs.getString("Add_date") , rs.getBytes("Image"));
                productList.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
         return productList;
     
      }
public ArrayList<Product> BindTable2()
      {
        
            ArrayList<Product> productList = new ArrayList<Product>();
            Connection conn=getConnection();
           String query = " SELECT * FROM Products where Type='Card'";
            Statement st ;
            ResultSet rs ;
            
         try {   
            st = conn.createStatement();
            rs = st.executeQuery(query);
            Product product;
            
            
            while(rs.next())
            {
               product = new Product(rs.getInt("id") , rs.getString("Name") , rs.getString("Type"), rs.getString("Price"),rs.getString("Add_date") , rs.getBytes("Image"));
                productList.add(product);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
         return productList;
     
      }

    
    
    
    
    
}
