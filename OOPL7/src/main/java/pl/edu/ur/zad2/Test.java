/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.zad2;

public class Test {
    
    public static void main(String[] args) {
    
        Punkt2D dwaD = new Punkt2D();
        Punkt3D trzyD = new Punkt3D();
        
//        dwaD.losuj();
//        System.out.println(dwaD.toString());
//        trzyD.losuj();
//        System.out.println(trzyD.toString());
        
//        Punkt2D[] array2D = new Punkt2D[100];
//        Punkt3D[] array3D = new Punkt3D[100];
        
        for(int i=0; i < dwaD.array2D.length; i++){
            dwaD.losuj();
            Punkt2D n = new Punkt2D(dwaD.getX(), dwaD.getY());
            dwaD.array2D[i] = n;
        }
        
        for(int i=0; i < trzyD.array3D.length; i++){
            trzyD.losuj();
            Punkt3D n = new Punkt3D(trzyD.getX(), trzyD.getY(), trzyD.getZ());
            trzyD.array3D[i] = n;
        }
        
        System.out.println("W 100-elementowej tablicy x i y sa rowne sobie w dwoch plaszczyznach: ");
        for(int i=0; i < 100; i++){
            if(dwaD.array2D[i].getX() == trzyD.array3D[i].getX() && dwaD.array2D[i].getY() == trzyD.array3D[i].getY()){
                System.out.println("Element nr: "+ i +", "+dwaD.toString());
            }
        }
        
    }
}
