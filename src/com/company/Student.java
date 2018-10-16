package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Student {
    private  String ime;
    private  String prezime;
    private  int indeks;
    /*static <T> T[] append(T[] arr, T element) {
        final int N = arr.length;
        arr = Arrays.copyOf(arr, N + 1);
        arr[N] = element;
        return arr;
    }*/
    public Student(String ime, String prezime, int indeks){
        this.setIme(ime);
        this.setPrezime(prezime);
        this.setIndeks(indeks);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }
    @Override
    public String toString() {
        return prezime+" "+ime+" ("+indeks+")";
    }
}
