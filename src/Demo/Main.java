package Demo;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("det virker");
        System.out.println("hej B");
        new Main().askAboutAge();
    }
    int askAboutAge(){
        Scanner in = new Scanner(System.in);
        int alder;

        System.out.println("How old are you?");
        alder = in.nextInt();
        return alder;

    }
}
