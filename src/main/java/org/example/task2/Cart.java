package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(Item[] contents) {
        this.contents = contents;
        this.index = 0;
    }

    public void add(Item item) {
        if (this.isFull())
            throw new IllegalStateException("The cart is full");

        this.contents[this.index] = item;
        this.index++;
    }

    public void removeById(long id) {
        if (this.isEmpty()) {
            return;
        }

        int foundItemIndex = this.findItemInArray(id);

        if (foundItemIndex == -1)
            return;

        this.shiftArray(foundItemIndex);
    }

    public void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index - 1] = null;
        this.index--;
    }

    public int findItemInArray(long id) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return this.index == this.contents.length;
    }

    public boolean isEmpty() {
        return this.index == 0;
    }

    public int getCurrentSize() {
        return this.index;
    }

    public Item getItemAt(int index) {
        return this.contents[index];
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}
