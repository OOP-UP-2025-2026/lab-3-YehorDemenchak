package org.example.task2;

public class Order {

    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public long getId() {
        return this.id;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {
        if (cart.isEmpty()) {
            return "Order number " + this.id + " for customer " + this.customer + "\nCart is empty!";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(this.id).append(" for customer ").append(this.customer);
        builder.append("\n------------------\n");

        double sum = 0.0;

        for (int i = 0; i < cart.getCurrentSize(); i++) {

            sum += cart.getItemAt(i).getPrice();

            builder.append("Item id: ");
            builder.append(cart.getItemAt(i).getId());
            builder.append(" name: ");
            builder.append(cart.getItemAt(i).getName());
            builder.append(" price: ");
            builder.append(cart.getItemAt(i).getPrice());
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);


        return builder.toString();
    }
}
