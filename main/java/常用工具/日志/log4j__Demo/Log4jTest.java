package 常用工具.日志.log4j__Demo;//  Lvcang created at  2018-07-25 23:34,have fun~

import org.apache.log4j.Logger;

/**
 * @author cang.lv
 */
public class Log4jTest
{
    private static final Logger LOGGER = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args)
    {
        LOGGER.warn("第一个警告信息");
        LOGGER.error("错误信息");
        LOGGER.info("通知信息");
        LOGGER.debug("调试信息");
        System.out.println("输出到了文件  控制台  和数据库");
    }

}
