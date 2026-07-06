public class Wrapper_classes {
    static void main() {
        int a = 10;

        Integer num = a; //auto boxing
        Integer num1 = Integer.valueOf(a);//boxing

        Integer value = 100;
        int val = value; //auto unboxing
        int val1 = Integer.valueOf(value);

        Integer obj = null;
        System.out.println(obj);

        Integer.min(10,20); //10
        Integer.max(10,20);//20

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.compare(200,30));

        String str ="12345";

        int res = Integer.parseInt(str);
        System.out.println(res/100);


    }
}
