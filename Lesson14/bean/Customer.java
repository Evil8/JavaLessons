package bean;

public class Customer {
    private int id;
    private String name;
    private String passportNum;
    private String address;
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Customer() {
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


    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return id == customer.id
                && (name != null ? name.equals(customer.name) : customer.name == null)
                && (address != null ? address.equals(customer.address) : customer.address == null)
                && (passportNum != null ? passportNum.equals(customer.passportNum) : customer.passportNum == null);

    }

    @Override
    public int hashCode() {
        int result;
        result = id;
        result = 107 * result + (name != null ? name.hashCode() : 0)
                + (address != null ? address.hashCode() : 0)
                + (passportNum != null ? passportNum.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", passportNum='").append(passportNum).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
