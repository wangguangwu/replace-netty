package io.netty.channel;

import io.netty.util.AttributeMap;

/**
 * @author wangguangwu
 */
public interface Channel extends AttributeMap, ChannelOutboundInvoker, Comparable<Channel> {

    /**
     * Return the assigned {@link ChannelPipeline}.
     */
    ChannelPipeline pipeline();

}
