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
    public  static void DodajPredmet() {
        System.out.println("Unesite ime predmeta i sifru: ");
        String ime=ulaz.nextLine();
        int sifra=ulaz.nextInt();
        //ulaz.nextLine();
        Predmet Novi=new Predmet(ime, sifra);
        Predmet[]  NoviNiz=new Predmet[predmeti.length+1];
        for (int i = 0; i < predmeti.length; i++) {
            NoviNiz[i] = predmeti[i];
        }
        NoviNiz[predmeti.length] = Novi;

        predmeti=NoviNiz;
    }
    public  static void DodajStudenta() {
        System.out.println("Unesite ime, prezime i indeks studenta: ");
        String ime=ulaz.nextLine();
        String prezime=ulaz.nextLine();
        int indeks=ulaz.nextInt();
        //ulaz.nextLine();
        Student Novi=new Student(ime, prezime, indeks);
        Student[]  NoviNiz=new Student[studenti.length+1];
        for (int i = 0; i < studenti.length; i++) {
            NoviNiz[i] = studenti[i];
        }
        NoviNiz[studenti.length] = Novi;
        studenti=NoviNiz;
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
        predmeti=new Predmet[0];
        for (int i=0;i<predmeti.length;i++){
            System.out.println((i+1)+". "+predmeti[i].getNazivPredmeta()+" "+ predmeti[i].getSifraPredmeta());
        }
    }

   public  static void removeElementStudent() {
       System.out.println("Unesite ime, prezime i indeks studenta kojeg zelite izbrisati: ");
       String ime=ulaz.nextLine();
       String prezime=ulaz.nextLine();
       int indeks=ulaz.nextInt();
       ulaz.nextLine();
       Student element=new Student(ime, prezime, indeks);
       int rednibroj = -1;
       for (int i = 0; i < studenti.length; i++) {
           if (studenti[i].getIme() == element.getIme() && studenti[i].getPrezime()==element.getPrezime()&& studenti[i].getIndeks()==element.getIndeks()) rednibroj = i;
       }
       if (rednibroj != -1) {
           Student[] n = new Student[studenti.length - 1];
           System.arraycopy(studenti, 0, n, 0, rednibroj);
           System.arraycopy(studenti, (rednibroj + 1), n, rednibroj, studenti.length - rednibroj - 1);
           studenti=n;
       } else System.out.println("Ovaj element se ne nalazi u nizu studenata!");
   }
    public  static void removeElementPredmet( ){
        System.out.println("Unesite ime predmeta i sifru kojeg zelite izbrisati: ");
        String ime=ulaz.nextLine();
        int sifra=ulaz.nextInt();
        ulaz.nextLine();

        Predmet element=new Predmet(ime, sifra);
        int rednibroj = -1;
        for (int i = 0; i < predmeti.length; i++) {
            if (predmeti[i].getNazivPredmeta() == element.getNazivPredmeta() && predmeti[i].getSifraPredmeta()==element.getSifraPredmeta()) rednibroj = i;
        }
        //System.out.println(rednibroj);
        if(rednibroj==0)predmeti=null;
        else if (rednibroj != -1) {
            Predmet[] n = new Predmet[predmeti.length - 1];
            System.arraycopy(predmeti, 0, n, 0, rednibroj);
            System.arraycopy(predmeti, (rednibroj + 1), n, rednibroj, predmeti.length - rednibroj - 1);
            predmeti=n;
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
    public static void UpisiStudenta() {
        System.out.println("Unesite sifru predmeta: ");
        int sifra = ulaz.nextInt();
        System.out.println("Unesite indeks studenta");
        int indeks = ulaz.nextInt();
        ulaz.nextLine();
        System.out.println("Unesite ime i prezime: ");
        String ime = ulaz.nextLine();
        String prezime = ulaz.nextLine();
        Student novi = new Student(ime, prezime, indeks);
        for (int i = 0; i < predmeti.length; i++) {
            if (sifra == predmeti[i].getSifraPredmeta()) {
                predmeti[i].upisi(novi);
                break;
            }
        }
    }
    public static void IspisiStudenta() {
        System.out.println("Unesite sifru predmeta: ");
        int sifra = ulaz.nextInt();
        System.out.println("Unesite indeks studenta");
        int indeks = ulaz.nextInt();
        ulaz.nextLine();
        System.out.println("Unesite ime i prezime: ");
        String ime = ulaz.nextLine();
        String prezime = ulaz.nextLine();
        Student novi = new Student(ime, prezime, indeks);
        for (int i = 0; i < predmeti.length; i++) {
            if (sifra == predmeti[i].getSifraPredmeta()) {
                predmeti[i].ispisi(novi);
                break;
            }
        }
    }



    public static void main(String[] args) {
    UnosStudenata();
    UnosPredmeta();
    boolean x=true;
    while(x==true){
           System.out.println("Odaberite jednu od iducih opcija:");
           System.out.println("0: Izlaz iz programa ");
           System.out.println("1: Dodavanje studenta, 2: Brisanje studenta, 3: Lista studenata");
           System.out.println("4: Dodavanje predmeta, 5: Brisanje predmeta, 6: Lista predmeta");
           System.out.println("7: Upis studenta, 8: Ispis studenta");
           int opcija=ulaz.nextInt();
           ulaz.nextLine();
           switch (opcija){
               case 0:
                   x=false;
                   break;
               case 1:
                   DodajStudenta();
                   break;
               case 2:
                   removeElementStudent();
                   break;
               case 3:
                   ListaStudenata();
                   break;
               case 4:
                   DodajPredmet();
                   break;
               case 5:
                   removeElementPredmet();
                   break;
               case 6:
                   ListaPredmeta();
                   break;
               case 7:
                   IspisiStudenta();
                   break;
               case 8:
                   UpisiStudenta();
           }
       }
    }
}
//kreiranje novog predmeta, novog studenta, upis studenta na predmet,
//ispis studenta sa predmeta, brisanje studenta, brisanje predmeta, te ispis spiska studenata na predmetu
