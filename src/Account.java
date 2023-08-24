public class Account {
    private int id;
    private Client owner;
    private int money;

    public Account(int id, Client owner, int money) {
        this.id = id;
        this.owner = owner;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public Client getOwner() {
        return owner;
    }

    public int getMoney() {
        return money;
    }
}
