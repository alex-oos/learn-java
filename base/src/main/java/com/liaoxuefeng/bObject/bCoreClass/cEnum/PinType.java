package com.liaoxuefeng.bObject.bCoreClass.cEnum;

/**
 * @author LiJiang
 * @since 2021/6/28 15:48
 */
public enum PinType {

    REGISTER(10000, "注册并使用"),
    FORGET_PASSWORD(100001, "忘记密码使用"),
    UPDATE_PHONE_NUMBER(100002, "更新手机号码使用");


    private final int code;

    private final String message;

    PinType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "PinType{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }

    public static void main(String[] args) {
        int code = REGISTER.code;
        System.out.println("code = " + code);
    }
}
