package io.netty.channel;

import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.EventExecutorGroup;
import io.netty.util.internal.ObjectUtil;

/**
 * @author wangguangwu
 */
public class DefaultChannelPipeline implements ChannelPipeline {

    protected DefaultChannelPipeline(Channel channel) {
    }

    @Override
    public final ChannelPipeline addLast(ChannelHandler... handlers) {
        return addLast(null, handlers);
    }

    @Override
    public final ChannelPipeline addLast(EventExecutorGroup executor, ChannelHandler... handlers) {
        ObjectUtil.checkNotNull(handlers, "handlers");

        for (ChannelHandler h: handlers) {
            if (h == null) {
                break;
            }
            addLast(executor, null, h);
        }

        return this;
    }

    @Override
    public final ChannelPipeline addLast(EventExecutorGroup group, String name, ChannelHandler handler) {
//        final AbstractChannelHandlerContext newCtx;
//        synchronized (this) {
//            checkMultiplicity(handler);
//
//            newCtx = newContext(group, filterName(name, handler), handler);
//
//            addLast0(newCtx);
//
//            // If the registered is false it means that the channel was not registered on an eventLoop yet.
//            // In this case we add the context to the pipeline and add a task that will call
//            // ChannelHandler.handlerAdded(...) once the channel is registered.
//            if (!registered) {
//                newCtx.setAddPending();
//                callHandlerCallbackLater(newCtx, true);
//                return this;
//            }
//
//            EventExecutor executor = newCtx.executor();
//            if (!executor.inEventLoop()) {
//                callHandlerAddedInEventLoop(newCtx, executor);
//                return this;
//            }
//        }
//        callHandlerAdded0(newCtx);
//        return this;
        throw new UnsupportedOperationException();
    }

}
