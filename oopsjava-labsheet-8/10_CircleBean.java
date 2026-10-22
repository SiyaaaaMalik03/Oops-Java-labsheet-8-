public class CarBean {
    private String make;
    private String model;
    private int year;

    public CarBean() {}

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public static void main(String[] args) {
        CarBean car = new CarBean();

        car.setMake("Bajaj");
        car.setModel("Pulsar N250");
        car.setYear(2026);

        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
