import matematik.Dortislem;
import matematik.*; // '*' matdaki her şeyi import eder
import matematik.Logaritma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("adınız:");
        String name=scanner.nextLine();

        System.out.println("merhaba "+name);

        Dortislem dortislem=new Dortislem();
        int cevap=dortislem.topla(3,4);
        System.out.println(cevap);

        Logaritma logaritma=new Logaritma();

    }
}
