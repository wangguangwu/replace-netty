package io.netty.channel.socket.nio;

import io.netty.channel.Channel;
import io.netty.channel.nio.AbstractNioChannel;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

/**
 * @author wangguangwu
 */
public abstract class AbstractNioByteChannel extends AbstractNioChannel {

    protected AbstractNioByteChannel(Channel parent, SelectableChannel ch) {
        super(parent, ch, SelectionKey.OP_READ);
    }



}
