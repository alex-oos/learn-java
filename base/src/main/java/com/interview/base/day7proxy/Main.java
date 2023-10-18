package day7proxy;


/**
 * @ClassName Static
 * @Description 静态代理
 * @Author Alex
 * @since 2022/6/14 21:14
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

        day7proxy.SmsService smsService = new day7proxy.SmsServiceImpl();
        smsService.send("send message");

        day7proxy.SmsProxy smsProxy = new day7proxy.SmsProxy(smsService);
        smsProxy.send("send message ");
    }


}
