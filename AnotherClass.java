package org.project;

public class AnotherClass {

    String nazwy[]= {"Lucjan", "Oleksy", "Gienio" };

    {
        System.out.println(nazwy[0]);
    }

    public String[] getNazwy() {
        return nazwy;
    }

    public void setNazwy(String[] nazwy) {
        this.nazwy = nazwy;
    }
}
