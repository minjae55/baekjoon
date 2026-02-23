package jan_0102;
/*
앞 2글자와 뒤 2글자는 그대로 출력
나머지는 *로 마스킹
길이가 4 미만이면 전부 *
 */
public class MaskingMain {
    public static void main(String[] args) {


        String password = "abac12345";
        String s1 = password.substring(0, 2);
        String s2 = password.substring(password.length()-2);

        int star = password.length() - 4;
        String s = isStar(star);


        System.out.println(s1 + s + s2);
    }
    private static String isStar(int integer) {

        return "*".repeat(integer);
    }
}
