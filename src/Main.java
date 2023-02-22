import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int ci = 1;
    public static int cp = 1;
    public static int c1 = 1;
    public static int c2 = 1;


    public static void main(String[] args) {

        ArrayList<Student> listaSvi = new ArrayList<>();
        ArrayList<Student> listaPolozili = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println ("Unesite podatke za min 4 sudenta!");
        while (true) {
            System.out.print("Unesite ime " + ci++ + ". studenta (unesite quit da izadjete iz programa): ");
            String ime = scan.next();
            if (ime.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.print("Unesite prezime " + cp++ + ". studenta: ");
            String prezime = scan.next();

            System.out.print("Unesite ocenu 5, 6, 7 ili 9: ");
            int ocena = scan.nextInt();
            if (ocena != 5 && ocena != 6 && ocena != 7 && ocena != 9) {
                System.out.println("Niste uneli dobro ocenu, pokrenite program ispocetka!");
                return;
            }

            Student o = new Student(ime, prezime, ocena);

            listaSvi.add(o);

            if (ocena != 5) {
                listaPolozili.add(o);
            }
        }
        System.out.println("Lista svih sudenata:");
        for (Student l : listaSvi) {
            System.out.println("Podaci za " + c1 + ". studenta -> " + "Ime: " + l.ime + ", Prezime: " + l.prezime
                    + ", " + "Ocena: " + l.ocena);
            c1++;
        }

        System.out.println("Lista sudenata koji su polozili:");
        for (Student p : listaPolozili) {
            System.out.println("Podaci za " + c2 + ". studenta -> " + "Ime: " + p.ime + ", Prezime: " + p.prezime
                    + ", " + "Ocena: " + p.ocena);
            c2++;

        }

    }
}





















