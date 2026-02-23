package class1;

public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a); //1o
        System.out.println("b = " + b); //1o

        a = 20;
        System.out.println("a 20으로 변경 ");
        System.out.println("a = " + a); //20
        System.out.println("b = " + b); //10

        b = 30;
        System.out.println("b 30으로 변경 ");
        System.out.println("a = " + a); //20
        System.out.println("b = " + b); //30

    }
}
