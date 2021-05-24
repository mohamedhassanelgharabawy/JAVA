/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

/**
 *
 * @author HP
 */
public class clothes {
    private int size ; 
    String color;
    String type;
    
    
    public clothes(){};
    
    public clothes (int s,String c,String t)
    {
        size = s;
        color = c;
        type = t;
       
    }

    
    
    public void setSize(int size)
    {
        this.size = size;
    }
    
    int getSize()
    {
        return size;
    }
    
    String getColor()
    {
        return color;
    }
    
    String getType()
    {
        return type;
    }
    
    
    
    
    
}
