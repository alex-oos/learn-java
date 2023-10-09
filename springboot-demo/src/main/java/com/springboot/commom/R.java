package com.springboot.commom;


import java.io.Serializable;
import java.util.Optional;

/**
 * REST API 返回结果
 *
 * @author Alex
 * @date 2021/9/13 3:05 下午
 * <P></p>
 */


public class R<T> implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 业务错误码
     */
    private long code;

    /**
     * 结果集
     */
    private T data;

    /**
     * 描述
     */
    private String msg;

    public R() {
        // to do nothing
    }

    public R(IErrorCode errorCode) {

        errorCode = Optional.ofNullable(errorCode).orElse(ApiErrorCode.FAILED);
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public static <T> R<T> ok(T data) {

        ApiErrorCode aec = ApiErrorCode.SUCCESS;
        if (data instanceof Boolean && Boolean.FALSE.equals(data)) {
            aec = ApiErrorCode.FAILED;
        }
        return restResult(data, aec);
    }

    public static <T> R<T> failed(String msg) {

        return restResult(null, ApiErrorCode.FAILED.getCode(), msg);
    }

    public static <T> R<T> failed(IErrorCode errorCode) {

        return restResult(null, errorCode);
    }

    public static <T> R<T> restResult(T data, IErrorCode errorCode) {

        return restResult(data, errorCode.getCode(), errorCode.getMsg());
    }

    private static <T> R<T> restResult(T data, long code, String msg) {

        R<T> apiResult = new R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public boolean ok() {

        return ApiErrorCode.SUCCESS.getCode() == code;
    }

    /**
     * 服务间调用非业务正常，异常直接释放
     */
    public T serviceData() {

        if (!ok()) {
            throw new ApiException(this.msg);
        }
        return data;
    }

    public long getCode() {

        return this.code;
    }

    public R<T> setCode(final long code) {

        this.code = code;
        return this;
    }

    public T getData() {

        return this.data;
    }

    public R<T> setData(final T data) {

        this.data = data;
        return this;
    }

    public String getMsg() {

        return this.msg;
    }

    public R<T> setMsg(final String msg) {

        this.msg = msg;
        return this;
    }

    public boolean equals(final Object o) {

        if (o == this) {
            return true;
        } else if (!(o instanceof R)) {
            return false;
        } else {
            R<?> other = (R) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCode() != other.getCode()) {
                return false;
            } else {
                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                Object this$msg = this.getMsg();
                Object other$msg = other.getMsg();
                if (this$msg == null) {
                    return other$msg == null;
                } else return this$msg.equals(other$msg);
            }
        }
    }

    protected boolean canEqual(final Object other) {

        return other instanceof R;
    }

    public int hashCode() {
        // int PRIME = true;
        int result = 1;
        long $code = this.getCode();
        result = result * 59 + (int) ($code >>> 32 ^ $code);
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        Object $msg = this.getMsg();
        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
        return result;
    }

    public String toString() {

        return "R(code=" + this.getCode() + ", data=" + this.getData() + ", msg=" + this.getMsg() + ")";
    }



}
