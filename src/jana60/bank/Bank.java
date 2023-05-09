package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int accountNumber = rnd.nextInt(1001);
        String account_number_as_string = Integer.toString(accountNumber);

        System.out.println("Insert your name: ");
        String name = sc.nextLine();
        Conto account = new Conto(account_number_as_string, name);

        System.out.println("Name: " + name);
        System.out.println("Numero conto: " + rnd.nextInt(1001));

        // Options
        int option = 0;
        while (option != 3) {
            System.out.println("Scegli un opzione:" 
                    + "\n 1) Versa"
                    + "\n 2) Preleva"
                    + "\n 3) Esci");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Inserisci la somma da versare: ");
                    float amountAdded = sc.nextFloat();
                    if (amountAdded > 0) {
                        account.addMoney(amountAdded);
                        System.out.println("Il tuo nuovo saldo è: " + account.getAmount() + " euro");
                        System.out.println("----------------------");
                    } else {
                        System.out.println("Inserire una cifra corretta");
                        System.out.println("----------------------");
                    }
                    break;
                case 2:
                    if (account.getAmount() > 0) {
                        System.out.println("Inserisci la somma da prelevare: ");
                        float withdraw = sc.nextFloat();
                        if (withdraw > 0 && withdraw <= account.getAmount()) {
                            account.withdraw(withdraw);
                            System.out.println("Il nuovo saldo è: " + account.getAmount() + " euro");
                            System.out.println("----------------------");
                        } else {
                            System.out.println("Saldo insufficiente per completare l'operazione");
                            System.out.println("----------------------");
                        }
                    } else {
                    	System.out.println("Il tuo saldo è 0 euro");
                    	System.out.println("----------------------");
                    }
                    break;
                case 3:
                    break;
            }
        }
        sc.close();
    }
}
