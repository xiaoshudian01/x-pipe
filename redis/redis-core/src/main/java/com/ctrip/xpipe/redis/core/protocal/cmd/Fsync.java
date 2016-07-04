package com.ctrip.xpipe.redis.core.protocal.cmd;


import com.ctrip.xpipe.api.pool.SimpleObjectPool;
import com.ctrip.xpipe.netty.commands.NettyClient;
import com.ctrip.xpipe.redis.core.protocal.protocal.RequestStringParser;

import io.netty.buffer.ByteBuf;

/**
 * @author marsqing
 *
 *         May 16, 2016 6:46:15 PM
 */
public class Fsync extends AbstractRedisCommand<Object> {

	public Fsync(SimpleObjectPool<NettyClient> clientPool) {
		super(clientPool);
	}

	@Override
	public String getName() {
		return "fsync";
	}

	@Override
	protected ByteBuf getRequest() {
		RequestStringParser requestString = new RequestStringParser(getName());
		return requestString.format();
	}

	@Override
	protected Object format(Object payload) {
		return null;
	}
}