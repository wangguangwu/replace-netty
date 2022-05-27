package io.netty.channel.nio;

import io.netty.channel.Channel;

import java.nio.channels.SelectableChannel;

/**
 * @author wangguangwu
 */
public abstract class AbstractNioMessageChannel extends AbstractNioChannel{

    /**
     * @see AbstractNioChannel#AbstractNioChannel(Channel, SelectableChannel, int)
     */
    protected AbstractNioMessageChannel(Channel parent, SelectableChannel ch, int readInterestOp) {
        super(parent, ch, readInterestOp);
    }

}
