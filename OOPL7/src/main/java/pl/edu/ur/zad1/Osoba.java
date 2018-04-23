/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.zad1;

public class Osoba {
    
    private String imie;
    private String nazwisko;
    private int data_urodzenia;
    private String plec;

    public Osoba(String imie, String nazwisko, int data_urodzenia, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_urodzenia = data_urodzenia;
        this.plec = plec;
    }
    
    public void informacje(){
        System.out.println("--------------");
        System.out.println("Imie: "+ imie);
        System.out.println("Nazwisko: "+ nazwisko);
        System.out.println("Data urodzenia: "+ data_urodzenia);
        System.out.println("Plec: "+ plec);
        System.out.println("--------------");
    }
    
}
