package 语法.内部类.静态内部类;

public class Test {
    public static void main(String[] args) {
        // 静态内部类不依赖于外部类，，可以直接创建。
        Outer.Inner inner=new Outer.Inner();
        inner.getValue();
    }
}
