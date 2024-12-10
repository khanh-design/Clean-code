package cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        int radius = 5;
        int height = 10;

        double volume = Cylinder.getVolume(radius, height);

        System.out.println("Ban kinh: " + radius + ", " + height + ", " + volume);
    }
}
