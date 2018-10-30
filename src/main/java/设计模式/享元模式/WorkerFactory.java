package 设计模式.享元模式;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    private static final Map<String, Worker> WORKER_MAP = new HashMap<>();

    public Worker getworker(String name) {
        Worker worker = WORKER_MAP.get(name);
        if (worker == null) {
            System.out.println("不存在"+name+",创建一个");
            worker = new Worker(name);
            WORKER_MAP.put(name, worker);
        }
        return worker;
    }
}
