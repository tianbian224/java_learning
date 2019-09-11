package 语法.内部类.静态内部类;

public class Outer {
    public String name = "lvcnag";
    public static int age = 32;

    static public class Inner {
        public int salary = 444;
        public static String name = "quar";

        public void getValue() {
            System.out.println(Outer.age); //只能访问外部类的静态变量
        }

    }
}
