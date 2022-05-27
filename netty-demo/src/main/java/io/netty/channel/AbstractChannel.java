package io.netty.channel;

import io.netty.util.DefaultAttributeMap;

/**
 * @author wangguangwu
 */
public abstract class AbstractChannel extends DefaultAttributeMap implements Channel {

    private final DefaultChannelPipeline pipeline;

    /**
     * Creates a new instance.
     *
     * @param parent
     *        the parent of this channel. {@code null} if there's no parent.
     */
    protected AbstractChannel(Channel parent) {
        pipeline = newChannelPipeline();
    }


    @Override
    public ChannelPipeline pipeline() {
        return pipeline;
    }

    /**
     * Returns a new {@link DefaultChannelPipeline} instance.
     */
    protected DefaultChannelPipeline newChannelPipeline() {
        return new DefaultChannelPipeline(this);
    }

}
