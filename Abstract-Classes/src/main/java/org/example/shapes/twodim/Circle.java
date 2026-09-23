package org.example.shapes.twodim;

public class Circle extends TwoDShape {
    ShapeType shapeType;
    final private double radius;

    public Circle(double radius) {
        super(ShapeType.CIRCLE); //super should be first call
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circle Details:\n")
                .append("\tRadius: ").append(this.radius).append("\n");
        return sb.toString();
    }
}
