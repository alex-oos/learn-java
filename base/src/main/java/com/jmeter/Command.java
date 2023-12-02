package com.jmeter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <P></p>
 *
 * @author Alex
 * @since 2023/12/2 下午5:58
 */
public class Command {

    // 命令行工具用于使用启动JMeter
    public static void exeCmd(String commandStr) throws IOException {


        System.out.println("JMeter开始执行脚本：");


        System.out.println(commandStr);

        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {


        long startTime = System.currentTimeMillis();
        // 获取所有的脚本名称
        List<String> list = FileUtil.scriptNum(new File("./"));
        FileUtil.createDirectory("./jtl");
        FileUtil.createDirectory("./report");
        String jmx = null;
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("--------------------------------------------------------");
        System.out.println("JMeter开始运行时间是：" + simpleDateFormat.format(date));


        System.out.println("                                                ");
        System.out.println("JMeter本次一共需要执行" + list.size() + "个脚本：");
        for (int i = 0; i < list.size(); i++) {
            jmx = list.get(i);
        /*     for (int j = 1; j < 5; j++) {

            } */
            // 启动JMeter脚本
//            jmeter -JthreadCount=2 -Jcycle=200  jmeter执行的线程数 ，jmeter执行的循环数
            String commandStr = String.format("jmeter.bat -n -t ./scprit/%s.jmx -l ./jtl/%s.jtl  -e -o  ./report/%s", jmx
                    , jmx, jmx);
            System.out.println("第" + (i + 1) + "次开始运行：");
            Command.exeCmd(commandStr);

            long wait = 120000;
            System.out.println("休息" + (wait / 1000) + "秒！");
            Thread.sleep(wait);

        }


        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("JMeter运行结束时间是：" + simpleDateFormat1.format(date1));
        long endTime = System.currentTimeMillis();

        System.out.println("一共运行了" + (endTime - startTime) / 1000 + "s");


    }


}
