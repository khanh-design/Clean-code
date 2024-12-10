package cylinder;

public class Cylinder {
    private int radius;
    private int height;

    public Cylinder() {}
    public Cylinder(int radius, int height) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius, height);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius, int height) {
        double perimeter = 2 * Math.PI * radius * height;
        return perimeter;
    }

    private static double getBaseArea(int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
}
