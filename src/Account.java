public class Account {
    private Client owner;
    private int money;

    public Account(Client owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public Client getOwner() {
        return owner;
    }

    public int getMoney() {
        return money;
    }
}
