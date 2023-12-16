public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        System.out.println("Circle Information:");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, "Blue", 10.0);
        System.out.println("\nCylinder Information:");
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
