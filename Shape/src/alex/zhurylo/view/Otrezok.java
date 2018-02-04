package alex.zhurylo.view;

public class Otrezok {
    private double x;
    private double x1;
    private double y;
    private double y1;

    public Otrezok(double x, double x1, double y, double y1) {
        this.x = x;
        this.x1 = x1;
        this.y = y;
        this.y1 = y1;
    }

    public double lang() {
        return Math.sqrt(((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)));
    }
}
