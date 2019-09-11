package 语法.内部类.局部内部类;

public class Test {
    /**
     * 局部内部类：顾名思义，和方法的局部变量是一个层次
     * 局部内部类和局部变量一样，不能使用修饰符修饰
     */
    public static void main(String[] args) {
        class Person{
            public String name="lvcang";
            private int age=23;

            public void getInfo(){
                System.out.println(name+","+age);
            }
        }
        Person  person = new Person();
        person.getInfo();
    }
}

