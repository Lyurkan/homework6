
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

//У нас есть банк, в котором хранятся золотые монеты.
//У банка есть клиенты у которых есть имя и нам как банку важно знать их возраст для ограничений на операции.
//У одного клиента может быть несколько счетов на которых хранятся золотые монеты.
//Нужно реализовать следующую функциональность:
//
//Найти все счета по клиенту (например List getAccounts(Client client) )
//Найти клиента по счету (например Client findClient(Account account) )
//Поиск должен работать максимально быстро(!!!) с использованием стандартных коллекций Java.
//В классах Client и Account должно быть минимальное кол-во полей, достаточное для этой задачи.

    public static void main(String[] args) {

        Bank bank = new Bank();


        Client client1 = new Client("Вася", 32);
        Account account1 = new Account(client1, 500);
        Account account2 = new Account(client1, 300);
        Account account3 = new Account(client1, 70);
        bank.putClientAccounts(client1, account1, account2, account3);

        Client client2 = new Client("Аня", 34);
        Account account4 = new Account(client2, 777);
        Account account5 = new Account(client2, 666);
        Account account6 = new Account(client2, 233);
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
            System.out.println("Владелец счёта: " + account.getOwner().getName() + ". На счету: " + account.getMoney());
        }
    }
}
