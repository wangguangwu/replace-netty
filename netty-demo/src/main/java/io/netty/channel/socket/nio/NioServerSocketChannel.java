package io.netty.channel.socket.nio;

import io.netty.channel.Channel;
import io.netty.channel.nio.AbstractNioMessageChannel;
import io.netty.channel.socket.InternetProtocolFamily;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.SelectorProvider;

/**
 * @author wangguangwu
 */
public class NioServerSocketChannel extends AbstractNioMessageChannel
        implements io.netty.channel.socket.ServerSocketChannel {

    private static final SelectorProvider DEFAULT_SELECTOR_PROVIDER = SelectorProvider.provider();

    public NioServerSocketChannel() {
        this(DEFAULT_SELECTOR_PROVIDER);
    }

    public NioServerSocketChannel(SelectorProvider provider) {
        this(provider, null);
    }

    /**
     * Create a new instance using the given {@link SelectorProvider} and protocol family (supported only since JDK 15).
     */
    public NioServerSocketChannel(SelectorProvider provider, InternetProtocolFamily family) {
        this(newChannel(provider, family));
    }

    /**
     * Create a new instance using the given {@link ServerSocketChannel}.
     */
    public NioServerSocketChannel(ServerSocketChannel channel) {
        super(null, channel, SelectionKey.OP_ACCEPT);
        throw new UnsupportedOperationException();
//        config = new NioServerSocketChannelConfig(this, javaChannel().socket());
    }

    private static ServerSocketChannel newChannel(SelectorProvider provider, InternetProtocolFamily family) {
//        try {
//            ServerSocketChannel channel =
//                    SelectorProviderUtil.newChannel(OPEN_SERVER_SOCKET_CHANNEL_WITH_FAMILY, provider, family);
//            return channel == null ? provider.openServerSocketChannel() : channel;
//        } catch (IOException e) {
//            throw new ChannelException("Failed to open a socket.", e);
//        }
        throw new UnsupportedOperationException();
    }


    @Override
    public int compareTo(@NotNull Channel o) {
        throw new UnsupportedOperationException();
    }
}
