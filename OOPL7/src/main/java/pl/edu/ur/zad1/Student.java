/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.zad1;

public class Student extends Osoba {
    
    private int nr_indeksu;
    private String typ_studiow;
    private String kierunek;
    private int rok_studiow;

    public Student(int nr_indeksu, String typ_studiow, String kierunek, int rok_studiow, String imie, String nazwisko, int data_urodzenia, String plec) {
        super(imie, nazwisko, data_urodzenia, plec);
        this.nr_indeksu = nr_indeksu;
        this.typ_studiow = typ_studiow;
        this.kierunek = kierunek;
        this.rok_studiow = rok_studiow;
    }
    
    @Override
    public void informacje(){
        super.informacje();
        System.out.println("--------------");
        System.out.println("Nr indeksu: "+ nr_indeksu);
        System.out.println("Typ studiow: "+ typ_studiow);
        System.out.println("Kierunek: "+ kierunek);
        System.out.println("Rok studiow: "+ rok_studiow);
        System.out.println("--------------");
    }
    
}
