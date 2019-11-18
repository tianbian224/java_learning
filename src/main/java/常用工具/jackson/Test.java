package 常用工具.jackson;

import com.google.common.collect.ImmutableMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import 常用工具.jackson.domain.Department;
import 常用工具.jackson.domain.Student;

import java.util.Date;

/**
 * @author cang.lv
 * @date 2019/11/12 0012 22:22
 */
public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);


    @org.junit.Test
    public void test() {
        Student student = buildStudent();
        String encode = JsonUtilA.encode(student);
        log.info(encode);

        // 反序列化
        Student decode = JsonUtilA.decode(encode, Student.class);
        log.info("{}", decode);



    }

    public Student buildStudent() {

        return new Student().setAge(12).setBirthday(new Date())
                .setBoy(true).setDepartment(Department.english)
                .setName("晓梅").setParams(ImmutableMap.of("a", "A", "b", new Date()));
    }
}
