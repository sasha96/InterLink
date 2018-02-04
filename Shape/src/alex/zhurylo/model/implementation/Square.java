package alex.zhurylo.model.implementation;

import alex.zhurylo.view.Point;
import alex.zhurylo.model.Shape;

public class Square extends Shape {

    public Square(Point[] points) {
        super(points,4);
    }

    @Override
    public void paintingShape() {
        System.out.println("This is my square");
    }

}
