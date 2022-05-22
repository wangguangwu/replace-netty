package io.netty.channel;

import io.netty.util.concurrent.*;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.SystemPropertyUtil;

import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.function.Consumer;

/**
 * @author wangguangwu
 */
public abstract class SingleThreadEventLoop extends SingleThreadEventExecutor implements EventLoop {

    protected static final int DEFAULT_MAX_PENDING_TASKS = Math.max(16,
            SystemPropertyUtil.getInt("io.netty.eventLoop.maxPendingTasks", Integer.MAX_VALUE));

    private final Queue<Runnable> tailTasks;

    protected SingleThreadEventLoop(EventLoopGroup parent, Executor executor,
                                    boolean addTaskWakesUp, Queue<Runnable> taskQueue, Queue<Runnable> tailTaskQueue,
                                    RejectedExecutionHandler rejectedExecutionHandler) {
        super(parent, executor, addTaskWakesUp, taskQueue, rejectedExecutionHandler);
        tailTasks = ObjectUtil.checkNotNull(tailTaskQueue, "tailTaskQueue");
    }

    @Override
    protected void run() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEach(Consumer<? super EventExecutor> action) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator<EventExecutor> spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public EventLoopGroup parent() {
        return (EventLoopGroup) super.parent();
    }

}
