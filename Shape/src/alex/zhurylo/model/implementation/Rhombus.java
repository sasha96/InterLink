package alex.zhurylo.model.implementation;

import alex.zhurylo.view.Point;
import alex.zhurylo.model.Shape;
import javafx.scene.paint.Color;

public class Rhombus extends Shape {

    public Rhombus(Point[] points) {
        super(points,4);
    }

    @Override
    public void paintingShape() {
        System.out.println("This is Rhombus");
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
