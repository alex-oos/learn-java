package demo.other;

import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson2.JSONObject;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.*;

/**
 * <P>
 * <p>
 * 手动编写多线程并发工具，并发操作线程
 * </p>
 *
 * @author Alex
 * @since 2023/11/20 上午10:45
 */
public class PressTestTools {

    public static final ThreadPoolExecutor EXECUTORS = new ThreadPoolExecutor(10, 20, 1L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100), new ThreadPoolExecutor.CallerRunsPolicy());


    public static JSONObject start(String host) {


        String body = "{\n" + "  \"data_version\": \"2023Q2\",\n" + "  \"skill_model\": \"1\",\n" + "  \"sub_task_id\": \"1\",\n" + "  \"task_id\": \"1\",\n" + "  \"isFDS\": true,\n" + "  \"object_name\": \"avp/check/lyc/bj_case\",\n" + "  \"check_name\": \"avp_cp_full_check\"\n" + "}";
        String res = HttpRequest.post(host + "/hdmap/data/validator/start").body(body).execute().body();
        return JSONObject.parseObject(res);

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        String host = "http://localhost:8989";
        String prodHost = "http://prod-datavalidator-hdmap.evad.mioffice.cn";
        // 计算时间
        Instant startTime = Instant.now();
        // 计算出120秒之后的时间
        Instant targetTime = startTime.plus(Duration.ofSeconds(120));
        while (Instant.now().isBefore(targetTime)) {
            CompletableFuture<JSONObject> future = CompletableFuture.supplyAsync(() -> start(host), EXECUTORS).thenApply(
                    (res) -> {
                        System.out.println(res);
                        return res;
                    }
            );
        }

        EXECUTORS.shutdown();
    }

}
