import java.util.*;

public class Main extends Mus {
    public static void main(String[] args)  {
        System.out.println("Velcome to ***Mus***");

        Mus mus = new Mus();
        mus.gennuts();


        System.out.println("gæt et nummer");
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        mus.Usrguess();

    }
}
