package 语法.多态.多态之继承.继承构造函数;//  Lvcang created at  2018-02-01 10:10,have fun~


// 构造函数只能使用this、supper中的一种，且放在第一行
public class User
{
    public int id;
    public String name;

    // 构造函数
    public User(int id, String name)
    {
        this(id);
        this.name = name;
    }

    public User(int id)
    {
        this.id = id;
    }


    // 父类方法
    public void chi()
    {
        System.out.println("父类方法chi");
    }

    public void work()
    {
        System.out.println("父类方法work");
    }
}

// 构造函数只能使用this、supper中的一种，且放在第一行
class VipUser extends User
{
    public int level;

    public VipUser(int level)
    {
        super(10, "会员");
        this.level = level;
    }


    public VipUser(int id, String name, int level)
    {
        this(level);
    }

    // 重写父类方法
    @Override
    public void work()
    {
        System.out.println("子类方法work");
    }
}