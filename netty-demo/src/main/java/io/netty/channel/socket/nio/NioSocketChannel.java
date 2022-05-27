package io.netty.channel.socket.nio;

import io.netty.channel.Channel;
import io.netty.channel.ChannelPipeline;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import org.jetbrains.annotations.NotNull;

import java.nio.channels.SelectableChannel;
import java.nio.channels.spi.SelectorProvider;

/**
 * @author wangguangwu
 */
public class NioSocketChannel extends AbstractNioByteChannel implements io.netty.channel.socket.SocketChannel {

    private static final SelectorProvider DEFAULT_SELECTOR_PROVIDER = SelectorProvider.provider();

    /**
     * Create a new instance
     */
    public NioSocketChannel() {
        super(null, null);
//        this(DEFAULT_SELECTOR_PROVIDER);
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> Attribute<T> attr(AttributeKey<T> key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> boolean hasAttr(AttributeKey<T> key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(@NotNull Channel o) {
        throw new UnsupportedOperationException();
    }

}
