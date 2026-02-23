package lang.wrapper;

public class MyIntgerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));

    }

    private static int findValue(int[] intARr, int target) {
        for (int value : intARr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}