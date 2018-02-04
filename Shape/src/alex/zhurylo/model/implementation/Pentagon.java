package alex.zhurylo.model.implementation;

import alex.zhurylo.view.Point;
import alex.zhurylo.model.Shape;
import javafx.scene.paint.Color;

public class Pentagon extends Shape {

    public Pentagon(Point[] points) {
        super(points, 5);
    }
    @Override
    public void paintingShape(){
        System.out.println("You painting my pentagon");
    }
    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
