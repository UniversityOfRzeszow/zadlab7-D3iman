/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.zad2;

import java.util.Random;

public class Punkt2D {
    
    private int x;
    private int y;
    
    Punkt2D[] array2D = new Punkt2D[100];
    
    Random random = new Random();

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void losuj(){
        x = random.nextInt(21) + (-10);
        y = random.nextInt(21) + (-10);
    }
    
    @Override
    public String toString(){
        return "x = "+ x +", y = "+ y;
    }
    
}
