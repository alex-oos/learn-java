// package com.springboot.utils;
//
//
// import com.baomidou.mybatisplus.annotation.DbType;
// import com.baomidou.mybatisplus.annotation.IdType;
// import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
// import com.baomidou.mybatisplus.generator.AutoGenerator;
// import com.baomidou.mybatisplus.generator.config.*;
// import com.baomidou.mybatisplus.generator.config.rules.DateType;
// import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
// import org.apache.commons.lang3.StringUtils;
//
// import java.util.Scanner;
//
// /**
//  * @author LiJiang
//  * @since 2018/12/13
//  * 代码生成器
//  */
// public class CodeGenerator {
//
//     /**
//      * <p>
//      * 读取控制台内容
//      * </p>
//      */
//     public static String scanner(String tip) {
//
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("请输入" + tip + "：");
//         if (scanner.hasNext()) {
//             String ipt = scanner.next();
//             if (StringUtils.isNotBlank(ipt)) {
//                 return ipt;
//             }
//         }
//         throw new MybatisPlusException("请输入正确的" + tip + "！");
//     }
//
//     public static void run() {
//
//         // 1、创建代码生成器
//         AutoGenerator mpg = new AutoGenerator();
//
//         // 2、全局配置
//         GlobalConfig gc = new GlobalConfig();
//
//         // 项目地址 ,路径为绝对路径
//         gc.setOutputDir("D:\\code\\IdeaProjects\\gitee\\guli\\gui-server\\service\\service_edu" + "/src/main/java");
//
//         gc.setAuthor("LiJiang");
//         gc.setOpen(false); // 生成后是否打开资源管理器
//         gc.setFileOverride(false); // 重新生成时文件是否覆盖
//
//         // UserServie
//         gc.setServiceName("%sService");    // 去掉Service接口的首字母I
//
//         gc.setIdType(IdType.ID_WORKER_STR); // 主键策略
//         gc.setDateType(DateType.ONLY_DATE);// 定义生成的实体类中日期类型
//         gc.setSwagger2(true);// 开启Swagger2模式
//
//         mpg.setGlobalConfig(gc);
//
//         // 3、数据源配置
//         DataSourceConfig dsc = new DataSourceConfig();
//         dsc.setUrl("jdbc:mysql://39.96.49.72:3306/guli?serverTimezone=GMT%2B8");
//         dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//         dsc.setUsername("root");
//         dsc.setPassword("Test@123456");
//         dsc.setDbType(DbType.MYSQL);
//         mpg.setDataSource(dsc);
//
//         // 4、包配置
//         PackageConfig pc = new PackageConfig();
//         // 包  com.atguigu.eduservice
//         pc.setParent("com.atguigu");
//         pc.setModuleName("eduservice"); // 模块名
//         // 包  com.atguigu.eduservice.controller
//         pc.setController("controller");
//         pc.setEntity("entity");
//         pc.setService("service");
//         pc.setMapper("mapper");
//         mpg.setPackageInfo(pc);
//
//
//         // 5、配置模板
//         TemplateConfig templateConfig = new TemplateConfig();
//
//         // 配置自定义输出模板
//         // 指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
//         // templateConfig.setEntity("templates/entity2.java");
//         // templateConfig.setService();
//         // 不想生成xml，则打开这个
//         templateConfig.setXml(null);
// //        如果不想生成contriller 则打开这个
// //        templateConfig.setController("");
//         mpg.setTemplate(templateConfig);
//
//         // 6、策略配置
//         StrategyConfig strategy = new StrategyConfig();
//         // 需要的表
//         strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
//
//         strategy.setNaming(NamingStrategy.underline_to_camel);// 数据库表映射到实体的命名策略
//         strategy.setTablePrefix(pc.getModuleName() + "_"); // 生成实体时去掉表前缀
//
//         strategy.setColumnNaming(NamingStrategy.underline_to_camel);// 数据库表字段映射到实体的命名策略
//         strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作
//
//         strategy.setRestControllerStyle(true); // restful api风格控制器
//         strategy.setControllerMappingHyphenStyle(true); // url中驼峰转连字符
//
//         mpg.setStrategy(strategy);
//
//
//         // 7、执行
//         mpg.execute();
//     }
//
//
//     public static void main(String[] args) {
//
//         run();
//     }
//
// }
