import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Client client1 = new Client("Вася", 32);
        Account account1 = new Account(1, 500);
        Account account2 = new Account(2, 300);
        Account account3 = new Account(3, 70);
        bank.putClientAccounts(client1, account1, account2, account3);

        Client client2 = new Client("Аня", 34);
        Account account4 = new Account(4, 777);
        Account account5 = new Account(5, 666);
        Account account6 = new Account(6, 233);
        bank.putClientAccounts(client2, account4, account5, account6);

        printClientNameByAccount(bank, account2);
        printAccountIdByClient(bank, client1);

        printClientNameByAccount(bank, account4);
        printAccountIdByClient(bank, client2);
    }

    private static void printClientNameByAccount(Bank bank, Account account) {
        System.out.println("Имя клиента: " + bank.findClient(account).getName());
    }

    private static void printAccountIdByClient(Bank bank, Client client) {
        for (Account account : bank.getAccounts(client)) {
            System.out.println("Владелец счёта: " + client.getName() + ". На счету: " + account.getMoney());
        }
    }
}
