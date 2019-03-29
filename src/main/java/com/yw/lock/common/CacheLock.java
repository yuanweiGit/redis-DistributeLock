package com.yw.lock.common;

import java.lang.annotation.*;

/**
 *
 * 功能描述: cachelock是方法级的注解，用于注解会产生并发问题的方法
 *
 * @param:
 * @return:
 * @auther: YW
 * @date: 2019/3/29 9:53
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CacheLock {
    String lockedPrefix() default "";//redis 锁key的前缀
    long timeOut() default 500;//锁时间
    int expireTime() default 10000;//key在redis里存在的时间，1000S
}
