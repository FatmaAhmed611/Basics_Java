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
public class Triangle {
    
    private float side1;
    private float side2;
    private float side3;
    private float angle12;
    private float angle23;
    private float angle13;
    private float area;
    private float primeter;
    public Triangle(){
        this.side1=3;
        this.side2=4;
        this.side3=5;
    }
    public Triangle(float side){
        this.side1=side;
        this.side2=side;
        this.side3=side;
        this.angle12=this.angle13=this.angle23=60;
    }
    
    public Triangle(float side1,float side2, float side3,float largestAngle){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        
        if(side1>side2){
            if(side1>side3){
                this.angle23=largestAngle;
            }else{
                this.angle12=largestAngle;
            }
        }else{
            if(side2>side3){
                this.angle13=largestAngle;
            }else{
                 this.angle12=largestAngle;
            }
        }
    }
    
    public Triangle(float side1, float side3,float angleBetwen1And3){
        this.side1=side1;
        this.side3=side3;
        this.angle13=angleBetwen1And3;
    }
    
    public Triangle(Triangle tri){
        
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public float getAngle12() {
        return angle12;
    }

    public void setAngle12(float angle12) {
        this.angle12 = angle12;
    }

    public float getAngle23() {
        return angle23;
    }

    public void setAngle23(float angle23) {
        this.angle23 = angle23;
    }

    public float getAngle13() {
        return angle13;
    }

    public void setAngle13(float angle13) {
        this.angle13 = angle13;
    }
    
    public float calculatePrimeter(){
        this.primeter=this.side1+this.side2+this.side3;
        return primeter;
    }
    
//    public float calculatePrimeter(){
//        this.area=0.5f*this.side1*this.side3*(float)Math.sin(Math.toRadians(angle12));
//        return this.area;
//    }
    
}
