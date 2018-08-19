package 常用工具.日志.slf4j__Demo;//  Lvcang created at  2018-07-26 1:06,have fun~

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cang.lv
 */
public class Slf4jTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    public static void main(String[] args)
    {
        String name = "lvcang";
        String property = "man";
        LOGGER.info("{} is  a good {}", name, property);
    }
}
