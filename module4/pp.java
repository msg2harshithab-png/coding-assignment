class Student {
    int id;
    String name;
    static String college = "ABC College";

    static void changeCollege() {
        college = "XYZ College";
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Student.changeCollege();

        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Ram";

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Shyam";

        s1.display();
        s2.display();
    }
}