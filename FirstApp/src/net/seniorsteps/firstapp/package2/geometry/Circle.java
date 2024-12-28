/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.firstapp.package2.geometry;

/**
 *
 * @author fatma
 */
public class Circle {
    private float distance;
    private float radius;
    public Circle(float radius)throws NagativeException{
        if(radius<0){
            throw new NagativeException("You are not allowed give me nagative value");
        }else{
           this.radius=radius; 
        }
        
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void setDistance(float d){
        distance=d;
    }
    
    public float getDistance(){
        return distance;
    }
    
}
