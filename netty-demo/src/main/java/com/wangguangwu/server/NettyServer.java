package com.wangguangwu.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wangguangwu
 */
@Slf4j
public class NettyServer {

    private static final int PORT = 8080;

    public static void main(String[] args) {
        // 表示监听端口，接收新连接的线程组
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        // 处理每一条连接的数据读写的线程组
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();

        final ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap
                // 配置两个线程组
                .group(bossGroup, workerGroup)
                // 指定服务端的 IO 模型
                .channel(NioServerSocketChannel.class);
//                .option(ChannelOption.SO_BACKLOG, 1024)
//                .childOption(ChannelOption.SO_KEEPALIVE, true)
//                .childOption(ChannelOption.TCP_NODELAY, true);
//                .childHandler(new ChannelInitializer<NioSocketChannel>() {
//                    @Override
//                    protected void initChannel(NioSocketChannel ch) {
//                        ch.pipeline().addLast(new FirstServerHandler());
//                    }
//                });

//        bind(serverBootstrap, PORT);
    }
//
//    private static void bind(ServerBootstrap serverBootstrap, int port) {
//        serverBootstrap.bind(port).addListener(future -> {
//            if (future.isSuccess()) {
//                log.info("port [{}] binding success", port);
//            } else {
//                log.error("port [{}] binding error", port);
//                bind(serverBootstrap, port + 1);
//            }
//        });
//    }

}
