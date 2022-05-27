package io.netty.channel.nio;

import io.netty.channel.AbstractChannel;
import io.netty.channel.Channel;

import java.io.IOException;
import java.nio.channels.SelectableChannel;

/**
 * @author wangguangwu
 */
public abstract class AbstractNioChannel extends AbstractChannel {

    protected AbstractNioChannel(Channel parent, SelectableChannel ch, int readInterestOp) {
        super(parent);
//        this.ch = ch;
//        this.readInterestOp = readInterestOp;
//        try {
//            ch.configureBlocking(false);
//        } catch (IOException e) {
//            try {
//                ch.close();
//            } catch (IOException e2) {
//                logger.warn(
//                        "Failed to close a partially initialized socket.", e2);
//            }
//
//            throw new ChannelException("Failed to enter non-blocking mode.", e);
//        }
    }

}
