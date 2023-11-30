package com.springboot.commom;


/**
 * @author Alex
 * @since 2021/9/13 3:07 下午
 * <P></p>
 */

public interface IErrorCode {

    /**
     * 错误编码 -1、失败 0、成功
     */
    long getCode();

    /**
     * 错误描述
     */
    String getMsg();

}
