package com.company;

public class Predmet {
    private  Student[] studenti;
    private String NazivPredmeta;
    private int SifraPredmeta;
    public  int MaksimalanBrojStudenata;

  public  void NapraviNovi( Student novi) {
      Student[] Novi=new Student[0];
        if (getStudenti().length <MaksimalanBrojStudenata ){

            Novi = new Student[getStudenti().length + 1];
            for (int i = 0; i < getStudenti().length; i++) {
                Novi[i] = getStudenti()[i];
            }
            Novi[getStudenti().length] = novi;
        }
        setStudenti(Novi);
  }

    public Predmet(String ime, int sifra, int max_br) {
        this.NazivPredmeta = ime;
        this.SifraPredmeta = sifra;
        this.MaksimalanBrojStudenata = max_br;
        studenti=new Student[0];
    }
  public Predmet(String naziv, Student podaci){
     this.setNazivPredmeta(naziv);
     NapraviNovi(podaci);
 }
    public  void upisi(Student student) throws IllegalArgumentException{
      if(studenti.length>MaksimalanBrojStudenata)throw new IllegalArgumentException (" Izlazak iz opsega");
      NapraviNovi(student);
    }
    public  void ispisi(Student student){
        for (int i = 0; i < getStudenti().length; i++) {
            if(getStudenti()[i].getIme()==student.getIme()) getStudenti()[i]=null;
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
    public int getMaksimalanBrojStudenata() {return MaksimalanBrojStudenata;}
    public Student[] getStudenti() { return studenti; }
    public void setStudenti(Student[] studenti) { this.studenti = studenti; }

    @Override
    public String toString(){ return NazivPredmeta+" " +SifraPredmeta;}


}
