package ref_pratice;

public class Method2_Ref {

    public static void main(String[] args) {
      Student student1 = new Student();
      editStudent(student1, "학생1", 15, 1);

      Student student2 = new Student();
      editStudent(student2,"학생2", 25, 4);

      printStudent(student1);
      printStudent(student2);

    }

    static void editStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println(student.name + " " + student.age + " " + student.grade);
    }
}
