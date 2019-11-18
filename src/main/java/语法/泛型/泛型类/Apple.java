package 语法.泛型.泛型类;

/**
 * @author cang.lv
 * @date 2019/11/18 0018 23:03
 */
public interface Apple<T> {


    public T getName();

    public Apple<T> setName(T name);
}

/**
 * 继承的Apple<String>制定了String,所以方法返回值也就确定了类型
 */
class Pear implements Apple<String> {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Apple<String> setName(String name) {
        return null;
    }
}
