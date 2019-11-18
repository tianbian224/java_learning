package 语法.java8语法.stream语法;

import lombok.Data;
import lombok.experimental.Accessors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author cang.lv
 * @date 2019/11/17 0017 22:33
 */
@Data
@Accessors(chain = true)
public class Person {
    private static final Logger log = LoggerFactory.getLogger(Person.class);

    private String name;
    private List<EvaluateIndex> score;
}
