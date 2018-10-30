package ba.unsa.etf.rpr.tutorijal01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    @Test
    void TestKonstruktora(){
        Student s=new Student("Lamija", "Fazlija", 17617);
        assertEquals("Fazlija Lamija (17617)", s.toString());
    }
    @Test
    void getImeTest() {
        Student s=new Student("Lamija", "Fazlija", 17617);
        Student s1=new Student(null, null, 000);
        assertAll("Provjera imena", ()-> assertEquals("Lamija", s.getIme()),
        ()-> assertEquals(null,s1.getIme()));
    }

    @Test
    void setIme() {
        Student s=new Student("Lamija", "Fazlija", 17617);
        s.setIme("Lejla");
        assertEquals("Lejla", s.getIme());
        s.setIme(null);
        assertEquals(null, s.getIme());
    }

    @Test
    void getPrezime() {
        Student s=new Student("Lamija", "Fazlija", 17617);
        Student s1=new Student(null, null, 000);
        assertAll("Provjera prezimena", ()-> assertEquals("Fazlija", s.getPrezime()),
                ()-> assertEquals(null,s1.getPrezime()));
    }

    @Test
    void setPrezime() {
        Student s=new Student("Lamija", "Fazlija", 17617);
        s.setPrezime("Prezime");
        assertEquals("Prezime", s.getPrezime());
        s.setPrezime(null);
        assertEquals(null, s.getPrezime());
    }

    @Test
    void getIndeks() {
        Student s=new Student("Lamija", "Fazlija", 17617);
        Student s2=new Student("lamija","fazlija", Integer.MIN_VALUE);
        Student s1=new Student(null, null, 0000);
        assertAll("Provjera indeksa", ()-> assertEquals(0, s1.getIndeks()),
                ()-> assertEquals(17617,s.getIndeks()),
                ()-> assertEquals(Integer.MIN_VALUE, s2.getIndeks()));
    }

    @Test
    void setIndeks() {
        Student s=new Student("Lamija", "Fazlija", 17617);
        s.setIndeks(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, s.getIndeks());
        s.setIndeks(17616);
        assertEquals(17616, s.getIndeks());
    }


}