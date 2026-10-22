import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

public class StudentBeanIntrospector {
    public static class StudentBean {
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
    }

    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(StudentBean.class);

        System.out.println("Properties:");
        for (PropertyDescriptor p : info.getPropertyDescriptors()) {
            System.out.println("- " + p.getName());
        }

        System.out.println("\nMethods:");
        for (MethodDescriptor m : info.getMethodDescriptors()) {
            System.out.println("- " + m.getMethod().getName());
        }
    }
}
