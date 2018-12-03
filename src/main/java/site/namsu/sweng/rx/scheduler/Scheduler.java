package site.namsu.sweng.rx.scheduler;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @Author : Hyunwoong
 * @When : 2018-11-30 오후 1:29
 * @Homepage : https://github.com/gusdnd852
 */
public class Scheduler {
    private static final Executor backgroundThreadPool = Executors.newCachedThreadPool();
    private static final Executor mainThread = Runnable::run;

    public static Executor background() {
        return backgroundThreadPool;
    }

    public static Executor main() {
        return mainThread;
    }
}
