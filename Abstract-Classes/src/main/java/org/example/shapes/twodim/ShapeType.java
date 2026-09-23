package org.example.shapes.twodim;

public enum ShapeType {
    RECANGLE("Rectangle","Four 90 degree angles and two pairs of equal length sides"),
    SQUARE("Square","Four 90 degree angles and all side lengths are equal"),
    CIRCLE("Circle","Round Object");
    private final String name;
    private final String description;
    ShapeType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
