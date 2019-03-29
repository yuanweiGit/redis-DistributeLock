package com.yw.lock.common;

/**
 *
 * 功能描述: 定义线程信息
 *
 * @param:
 * @return:
 * @auther: YW
 * @date: 2019/3/29 10:26
 */
public class CacheLockException extends Throwable{
	private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CacheLockException(String msg) {
        this.msg = msg;
    }

    public CacheLockException() {
    }

}
