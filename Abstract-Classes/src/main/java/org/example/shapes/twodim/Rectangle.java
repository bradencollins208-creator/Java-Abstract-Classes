package org.example.shapes.twodim;

public class Rectangle extends TwoDShape {
    final protected double width;
    final protected double height;

    public Rectangle(double width, double height) {
        super((width == height) ? ShapeType.SQUARE : ShapeType.RECANGLE);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return getArea(this.width, this.height);
    }

    public static double getArea(double width, double height) {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangle Details:\n")
                .append("\tWidth: ").append(this.width).append("\n")
                .append("\theight: ").append(this.height).append("\n");
        return sb.toString();
    }
}
