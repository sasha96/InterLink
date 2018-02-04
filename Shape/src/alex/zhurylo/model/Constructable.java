package alex.zhurylo.model;

import javafx.scene.paint.Color;

public interface Constructable {
    /**
     * Get area for filling the shape
     *
     * @return area which will be applied for current shape
     */
    double areaShape();

    /**
     * Get perimetr for filling the shape
     *
     * @return perimetr which will be applied for current shape
     */
    double perimetrShape();

    /**
     * Get String for filling the shape
     *
     * @return String which will be applied for current shape
     */
    void paintingShape();



    default Color getColor() {
        return Color.CORAL;
    }
}
