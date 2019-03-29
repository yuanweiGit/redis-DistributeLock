package com.yw.lock.common;

import java.lang.annotation.*;

/**
 * 功能描述: LockedComplexObject也是参数级的注解，用于注解自定义类型的参数
 *
 * @param:
 * @return:
 * @auther: YW
 * @date: 2019/3/29 9:55
 */

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LockedComplexObject {
    String field() default "";//含有成员变量的复杂对象中需要加锁的成员变量，如一个商品对象的商品ID
}
