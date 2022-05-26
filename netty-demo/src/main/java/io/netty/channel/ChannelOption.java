package io.netty.channel;

import io.netty.buffer.ByteBufAllocator;
import io.netty.util.AbstractConstant;
import io.netty.util.ConstantPool;

/**
 * @author wangguangwu
 */
public class ChannelOption<T> extends AbstractConstant<ChannelOption<T>> {

    private static final ConstantPool<ChannelOption<Object>> pool = new ConstantPool<ChannelOption<Object>>() {
        @Override
        protected ChannelOption<Object> newConstant(int id, String name) {
            return new ChannelOption<Object>(id, name);
        }
    };

    public static final ChannelOption<ByteBufAllocator> ALLOCATOR = valueOf("ALLOCATOR");
    public static final ChannelOption<Integer> SO_BACKLOG = valueOf("SO_BACKLOG");

    /**
     * Creates a new instance.
     *
     * @param id
     * @param name
     */
    private ChannelOption(int id, String name) {
        super(id, name);
    }


    /**
     * Returns the {@link ChannelOption} of the specified name.
     */
    @SuppressWarnings("unchecked")
    public static <T> ChannelOption<T> valueOf(String name) {
        return (ChannelOption<T>) pool.valueOf(name);
    }

}


///*
// * Copyright 2012 The Netty Project
// *
// * The Netty Project licenses this file to you under the Apache License,
// * version 2.0 (the "License"); you may not use this file except in compliance
// * with the License. You may obtain a copy of the License at:
// *
// *   https://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
// * License for the specific language governing permissions and limitations
// * under the License.
// */
//package io.netty.channel;
//
//import io.netty.buffer.ByteBufAllocator;
//import io.netty.util.AbstractConstant;
//import io.netty.util.ConstantPool;
//import io.netty.util.internal.ObjectUtil;
//
//import java.net.InetAddress;
//import java.net.NetworkInterface;
//
//public class ChannelOption<T> extends AbstractConstant<ChannelOption<T>> {
//
//    private static final ConstantPool<ChannelOption<Object>> pool = new ConstantPool<ChannelOption<Object>>() {
//        @Override
//        protected ChannelOption<Object> newConstant(int id, String name) {
//            return new ChannelOption<Object>(id, name);
//        }
//    };
//
//    /**
//     * Returns the {@link ChannelOption} of the specified name.
//     */
//    @SuppressWarnings("unchecked")
//    public static <T> ChannelOption<T> valueOf(String name) {
//        return (ChannelOption<T>) pool.valueOf(name);
//    }
//
//    public static final ChannelOption<ByteBufAllocator> ALLOCATOR = valueOf("ALLOCATOR");
//
//    public static final ChannelOption<Integer> SO_BACKLOG = valueOf("SO_BACKLOG");
//
//
//    /**
//     * Creates a new {@link ChannelOption} with the specified unique {@code name}.
//     */
//    private ChannelOption(int id, String name) {
//        super(id, name);
//    }
//
//}
