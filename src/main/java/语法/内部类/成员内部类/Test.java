package 语法.内部类.成员内部类;

public class Test {
    @org.junit.Test
    public void test1() {
        Outer outer = new Outer();// 必须先有外部类，才能创建成员内部类
        Outer.InnerAA innerAA = outer.new InnerAA();
        innerAA.getValue();
    }
}
