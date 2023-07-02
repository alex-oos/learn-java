package day7proxy;


/**
 * @ClassName Static
 * @Description 静态代理
 * @Author Alex
 * @Date 2022/6/14 21:14
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

        SmsService smsService = new SmsServiceImpl();
        smsService.send("send message");

        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("send message ");
    }


}
