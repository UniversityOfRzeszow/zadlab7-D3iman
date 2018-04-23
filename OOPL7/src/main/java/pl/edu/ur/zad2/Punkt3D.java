/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.zad2;

public class Punkt3D extends Punkt2D {
    
    private int z;
    
    Punkt3D[] array3D = new Punkt3D[100];

    public Punkt3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public Punkt3D() {
        z = 0;
    }

    public int getZ() {
        return z;
    }
    
    @Override
    public void losuj(){
        super.losuj();
        z = random.nextInt(21) + (-10);
    }
    
    @Override
    public String toString(){
        return super.toString() +", z = "+ z;
    }
    
}
