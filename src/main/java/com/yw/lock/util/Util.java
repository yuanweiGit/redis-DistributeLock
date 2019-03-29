package com.yw.lock.util;

import com.alibaba.fastjson.JSON;

/**
 * @Auther: YW
 * @Date: 2019/3/29 10:08
 * @Description:
 */
public class Util {

    public static  String beanToJson(Object o){
        return JSON.toJSONString(o);
    }
    //parse an object from
    public static <T> T jsonToBean(String json,Class<T> cls){
        return JSON.parseObject(json, cls);
    }
}
