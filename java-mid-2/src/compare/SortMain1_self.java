package compare;

import java.util.Arrays;

public class SortMain1_self {

    public static void main(String[] args) {
        MyUser2 myUser1 = new MyUser2("a", 10);
        MyUser2 myUser2 = new MyUser2("b", 20);
        MyUser2 myUser3 = new MyUser2("c", 30);

        MyUser2[] array = {myUser1, myUser2, myUser3};
        for (MyUser2 user2 : array) {
            System.out.println(user2);
        }
//        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
