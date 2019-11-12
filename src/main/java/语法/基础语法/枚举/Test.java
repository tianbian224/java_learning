package 语法.基础语法.枚举;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author cang.lv
 * @date 2019/11/12 0012 21:08
 */
public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);


    @org.junit.Test
    public void test() {
        Color[] values = Color.values();
        String name = Color.RED.name();
        Class<Color> declaringClass = Color.RED.getDeclaringClass();
        int ordinal = Color.RED.ordinal();

        log.error("{}\r\r{}\r\n{}\r\n{}", Arrays.asList(values), name, declaringClass, ordinal);


    }
}