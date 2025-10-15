package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be less than or equal 0");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be less than or equal 0");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be less than or equal 0");
        }

        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        this.length = length;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    public double getSurfaceArea() {
        return 2 * length * width + 2 * length * height + 2 * width * height;
    }

    public double getVolume() {
        return length * width * height;
    }
}
