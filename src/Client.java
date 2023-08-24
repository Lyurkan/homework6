import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private int age;
    private List<Account> accounts = new ArrayList<>();

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
