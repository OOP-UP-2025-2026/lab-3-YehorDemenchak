package org.example.task2;

public class Item {

    private long id;
    private String name;
    private double price;

    public Item(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + this.id +
                ", price=" + this.price +
                ", name='" + this.name + '\'' +
                '}' + "\n";
    }
}
