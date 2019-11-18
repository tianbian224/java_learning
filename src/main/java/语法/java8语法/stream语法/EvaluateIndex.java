package 语法.java8语法.stream语法;

import lombok.Data;
import lombok.experimental.Accessors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cang.lv
 * @date 2019/11/17 0017 22:33
 */
@Data
@Accessors(chain = true)
public class EvaluateIndex {

    /**
     * 指标字典值:从数据字典中查找到的dict_code
     */
    private Long dictCode;

    /**
     * 指标名称
     */
    private String indexName;

    /**
     * 评分
     */
    private Integer grade;
}