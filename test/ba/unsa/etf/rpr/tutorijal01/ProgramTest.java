package ba.unsa.etf.rpr.tutorijal01;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    void dodajPredmet() {
        Program p=new Program();
        Predmet p1=new Predmet("rpr",101,2);

       // assertThrows(IllegalArgumentException.class , ()-> { });


    }

    @Test
    void dodajStudentaTest() {
        Student s=new Student("lamija","Fazlija", 17617);



    }

    @Test
    void kreirajPredmet() {
    }

    @Test
    void kreirajStudenta() {
    }

    @Test
    void upisStudenta() {
    }

    @Test
    void listaStudenata() {
    }

    @Test
    void listaPredmeta() {
    }

    @Test
    void removeElementStudent() {
    }

    @Test
    void removeElementPredmet() {
    }

    @Test
    void UnosStudenata() {
        Scanner ulaz = new Scanner(System.in);
        PrintStream izlaz = System.out;

    }

    @Test
    void unosPredmeta() {
    }

    @Test
    void upisiStudenta() {
    }

    @Test
    void ispisiStudenta() {

    }

    @Test
    void getStudentiTest() {
        Predmet p = new Predmet("rpr", 001, 7);
        Student s = new Student("Lamija", "Fazlija", 17617);
        p.setStudenti(new Student[12]);
        assertEquals(12 , p.getStudenti().length);
        p.setStudenti(null);
        assertEquals(null , p.getStudenti());
}
    @Test
    void setStudenti() {
        Predmet p = new Predmet("rpr", 001, 7);
        Student[] s=new Student[2];
        p.setStudenti(new Student[2]);
        assertEquals(2, (p.getStudenti().length));
    }

    @Test
    void getPredmeti() {

    }

    @Test
    void setPredmeti() {

    }
}