package lang.clazz.test;

public class WrapperTest2 {
    public static void main(String[] args) {

        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0;
        for (String s : array) {
            double d = Double.parseDouble(s);
            sum += d;
        }
        System.out.println(sum);

        //        for(int i = 0; i < d.length; i++) {
//            d[i] = Double.parseDouble(array[i]);
//            sum += d[i];
//        }

    }
}
