package genegic;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);
        Integer i = integerBox.get();
        System.out.println("i = " + i);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        String s = stringBox.get();
        System.out.println("stringBox = " + s);
        System.out.println("stringBox = " + stringBox);
    }
}
