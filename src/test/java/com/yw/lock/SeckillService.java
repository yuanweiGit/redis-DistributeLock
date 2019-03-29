package com.yw.lock;

import com.yw.lock.common.CacheLock;
import com.yw.lock.common.LockedObject;

/**
 *
 * 功能描述: 秒杀方法
 *
 * @param:
 * @return:
 * @auther: YW
 * @date: 2019/3/29 10:27
 */


public interface SeckillService {
    /**
     * 现在暂时只支持在接口方法上注解.
     * cacheLock注解可能产生并发的方法.
     * 最简单的秒杀方法，参数是用户ID和商品ID。可能有多个线程争抢一个商品，所以商品ID加上LockedObject注解
     */
    @CacheLock(lockedPrefix="TEST_PREFIX")
    public void secKill(String arg1, @LockedObject Long arg2);
}
