public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Вася", 32);
        Account account1 = new Account(11, client1, 5000);
        Account account2 = new Account(373, client1, 3000);
        Account account3 = new Account(567, client1, 7000);
        client1.getAccounts().add(account1);
        client1.getAccounts().add(account2);
        client1.getAccounts().add(account3);

        Client client2 = new Client("Аня", 34);
        Account account4 = new Account(1456, client2, 8000);
        Account account5 = new Account(63, client2, 9000);
        Account account6 = new Account(555, client2, 2000);
        client2.getAccounts().add(account4);
        client2.getAccounts().add(account5);
        client2.getAccounts().add(account6);

        printClientNameByAccount(account2);
        printAccountIdByClient(client1);

        printClientNameByAccount(account4);
        printAccountIdByClient(client2);
    }

    private static void printClientNameByAccount(Account account) {
        System.out.println(Bank.findClient(account).getName());
    }

    private static void printAccountIdByClient(Client client) {
        for (Account account : Bank.getAccounts(client)) {
            System.out.println(account.getId());
        }
    }
}
