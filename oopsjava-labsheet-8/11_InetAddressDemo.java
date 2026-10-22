public class CircleBean {
    private double radius;

    public CircleBean() {}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Read-only calculated property
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Read-only calculated property
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        CircleBean c = new CircleBean();
        c.setRadius(7);

        System.out.printf("Radius: %.2f%n", c.getRadius());
        System.out.printf("Area: %.2f%n", c.getArea());
        System.out.printf("Circumference: %.2f%n", c.getCircumference());
    }
}
