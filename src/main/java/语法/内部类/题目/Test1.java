package 语法.内部类.题目;

public class Test1 {

    public static void main(String[] args) {
        // 1题：初始化Bean1
        Bean1 bean1 = new Test1().new Bean1();
        bean1.I++;
        // 2题：初始化Bean2
        Bean2 bean2 = new Test1.Bean2();
        bean2.J++;
        // 3题：初始化Bean3
        Bean.Bean3 bean3=new Bean().new Bean3();
        bean3.k++;
    }


    class Bean1 {
        public int I = 0;
    }

    static class Bean2 {
        public int J = 0;
    }
}

class Bean {
    class Bean3 {
        public int k = 0;
    }
}