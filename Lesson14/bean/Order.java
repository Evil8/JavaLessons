package bean;

import java.time.LocalDate;

public class Order {
    private int id;
    private LocalDate goodTakenDate;
    private LocalDate goodReturnDate;
    private double totalToPay;
    private int totalGoodTaken;
    private boolean paid;
    private boolean closed;
    private boolean active;
    private int customerId;
    private int sportGoodId;

    public Order() {
    }

    public void setTotalToPay(double totalToPay) {
        this.totalToPay = totalToPay;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSportGoodId() {
        return sportGoodId;
    }

    public void setSportGoodId(int sportGoodId) {
        this.sportGoodId = sportGoodId;
    }

    public LocalDate getGoodTakenDate() {
        return goodTakenDate;
    }

    public void setGoodTakenDate(LocalDate goodTakenDate) {
        this.goodTakenDate = goodTakenDate;
    }

    public LocalDate getGoodReturnDate() {
        return goodReturnDate;
    }

    public void setGoodReturnDate(LocalDate goodReturnDate) {
        this.goodReturnDate = goodReturnDate;
    }

    public Double getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(Double totalToPay) {
        this.totalToPay = totalToPay;
    }

    public int getTotalGoodTaken() {
        return totalGoodTaken;
    }

    public void setTotalGoodTaken(int totalGoodTaken) {
        this.totalGoodTaken = totalGoodTaken;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id == order.id
                && totalGoodTaken == order.totalGoodTaken
                && Double.compare(totalToPay, order.totalToPay) == 0
                && (goodReturnDate != null ? goodReturnDate.equals(order.goodReturnDate) : order.goodReturnDate == null)
                && (goodTakenDate != null ? goodTakenDate.equals(order.goodTakenDate) : order.goodTakenDate == null)
                && paid == order.paid
                && closed == order.closed
                && customerId == order.customerId
                && sportGoodId == order.sportGoodId;

    }


    @Override
    public int hashCode() {
        int result;
        result = id
                + totalGoodTaken
                + (int) ((Double.doubleToLongBits(totalToPay) ^ (Double.doubleToLongBits(totalToPay)) >>> 32));
        result = 107 * result + goodTakenDate.hashCode()
                + goodTakenDate.hashCode()
                + goodReturnDate.hashCode()
                + sportGoodId
                + customerId;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", goodTakenDate=").append(goodTakenDate);
        sb.append(", goodReturnDate=").append(goodReturnDate);
        sb.append(", totalToPay=").append(totalToPay);
        sb.append(", totalGoodTaken=").append(totalGoodTaken);
        sb.append(", paid=").append(paid);
        sb.append(", closed=").append(closed);
        sb.append(", customer=").append(customerId);
        sb.append(", sportGood=").append(sportGoodId);
        sb.append('}');
        return sb.toString();
    }
}
