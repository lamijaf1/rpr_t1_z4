package ba.unsa.etf.rpr.tutorijal01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void PredmetTest() {
            Predmet p=new Predmet("rpr", 17617,10);
            assertEquals("rpr 17617",p.toString());
    }
    //TESTIRANJE POKUSAJA DODAVANJA VEC POSTOJECEG STUDENTA
    @Test
    void upisiTest(){
       /* Predmet p=new Predmet("rpr",101,11);
        Student[] s=new Student[3];
        Student novi=new Student("Lamija","Fazlija", 17617);
        p.setStudenti(s);
       // p.upisi(novi);
        assertThrows(IllegalArgumentException.class, ()-> { p.upisi(novi);});
*/
    }
    @Test
    void PredmetTest2(){

        assertThrows(IllegalArgumentException.class, ()-> {new Predmet("rpr", -1,21);});
    }
    @Test
    void upisiTest1() {
        Predmet p = new Predmet("RPR", 111,14);
        assertAll("predmet",
                () -> assertEquals("RPR", p.getNazivPredmeta()),
                () -> assertEquals(111, p.getSifraPredmeta()));
    }
    @Test
    void ispisiTest() {
    }

    @Test
    void getNazivPredmeta() {
        Predmet p = new Predmet("RPR", 003, 12);
        assertAll("predmet", () -> assertEquals("RPR", p.getNazivPredmeta()));
    }

    @Test
    void getSifraPredmeta() {
        Predmet p = new Predmet("RPR", 003, 12);
        assertAll("sifra", () -> assertEquals(003,p.getSifraPredmeta()));
    }
    @Test
    void setSifraPredmetaTest() {
        Predmet p = new Predmet("RPR", 17617, 12);
        p.setSifraPredmeta(17613);
        assertEquals("RPR 17613", p.toString());
    }

    @Test
        void setNazivPredmeta() {
        Predmet p = new Predmet("RPR", 17617, 12);
        p.setNazivPredmeta("OR");
        assertEquals("OR 17617", p.toString());
    }

    @Test
    void getStudentiTest() {
        Predmet p = new Predmet("rpr", 001, 7);
        Student s = new Student("Lamija", "Fazlija", 17617);
        p.setStudenti(new Student[12]);
        assertThrows(IllegalArgumentException.class, () -> {
            p.upisi(s);
        });
        p.setStudenti(null);
        assertArrayEquals(null , p.getStudenti());
    }
    @Test
    void setStudentiTest() {
        Predmet p = new Predmet("rpr", 001, 7);
        Student[] s=new Student[2];
        p.setStudenti(new Student[2]);
        assertNotNull(2,"Nije prazan");
        assertEquals(2, (p.getStudenti().length));
    }



}