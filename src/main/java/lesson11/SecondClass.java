package lesson11;

import java.util.Objects;
import java.util.Scanner;

public class SecondClass {

    public void test() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ededleri daxil edin ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Please select which calculation: + - * /");
        scanner.nextLine();
        String c = scanner.nextLine();
        System.out.println("test"+c);

        if (Objects.equals(c, "-")) {
            System.out.println(c);
            System.out.println(a - b);
        } else if (Objects.equals(c, "+")) {
            System.out.println(a + b);
        } else if (Objects.equals(c, "/")) {
            System.out.println(a / b);
        } else if (Objects.equals(c, "*")) {
            System.out.println(a * b);
        }

    }
}

