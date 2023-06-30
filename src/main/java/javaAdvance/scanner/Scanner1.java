package javaAdvance.scanner;

import java.util.Scanner;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Scanner1 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.printf("Enter number\nr");
//        int i = scanner.nextInt();
//        System.out.printf("You enter: " + i);

//        System.out.printf("Enter two numbers\n");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.printf("x plus y = "+ (x + y));z

//        System.out.printf("Enter you phrase\n");
//        String s = scanner.nextLine();
//        String m = scanner.nextLine();
//        System.out.printf("you entered: " + s + " " + m);

        Scanner scanner = new Scanner("Hello valet\n Whats up \n boy");

//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
        System.out.println(scanner.next().charAt(2));
    }

}
