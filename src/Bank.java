import java.util.*;

public class Bank {

    private Map<Client, List<Account>> clientAccounts = new HashMap<>();

    public List<Account> getAccounts(Client client) {
        return clientAccounts.get(client);
    }

    public Client findClient(Account account) {
        return account.getOwner();
    }

    public void putClientAccounts(Client client, Account...accounts) {
        clientAccounts.putIfAbsent(client, new ArrayList<>());
        clientAccounts.get(client).addAll(Arrays.asList(accounts));
    }
}
