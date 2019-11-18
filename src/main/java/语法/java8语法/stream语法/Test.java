package 语法.java8语法.stream语法;//  Lvcang created at  2018-08-20 0:43,have fun~

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author cang.lv
 */
public class Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {

        Map<String, Double> commodityCollect = getPersons().stream().flatMap(b -> b.getScore().stream())
                .collect(Collectors.groupingBy(EvaluateIndex::getIndexName, Collectors.averagingInt(EvaluateIndex::getGrade)));
        System.out.println(commodityCollect);

        System.out.println("====================================");
        Map<String, Double> collect = getScore().stream().collect(Collectors.groupingBy(EvaluateIndex::getIndexName, Collectors.averagingInt(EvaluateIndex::getGrade)));
        System.out.println(collect);
    }

    public static List<Person> getPersons() {
        ArrayList<Person> personArrayList = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            ArrayList<EvaluateIndex> sscores = Lists.newArrayList();
            for (int j = 0; j < 3; j++) {
                sscores.add(new EvaluateIndex().setDictCode(100L ).setGrade(j+8).setIndexName("指数" + j));

            }
            personArrayList.add(new Person().setName("名字" + i).setScore(sscores));
        }

        return personArrayList;

    }

    public static List<EvaluateIndex> getScore() {
            ArrayList<EvaluateIndex> sscores = Lists.newArrayList();
            for (int j = 0; j < 3; j++) {
                sscores.add(new EvaluateIndex().setDictCode(100L ).setGrade(j+8).setIndexName("指数" + j));

            }

        return sscores;

    }
}

