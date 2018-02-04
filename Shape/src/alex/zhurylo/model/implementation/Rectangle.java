package alex.zhurylo.model.implementation;

import alex.zhurylo.view.Point;
import alex.zhurylo.model.Shape;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {

    public Rectangle(Point[] points) {
        super(points, 4);
    }

    @Override
    public void paintingShape() {
        System.out.println("This is my rectangle");
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
