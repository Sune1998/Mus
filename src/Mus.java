import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Mus {
    public int max = 120;
    public int min = 60;
    public int numofnuts;
    private int valgtNut;

    public void gennuts() {
        numofnuts = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(numofnuts + "peppernødder generet");
    }
    public int valgtnut(){
        valgtNut = ThreadLocalRandom.current().nextInt(numofnuts-1+1);
        System.out.println("den valgte nød er" + valgtNut);
        return valgtNut;
    }

}
