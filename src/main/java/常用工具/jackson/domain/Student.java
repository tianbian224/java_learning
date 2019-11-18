package 常用工具.jackson.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.Map;

/**
 * @author cang.lv
 * @date 2019/11/12 0012 22:14
 */
@Data
@Accessors(chain = true)
public class Student {
    private boolean boy;
    private int age;
    private Date birthday;
    private String name;
    /**
     * 枚举
     */
    private Department department;
    private Map<String, Object> params;
}
