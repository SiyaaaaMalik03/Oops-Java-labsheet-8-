public class RectangleBean {
    private double length;
    private double width;

    public RectangleBean() {}

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        RectangleBean r = new RectangleBean();
        r.setLength(10);
        r.setWidth(5);

        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
