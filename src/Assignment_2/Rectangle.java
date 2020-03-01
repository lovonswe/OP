/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

/**
 *
 * @author User
 */
public class Rectangle {
    int length=7, width=3;
    String color="Green";
    public Rectangle(){
       System.out.println("Lenght= "+length+", Width= "+width+", Color= "+color);
    }
    
    public Rectangle(int length, int width, String color){
        this.length=length;
        this.width=width;
        this.color=color;
        System.out.println("Lenght= "+this.length+", Width= "+this.width+", Color= "+this.color);
    }
    
    public Rectangle(Rectangle SampleRectangle){
        this.length=SampleRectangle.length;
        this.width=SampleRectangle.width;
        this.color=SampleRectangle.color;
        System.out.println("Lenght= "+this.length+", Width= "+this.width+", Color= "+this.color);
    }
       
}
