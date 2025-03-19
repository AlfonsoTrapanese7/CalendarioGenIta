import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Calendario calendario1 = new Calendario();

        Scanner reader = new Scanner(System.in);
        System.out.println("Inserisci Il mese");
        String m = reader.nextLine();
        System.out.println("Inserisci il giorno");
        int g = reader.nextInt();

        calendario1.giorno = g;
        calendario1.mese = m;
        calendario1.controlloMeseGiorno();
        reader.close();


        
    }
}
