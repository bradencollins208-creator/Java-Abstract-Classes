package org.example;

import org.example.shapes.twodim.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Circle c1 = new Circle(5.1);

        System.out.println(c1.getRadius());
        System.out.println(c1.toString());
    }
}
