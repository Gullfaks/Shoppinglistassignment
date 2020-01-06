//Det er en feil i programmet som jeg kjenner til, og det er hvis input er feil datatype.
//Har desverre ikke hatt tid til å feilsøke denne feilen

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //String falseInput = "";
        //int correctInput = 0;

        System.out.println("Hi and welcome to the fruit salad shopping list generator!\n");
        int fruitsAmount;

        System.out.print("Before we get started, \nlet me know how many types of fruits you want to use: \n");
        fruitsAmount = scanner.nextInt();

        String[] array = new String[fruitsAmount];

        double[] arrayPrice = new double[fruitsAmount];

        System.out.println("\nGreat! You have chosen to use " + fruitsAmount + " types of fruit. Lets continue by adding some fruits:\n");
        for (int i = 0; i < fruitsAmount; i++) {
            System.out.println("Enter type of fruit: ");
            array[i] = scanner.next();
            System.out.println(array[i] + " price per kilo: ");
            arrayPrice[i] = scanner.nextDouble();
        }

        System.out.println("\nAwesome! Please select from the following options to continue");

        int option;

            do {
                System.out.println();
                System.out.println("1 - Display fruits with prices");
                System.out.println("2 - Show most expensive fruit");
                System.out.println("3 - Show least expensive fruit");
                System.out.println("4 - Exit\n");
                System.out.print("Option: ");
                option = scanner.nextInt();
                System.out.println();

                if (option == 1) {
                    for (int i = 0; i < fruitsAmount; i++) {
                        System.out.format("%s - Price: %.2f Kr\n", array[i], arrayPrice[i]);
                    }

                } else if (option == 2) {
                    String highestName = "";
                    double highestPrice = 0;

                    for (int i = 0; i < fruitsAmount; i++) {
                        if (arrayPrice[i] > highestPrice) {
                            highestName = array[i];
                            highestPrice = arrayPrice[i];
                        }
                    }
                    System.out.format("%s has the highest price which is %.2f Kr\n", highestName, highestPrice);
                } else if (option == 3) {
                    String lowestName = "";
                    double lowestPrice = Double.MAX_VALUE;

                    for (int i = 0; i < fruitsAmount; i++) {
                        if (arrayPrice[i] < lowestPrice) {
                            lowestName = array[i];
                            lowestPrice = arrayPrice[i];
                        }
                    }
                    System.out.format("%s has the lowest price which is %.2f Kr\n", lowestName, lowestPrice);

                } else if (option == 4) {
                    System.out.println("Exiting...");
                    break;

                } else if (option != 1 || option != 2 || option != 3 || option != 4) {
                    System.out.println("Please choose a number between 1 and 4");
                }
            }while (true);

                    System.out.print("Good luck with shopping and cooking, \nlet me now if you would like some recipes by sending and email to alxhansen@gmail.com");


    }
}
