package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printMessage("Hello World!", 3);
        printMessage("Hello sdfasdWorld!", 5);
        printMessage("Hello W1orld!", 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
