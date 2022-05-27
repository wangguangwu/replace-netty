package io.netty.channel;

/**
 * @author wangguangwu
 */
public abstract class ChannelInitializer<C extends Channel> extends ChannelInboundHandlerAdapter {

    protected abstract void initChannel(C ch) throws Exception;

}
