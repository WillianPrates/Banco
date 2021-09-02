package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        Account account;

        System.out.println("Entre com o número da conta: ");
        int number = sc.nextInt();
        System.out.println("Entre com o nome do usuário: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Tem depósito inicial (y/n): ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.println("Entre o valor do deposito inicial: ");
            double initialDeposit =sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else{
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Informações da conta: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Entre com o valor de deposito: ");
        double depositValue = sc.nextDouble();
        account.depoisit(depositValue);
        System.out.println("Valor atualizado: ");
        System.out.println(account);

        



        sc.close();

    }

}
