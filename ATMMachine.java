/**
 * Created by Omotayo on 11/05/2016.
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMMachine {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            ArrayList<Account> accounts = new ArrayList<>();
            accounts.add(new Account());
            accounts.add(new Account());
            accounts.add(new Account());
            accounts.add(new Account());
            accounts.add(new Account());
            accounts.add(new Account());
            accounts.add(new Account());
            accounts.add(new Account());
            accounts.add(new Account());
            accounts.add(new Account());

            System.out.print("Please enter your id: ");
            int AccIndex = input.nextInt();

            if (AccIndex >= accounts.size()) {
                System.out.println("Invalid id!");
                System.exit(1);
            }

            System.out.println("\nWelcome to MyBank");
            System.out.print("\nMain menu \n1: check balance \n2: withdraw" +
                    "\n3: deposit \n4: exit\nEnter a choice: ");
            int choice = input.nextInt();
            do {
                switch (choice) {
                    case 1: {
                        System.out.println("\nYour account balance is " +
                                accounts.get(AccIndex).getBalance());
                        break;
                    }
                    case 2: {
                        System.out.print("\nEnter an amount to withdraw: ");
                        double amount = input.nextDouble();
                        accounts.get(AccIndex).withdrawal(amount);
                        break;
                    }
                    case 3: {
                        System.out.print("\nEnter an amount to deposit: ");
                        double depositAmount = input.nextDouble();
                        accounts.get(AccIndex).deposit(depositAmount);
                        break;
                    }
                    case 4:
                        System.exit(2);

                    default:
                        System.out.println("\nInvalid option! Please try again.");
                        System.out.print("\nMain menu \n1: check balance \n2: withdraw" +
                                "\n3: deposit \n4: exit\nEnter a choice: ");
                        choice = input.nextInt();
                }
                System.out.print("\nWould you like to perform another transaction?" +
                        "\n1 for 'Yes' and  2 any other integer for 'No': ");
                int responce = input.nextInt();

                if (responce == 1) {
                    System.out.print("\nMain menu \n1: check balance \n2: withdraw" +
                            "\n3: deposit \n4: exit\nEnter a choice: ");
                    choice = input.nextInt();
                }
                else
                    System.exit(3);
            } while (choice != 4);

        }
}
