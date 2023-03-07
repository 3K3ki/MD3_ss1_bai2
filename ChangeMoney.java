import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23645;
        double usd ;
        System.out.println("put usd ");
        usd = scanner.nextDouble();

        double vnd = usd * rate;
        System.out.println("vnd: "+vnd);
    }
}
