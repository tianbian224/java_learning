package 语法.内部类.成员内部类;

public class Outer {
    private String name="lvcang";
    public int age=12;

    // 成员内部类和其他成员变量在同一个层次，拥有各种访问权限,随意访问外部成员变量
    protected class InnerAA{
        public int salary=10;
        private boolean sex=true;
        public String name="qunar";// 和外部类同名变量

        //内部类可以随便访问外部类的变量
        public void getValue()
        {
            System.out.println(name+","+age);
            System.out.println(this.name+","+Outer.this.name);
        }
    }
}
