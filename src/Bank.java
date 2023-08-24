import java.util.*;

public class Bank {
    public static List<Account> getAccounts(Client client) {
        return client.getAccounts();
    }

    public static Client findClient(Account account) {
        return account.getOwner();
    }
}
