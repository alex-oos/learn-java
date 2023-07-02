package day7proxy;


/**
 * @ClassName SmsProxy
 * @Description 创建一个代理类
 * @Author Alex
 * @Date 2022/6/14 21:17
 * @Version 1.0
 */
public class SmsProxy implements SmsService {

    private final SmsService smsService;
    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }


    /**
     * @param message
     * @return
     */
    @Override
    public String send(String message) {

        System.out.println(" send before ");
        smsService.send(" sending ");
        System.out.println(" send end ");
        return null;
    }

}
