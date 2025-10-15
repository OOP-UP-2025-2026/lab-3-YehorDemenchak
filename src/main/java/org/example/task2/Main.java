package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(12.35, 36.6, 20.7);
        System.out.println("Lateral surface area of the box: " + box.getLateralSurfaceArea());
        System.out.println("Surface area of the box: " + box.getSurfaceArea());
        System.out.println("Volume of the box: " + box.getVolume());
        System.out.println();

        Cart cart = new Cart(new Item[10]);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));
        System.out.println(cart);
        cart.removeById(9);
        System.out.println(cart);
        System.out.println();

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill + "\n");

        IntStack stack = new IntStack();
        stack.push(23);
        stack.push(-1);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack.peek());
        stack.clear();
    }
}