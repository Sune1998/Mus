import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Mus {
    public int max = 120;
    public int min = 60;
    public int numofnuts;
    private int valgtNut;
    public boolean nucount[];

    public int usrguess;

    //gen nuts
    public void gennuts() {
        numofnuts = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(numofnuts + "peppernødder generet");
        nucount = new boolean[numofnuts];
        Arrays.fill(nucount, true);
    }


    //choosenut
    private int valgtnut() {
        valgtNut = ThreadLocalRandom.current().nextInt(numofnuts - 1 + 1);
        System.out.println("den valgte nød er" + valgtNut);
        return valgtNut;
    }

    public void Usrguess() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            usrguess = scanner.nextInt();
            nucount[usrguess-1] =false;
            if (usrguess == valgtNut) {
                System.out.println("mus!");
                valgtnut();
                System.out.println("ny nød er valgt");
            } else {
                System.out.println("Haps");
            }
            boolean erAltspist = true;
            for (int i = 0; i < nucount.length; i++) {
                if (nucount[i] = true) {
                    erAltspist = false;

            }

            }
        }
    }
}
