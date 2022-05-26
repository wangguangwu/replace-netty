package io.netty.channel.socket.nio;

import io.netty.channel.Channel;
import io.netty.channel.nio.AbstractNioMessageChannel;
import org.jetbrains.annotations.NotNull;

import java.nio.channels.ServerSocketChannel;

/**
 * @author wangguangwu
 */
public class NioServerSocketChannel extends AbstractNioMessageChannel
        implements io.netty.channel.socket.ServerSocketChannel {

    public NioServerSocketChannel() {
        throw new UnsupportedOperationException();
    }

    public NioServerSocketChannel(ServerSocketChannel channel) {
//        super(null, channel, SelectionKey.OP_ACCEPT);
//        config = new NioServerSocketChannelConfig(this, javaChannel().socket());
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(@NotNull Channel o) {
        throw new UnsupportedOperationException();
    }
}
