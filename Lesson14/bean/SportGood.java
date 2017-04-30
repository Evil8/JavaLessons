package bean;

public class SportGood {
    private int id;
    private String name;
    private double price;
    private int amount;
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    public SportGood() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportGood sportGood = (SportGood) o;

        return id == sportGood.id
                && Double.compare(sportGood.price, price) == 0
                && amount == sportGood.amount
                && (name != null ? name.equals(sportGood.name) : sportGood.name == null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id + amount;
        result = 107 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 107 * result + (int) (temp ^ (temp >>> 32));

        return result;
    }

    @Override
    public String toString() {
        return '\n' + "SportGood{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                "}";
    }
}