package alex.zhurylo.model.implementation;


import alex.zhurylo.model.Constructable;

public class Circle implements Constructable {

    private double dimensionCircle;
    private final static double PI = 3.1415926536;

    @Override
    public double areaShape() {
        return PI * (dimensionCircle * dimensionCircle);
    }

    @Override
    public double perimetrShape() {
        return (2 * PI) * dimensionCircle;
    }

    @Override
    public void paintingShape() {
        System.out.println("You painting my circle ");
    }
}