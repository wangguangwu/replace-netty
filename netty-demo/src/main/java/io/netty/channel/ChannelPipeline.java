package io.netty.channel;

import io.netty.util.concurrent.EventExecutorGroup;

/**
 * @author wangguangwu
 */
public interface ChannelPipeline {

    ChannelPipeline addLast(ChannelHandler... handlers);

    ChannelPipeline addLast(EventExecutorGroup executor, ChannelHandler... handlers);

    ChannelPipeline addLast(EventExecutorGroup group, String name, ChannelHandler handler);

}
