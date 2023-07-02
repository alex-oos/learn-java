package day7proxy;


/**
 * @ClassName SmsServiceImpl
 * @Description .实现发送短信的接口
 * @Author Alex
 * @Date 2022/6/14 21:15
 * @Version 1.0
 */
public class SmsServiceImpl implements SmsService {

    /**
     * @param message
     * @return
     */
    @Override
    public String send(String message) {
        System.out.println("message = " + message);

        return message;
    }

}
