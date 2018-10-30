package 语法.反射;//  Lvcang created at  2017-11-09 16:12


public class Person
{
    // ====================================================================����4����Ա����
    public int age;
    public String name;
    public char gender;
    private boolean married;
    private String habbit;
    private String movies;

    // ===================================================================����4�����캯��
    public Person()
    {

    }

    public Person(int age, String name, boolean married, char gender)
    {
        super();
        this.age = age;
        this.name = name;
        this.married = married;
        this.gender = gender;
    }

    public Person(int age, String name)
    {
        super();
        this.age = age;
        this.name = name;
    }

    public Person(String name, boolean married)
    {
        super();
        this.name = name;
        this.married = married;
    }

    public Person(int age, char gender)
    {
        super();
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, String habbit, String movies)
    {
        super();
        this.name = name;
        this.habbit = habbit;
        this.movies = movies;
    }

    public static void Say(String aa)
    {
        System.out.println("��̬������ʹ��");
    }

    // ===================================================================main����
    public static void main(String[] ads)
    {
        for (String s : ads)
        {
            System.out.println("mian����" + s);
        }
    }

    // =====================================================================����4������
    // 3������
    public void Eat(String food)
    {
        System.out.println("��" + food);
    }

    public void Eat(String food, int num)
    {
        System.out.println("��" + food);
    }

    private void Eat(String food, String tool)
    {
        System.out.println("��" + food);
    }

    // 3������
    public void Drink(String food)
    {
        System.out.println("��" + food);
    }

    public void Drink(String food, int num)
    {
        System.out.println("��" + food);
    }

    public void Drink(String food, boolean ff)
    {
        System.out.println("��" + food);
    }

    public void Sleep(String food)
    {
        System.out.println("˯" + food);
    }
    // ====================================================================4������

    public void Play(String food)
    {
        System.out.println("��" + food);
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isMarried()
    {
        return married;
    }

    public void setMarried(boolean married)
    {
        this.married = married;
    }

    public char getGender()
    {
        return gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        return name + "====" + habbit + "====" + movies;
    }
}
