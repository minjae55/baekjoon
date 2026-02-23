package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newIntger = new Integer(10);    //미래에 삭제 예정, 대신 valueOf() 사용
        Integer intgerObj = Integer.valueOf(10);    //-128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);


        System.out.println("newIntger = " + newIntger);
        System.out.println("intgerObj = " + intgerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");

        int intValue = intgerObj.intValue();
        System.out.println("intValue = " + intValue);

        long longvalue = longObj.longValue();
        System.out.println("longvalue = " + longvalue);

        System.out.println("비교");
        System.out.println("== : " + (newIntger == intgerObj));
        System.out.println("equals : " + (newIntger.equals(intgerObj)));
    }
}
