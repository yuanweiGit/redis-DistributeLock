package com.yw.lock.common;

import java.lang.annotation.*;




/**
 *
 * 功能描述: lockedObject是参数级的注解，用于注解商品ID等基本类型的参数
 *
 * @param:
 * @return:
 * @auther: YW
 * @date: 2019/3/29 9:54
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LockedObject {

}
