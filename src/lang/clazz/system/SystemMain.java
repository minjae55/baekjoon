package lang.clazz.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간 나노초
        long currentNaNoTime = System.nanoTime();
        System.out.println("currentNaNoTime = " + currentNaNoTime);

        //환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("properties =" + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] coipedArray = new char[5];
        System.arraycopy(originalArray,0,coipedArray,0,originalArray.length);

        //배열 출력
        System.out.println("coipedArray = " + coipedArray);
        System.out.println("Array.toString = " + Arrays.toString(coipedArray));

        //프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
