public class Account {
    private int id;
    private int money;

    public Account(int id, int money) {
        this.id = id;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (id != account.id) return false;
        return money == account.money;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + money;
        return result;
    }
}
