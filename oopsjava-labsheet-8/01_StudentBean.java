import java.beans.*;

public class StudentBean {
    private int id;
    private String name;
    private double grade;

    public StudentBean() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGrade() { return grade; }
    public void setGrade(double grade) { this.grade = grade; }

    public static void main(String[] args) {
        StudentBean s = new StudentBean();
        s.setId(101);
        s.setName("Rahul");
        s.setGrade(88.5);

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Grade: " + s.getGrade());
    }
}
