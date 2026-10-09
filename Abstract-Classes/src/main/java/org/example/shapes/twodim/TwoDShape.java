package org.example.shapes.twodim;

public abstract class TwoDShape implements ITwoDimShape {
    protected final ShapeType shapeType;

    protected TwoDShape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public ShapeType getShapeType() {
        return this.shapeType;
    }
}
