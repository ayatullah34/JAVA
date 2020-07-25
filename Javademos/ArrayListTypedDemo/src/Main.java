import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> sehirler=new ArrayList<String>();

        sehirler.add("ankara");
        sehirler.add("istanbul");
        sehirler.add("izmir");
        sehirler.add("adana");

        sehirler.remove("istanbul");
        Collections.sort(sehirler);

        for(String sehir:sehirler){
            System.out.println(sehir);
        }
    }
}
