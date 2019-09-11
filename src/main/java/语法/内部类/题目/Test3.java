package 语法.内部类.题目;

public class Test3 extends Animal {

    class Man extends People {

    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Man man = test3.new Man();
        test3.getName();
        man.getAge();


    }
}

class People {
    public int age = 12;
    public String name = "qunar";

    public void getAge() {
        System.out.println(age);
    }

}

class Animal {
    public void getName() {
        System.out.println("animal");
    }
}
