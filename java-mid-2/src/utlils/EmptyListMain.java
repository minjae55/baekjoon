package utlils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
       //빈 가변 리스트
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트
        List<Integer> list3 = Collections.emptyList();
        List<Integer> list4 = List.of();

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);
        arrList.set(0, 100);

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);
    }
}
