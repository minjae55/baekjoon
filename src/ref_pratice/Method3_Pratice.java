package ref_pratice;

public class Method3_Pratice {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 16);
        printStudent(student1);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student) {
        System.out.println(student);
        System.out.println(student.name + " " + student.age + " " + student.grade);
    }
}
