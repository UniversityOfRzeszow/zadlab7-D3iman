/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.zad1;

public class Wykladowca extends Osoba {
    
    private String przedmiot;
    private String stopien_naukowy;
    
    public Wykladowca(String imie, String nazwisko, int data_urodzenia, String plec, String przedmiot, String stopien_naukowe){
        super(imie, nazwisko, data_urodzenia, plec);
        this.przedmiot = przedmiot;
        this.stopien_naukowy = stopien_naukowy;
    }
    
    @Override
    public void informacje(){
        super.informacje();
        System.out.println("--------------");
        System.out.println("Przedmiot: "+ przedmiot);
        System.out.println("Stopien naukowy: "+ stopien_naukowy);
        System.out.println("--------------");
    }
}
