import java.util.ArrayList;
import java.util.Scanner;

public class Number_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DecimalNumber, choice;
        // Binary Number base 2, Octal number base 8, Hexadecimal number base 16, Decimal number - base 10
        System.out.println("Enter a Decimal number");
        DecimalNumber =  sc.nextInt();
        System.out.println("Convert " + DecimalNumber+ " into : ");
        System.out.println(" 1. Binary number \n 2. Octacl number \n 3. Hexadecimal number");
        choice = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        switch (choice) {
            case 1 -> {
                System.out.println("Deciaml to Binary number");
                System.out.println();
//                System.out.println("Binary number has base 2 so divide decimal number by 2");
                while (DecimalNumber >0) {

                    list.add(DecimalNumber % 2);
                    DecimalNumber /= 2;
//                    System.out.println(DecimalNumber);

                }
//                System.out.println(list);
                for (int i = list.size()-1; i >= 0; i--) {

                    System.out.print(list.get(i) + " ");
                }
            }
            case 2 -> {
                System.out.println("Decimal to Ocatal number");
                while (DecimalNumber > 0) {
                    list.add(DecimalNumber % 8);
                    DecimalNumber /= 8;
                }
                for (int i = list.size()-1; i >= 0; i--) {

                    System.out.print(list.get(i) + " ");
                }
            }
            case 3 -> {
                System.out.println("Decimal to Hexadecimal number");
                while (DecimalNumber > 0) {
                    list.add(DecimalNumber % 16);
                    DecimalNumber /= 16;
                }
                for (int i = list.size()-1; i >= 0; i--) {

                    System.out.print(list.get(i) + " ");
                }
            }
            default -> System.out.println("Wrong Input");
        }
        sc.close();
    }
}
