package 语法.基础语法.枚举;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;

/**
 * @author cang.lv
 * @date 2019/11/12 0012 20:37
 */
public enum Color {

    /**
     * 每一个枚举值就是一个实例，相当于执行了
     * <p>
     * new Enum<Color>("红色", 1);
     */
    RED(1, "红色") {
        @Override
        public void absfunction() {
            System.out.println("可以添加抽象方法");
        }
    };


    /**
     * 实例变量
     */
    int code;
    String text;

    private static final Map<Integer, Color> ENUM_MAP = Maps.uniqueIndex(Arrays.asList(values()), Color::getCode);

    /**
     * 可以添加构造函数
     */
    Color(int code, String text) {
        this.code = code;
        this.text = text;
    }

    /**
     * 可以添加普通函数
     */
    public String getText() {
        return null;
    }

    public int getCode() {
        return 0;
    }

    public Color codeOf(int code) {
        return ENUM_MAP.get(code);
    }

    public static void hello() {
        System.out.println("可以添加静态函数");
    }

    public abstract void absfunction();
}
