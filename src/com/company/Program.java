package com.company;
/* kreiranje novog predmeta, novog studenta, upis studenta na predmet,
ispis studenta sa predmeta, brisanje studenta, brisanje predmeta, te ispis spiska studenata na predmetu.
 */

import java.util.Scanner;
import java.util.InputMismatchException;
public class Program {
    private static Scanner ulaz = new Scanner(System.in);
    private static Student[] studenti;
    private static Predmet[] predmeti;
    public  static void DodajPredmet( Predmet novi) {
        Predmet[] Novi=new Predmet[0];

            Novi = new Predmet[predmeti.length + 1];
            for (int i = 0; i < studenti.length; i++) {
                Novi[i] = predmeti[i];
            }
            Novi[predmeti.length] = novi;

        predmeti=Novi;
    }
    public static void KreirajPredmet (String Ime, int sifra){
        Predmet NoviPredmet= new Predmet(Ime,sifra);
    }
    public static Student KreirajStudenta(String ImeStudenta, String PrezimeStudenta, int IndeksStudenta){
        Student NoviStudent=new Student(ImeStudenta,PrezimeStudenta,IndeksStudenta);
        return NoviStudent;
    }
    public static void UpisStudenta(String ImeStudenta,String PrezimeStudenta,int IndeksStudenta,String Naziv){
        Student student=KreirajStudenta(ImeStudenta,PrezimeStudenta,IndeksStudenta);
        Predmet upisiStudenta=new Predmet(Naziv, student);
    }
    public static void ListaStudenata (){
        for(int i=0;i<studenti.length;i++ ){
            System.out.println((i+1)+". "+studenti[i].getPrezime()+" "+studenti[i].getIme()+" ("+studenti[i].getIndeks()+")");
        }
    }
    public static void ListaPredmeta(){
        for (int i=0;i<predmeti.length;i++){
            System.out.println((i+1)+". "+predmeti[i].getNazivPredmeta()+" "+ predmeti[i].getSifraPredmeta());
        }
    }
   /* public void IzbrisiStudenta(Student brisi){
        for (int i = 0; i < studenti.length; i++) {
            if(studenti[i].getIme()==brisi.getIme()) studenti[i]=null;
        }

        for(int i = 0; i< studenti.length;i++) {
            if (studenti[i] != null) i++;  //preskaci dok je vrijednosg razlicita od null
            if (studenti[i]== null && i<=studenti.length-1){
                studenti[i]=studenti[i+1];
            }
        }
        Student[] x=new Student[studenti.length-1];

        studenti=novi;
    }*/
   public  static void removeElementStudent( Student element) {
       int rednibroj = -1;
       for (int i = 0; i < studenti.length; i++) {
           if (studenti[i].getIme() == element.getIme()) rednibroj = i;
       }
       if (rednibroj != -1) {
           Student[] n = new Student[studenti.length - 1];
           System.arraycopy(studenti, 0, n, 0, rednibroj);
           System.arraycopy(studenti, (rednibroj + 1), n, rednibroj, studenti.length - rednibroj - 1);
           studenti=n;
       } else System.out.println("Ovaj element se ne nalazi u nizu studenata!");
   }
    public  static void removeElementPredmet( Predmet element){
        int rednibroj = -1;
        for (int i = 0; i < predmeti.length; i++) {
            if (predmeti[i].getNazivPredmeta() == element.getNazivPredmeta()) rednibroj = i;
        }
        if (rednibroj != -1) {
            Predmet[] n = new Predmet[predmeti.length - 1];
            System.arraycopy(predmeti, 0, n, 0, rednibroj);
            System.arraycopy(predmeti, (rednibroj + 1), n, rednibroj, predmeti.length - rednibroj - 1);
        } else System.out.println("Ovaj element se ne nalazi u nizu studenata!");
    }
    public static void UnosStudenata(){
       System.out.println("Unesite zeljeni broj studenata: ");
       int n=ulaz.nextInt();
       ulaz.nextLine();
       studenti=new Student[n];
       //int in=0;
       for(int i=0;i<n;i++){
           System.out.println("Unesite ime, prezime i indeks studenta: ");
           String im=ulaz.nextLine();
           String prez=ulaz.nextLine();
           int in = ulaz.nextInt();
           ulaz.nextLine();
           studenti[i]=new Student(im,prez,in);
       }
    }
    public static void UnosPredmeta() {
        System.out.println("Unesite zeljeni broj predmeta: ");
        int n = ulaz.nextInt();
        ulaz.nextLine();
        predmeti = new Predmet[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite ime predmeta i sifru: ");
            String imePredmeta = ulaz.nextLine();
            int sifra = ulaz.nextInt();
            ulaz.nextLine();
            predmeti[i] = new Predmet(imePredmeta, sifra);
        }
    }
    public static void main(String[] args) {
     UnosStudenata();
     ListaStudenata();
     UnosPredmeta();
     ListaPredmeta();

     // Student s=new Student;*/

   //   Student s1= new Student("Lamija", "Fazlija", 17617);
/*      System.out.println(studenti[1]);*/
      removeElementStudent(studenti[1]);
      ListaStudenata();
        //  Student s2= new Student ("Pero", "Peric", 222);


        // write your code here
    }

}

