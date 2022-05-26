package io.netty.bootstrap;

import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.util.internal.ObjectUtil;


/**
 * @author wangguangwu
 */
public abstract class AbstractBootstrap <B extends AbstractBootstrap<B, C>, C extends Channel> implements Cloneable{

    volatile EventLoopGroup group;


    AbstractBootstrap() {
        // Disallow extending from a different package.
    }

    AbstractBootstrap(AbstractBootstrap<B, C> bootstrap) {
        group = bootstrap.group;
//        channelFactory = bootstrap.channelFactory;
//        handler = bootstrap.handler;
//        localAddress = bootstrap.localAddress;
//        synchronized (bootstrap.options) {
//            options.putAll(bootstrap.options);
//        }
//        attrs.putAll(bootstrap.attrs);
    }

    public B group(EventLoopGroup group) {
        ObjectUtil.checkNotNull(group, "group");
        if (this.group != null) {
            throw new IllegalStateException("group set already");
        }
        this.group = group;
        return self();
    }

    @SuppressWarnings("unchecked")
    private B self() {
        return (B) this;
    }

    /**
     * The {@link Class} which is used to create {@link Channel} instances from.
     * You either use this or {@link #channelFactory(io.netty.channel.ChannelFactory)} if your
     * {@link Channel} implementation has no no-args constructor.
     */
    public B channel(Class<? extends C> channelClass) {
//        return channelFactory(new ReflectiveChannelFactory<C>(
//                ObjectUtil.checkNotNull(channelClass, "channelClass")
//        ));
        return null;
    }

}
