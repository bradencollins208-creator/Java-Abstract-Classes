package org.example.shapes.twodim;

public class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public static double getArea(double sideLength) {
        return getArea(sideLength, sideLength);
    }

    public double getSideLength() {
        return width;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Square Details:\n")
                .append("\tSide Length: ").append(this.width).append("\n");
        return sb.toString();
    }

    public String getRectangleToString() {
        return super.toString();
    }
}
