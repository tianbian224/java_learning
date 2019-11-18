package 常用工具.jackson.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author cang.lv
 * @date 2019/11/12 0012 22:17
 */

@Data
@Accessors(chain = true)
public class Teacher {

    private List<Student> students;
}
