package alex.zhurylo.view;

import alex.zhurylo.model.Paintable;
import alex.zhurylo.model.implementation.Square;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Visual extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Paintable shape Test");
        Group root = new Group();
        Canvas canvas = new Canvas(450, 350);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        testShape(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void testShape(GraphicsContext gc) {
        Point p1 = new Point(50, 50);
        Point p4 = new Point(50, 100);
        Point p3 = new Point(100, 100);
        Point p2 = new Point(100, 50);

        Paintable square = new Square(new Point[]{p1, p2, p3, p4});

        drawShape(gc, square);
    }

    private void drawShape(GraphicsContext gc, Paintable shape) {
        Point[] points = shape.getPoints();
        double[] xCoords = new double[points.length];
        double[] yCoords = new double[points.length];
        int i = 0;
        for (Point point : points) {
            xCoords[i] = point.getX();
            yCoords[i] = point.getY();
            i++;
        }

        gc.setFill(shape.getColor());
        gc.fillPolygon(xCoords, yCoords, points.length);
    }
}
