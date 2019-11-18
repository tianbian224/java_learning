package 语法.泛型.泛型类;

import java.util.Date;

/**
 * @author cang.lv
 * @date 2019/11/18 0018 23:16
 * 和Apple不同的是，给类型设定了上限
 */
public interface Orange<G extends Comparable> {

    G getGGG();
}


class SmallOrange implements Orange<Date> {

    @Override
    public Date getGGG() {
        return new Date();
    }
}