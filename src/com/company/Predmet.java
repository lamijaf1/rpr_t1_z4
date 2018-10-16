package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Predmet {
    private  Student[] studenti;
    private String NazivPredmeta;
    private int SifraPredmeta;
    public  int MaksimalanBrojStudenata;

  public  void NapraviNovi( Student novi) {
      Student[] Novi=new Student[0];
        if (studenti.length <MaksimalanBrojStudenata ){

            Novi = new Student[studenti.length + 1];
            for (int i = 0; i < studenti.length; i++) {
                Novi[i] = studenti[i];
            }
            Novi[studenti.length] = novi;
        }
        studenti=Novi;
  }
/*  public  void Izbrisi(Student stari){
      for (int i = 0; i < studenti.length; i++) {
          if(studenti[i].getIme()==stari.getIme()) studenti[i]=null;
      }
  }*/
  public Predmet(String naziv, int sifra) {
     this.setNazivPredmeta(naziv);
     this.SifraPredmeta = sifra;

 }
  public Predmet(String naziv, Student podaci){
     this.setNazivPredmeta(naziv);
     NapraviNovi(podaci);
 }
    public  void upisi(Student student){
      if(studenti.length<MaksimalanBrojStudenata){
          NapraviNovi(student);
      }
      else System.out.println("Dostignut je maksimalan broj korisnika na predmetu!");
    }
    public  void ispisi(Student student){
        for (int i = 0; i < studenti.length; i++) {
            if(studenti[i].getIme()==student.getIme()) studenti[i]=null;
        }
    }
    public String getNazivPredmeta() {
        return NazivPredmeta;
    }


    public int getSifraPredmeta() {
        return SifraPredmeta;
    }


    public void setSifraPredmeta(int sifraPredmeta) {
        SifraPredmeta = sifraPredmeta;
    }

    public  void setNazivPredmeta(String nazivPredmeta) {
        NazivPredmeta = nazivPredmeta;
    }
    @Override
    public String toString(){
      return NazivPredmeta+SifraPredmeta;
    }


}
