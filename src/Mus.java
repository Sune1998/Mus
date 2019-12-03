import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Mus {
    public int max = 120;
    public int min = 60;
    public int numofnuts;
    private int valgtNut;

    public int usrguess;

    //gen nuts
    public void gennuts() {
        numofnuts = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(numofnuts + "peppernødder generet");
    }
    //choosenut
    private int valgtnut(){
        valgtNut = ThreadLocalRandom.current().nextInt(numofnuts-1+1);
        System.out.println("den valgte nød er" + valgtNut);
        return valgtNut;
    }
    public void Usrguess() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        usrguess = scanner.nextInt();
        if (usrguess== valgtNut) {
            System.out.println("mus!");
            break;
        }

        else {
            System.out.println("Haps");
        }
    }
}
}
