package alex.zhurylo.model.implementation;

import alex.zhurylo.view.Point;
import alex.zhurylo.model.Shape;
import javafx.scene.paint.Color;

public class Hexagon extends Shape {

    public Hexagon(Point[] points) {
        super(points,6);
    }

    @Override
    public void paintingShape() {
        System.out.println("Hexagon");
    }

    @Override
    public Color getColor() {
        return Color.GOLD;
    }
}
