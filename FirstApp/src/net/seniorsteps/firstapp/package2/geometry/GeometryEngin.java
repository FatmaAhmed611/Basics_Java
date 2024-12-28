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
public class GeometryEngin {
    
    public float calculateRectangleArea(Rectangle rect){
        return rect.getHeight()*rect.getWidth();
    }
    public float calculateRectanglePerimeter(Rectangle rect){
        return 2*(rect.getWidth()+rect.getHeight());
    }
    public float calculateCirclePerimeter(Circle circle){
        return 2*3.14f*circle.getDistance();
    }
    public float calculateCircleArea(Circle circle){
        return 3.14f*circle.getDistance()*circle.getDistance();
    }
    public float calculateSquareArea(Squere square){
        return square.getSide()*square.getSide();
    }
    public float calculateSquarePerimeter(Squere square){
        return square.getSide()*4;
    }
    
}
