// package com.springboot.generator;
//
// import com.baomidou.mybatisplus.annotation.IdType;
// import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
// import com.baomidou.mybatisplus.core.toolkit.StringUtils;
// import com.baomidou.mybatisplus.generator.AutoGenerator;
// import com.baomidou.mybatisplus.generator.config.*;
// import com.baomidou.mybatisplus.generator.config.rules.DateType;
// import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//
// import java.util.Scanner;
//
// // 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
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
//     public static void codeGenrator() {
//         // 代码生成器
//         AutoGenerator mpg = new AutoGenerator();
//
//         // 全局配置
//         GlobalConfig gc = new GlobalConfig();
//
// //         需要更换为项目的绝对路径，不然会报错
//         gc.setOutputDir("D:\\code\\IdeaProjects\\aixuexi-qa\\qabasicservice" + "/src/main/java");
//         gc.setAuthor("LiJiang"); // 作者是谁
//         gc.setOpen(false); // 生成后是否打开资源管理器
//         gc.setFileOverride(false); // 重新生成时文件是否覆盖
//         gc.setServiceName("%sService");    // 去掉Service接口的首字母I
//         gc.setIdType(IdType.AUTO); // 主键策略
//         gc.setDateType(DateType.ONLY_DATE);// 定义生成的实体类中日期类型
// //        gc.setSwagger2(true);//开启Swagger2模式
//         mpg.setGlobalConfig(gc);
//
//
//         // 数据源配置
//         DataSourceConfig dsc = new DataSourceConfig();
//         dsc.setUrl("jdbc:mysql://rm-2zek46rw85r9ytzmg.mysql.rds.aliyuncs.com:3306/qabase?useUnicode=true&useSSL=false&characterEncoding=utf8");
//         // dsc.setSchemaName("public");
//         dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//         dsc.setUsername("gsadmin");
//         dsc.setPassword("sRL85u4NcMtvUukhgdO7BcUhKGfh");
//         mpg.setDataSource(dsc);
//
//         // 包配置
//         PackageConfig pc = new PackageConfig();
// //        pc.setModuleName(scanner("模块名"));
//         pc.setParent("com.axxqa.basicService");
//         pc.setController("controller");
//         pc.setEntity("entity");
//         pc.setService("service");
//         pc.setMapper("mapper");
//         mpg.setPackageInfo(pc);
//
//         // 自定义配置
// //        InjectionConfig cfg = new InjectionConfig() {
// //            @Override
// //            public void initMap() {
// //                // to do nothing
// //            }
// //        };
//
//         // 如果模板引擎是 freemarker
//         // String templatePath = "/templates/mapper.xml.ftl";
//         // 如果模板引擎是 velocity
//         // String templatePath = "/templates/mapper.xml.vm";
//
//         // 自定义输出配置
// //        List<FileOutConfig> focList = new ArrayList<>();
// //        // 自定义配置会被优先输出
// //        focList.add(new FileOutConfig(templatePath) {
// //            @Override
// //            public String outputFile(TableInfo tableInfo) {
// //                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
// //                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
// //                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
// //            }
// //        });
//         /*
//         cfg.setFileCreate(new IFileCreate() {
//             @Override
//             public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
//                 // 判断自定义文件夹是否需要创建
//                 checkDir("调用默认方法创建的目录，自定义目录用");
//                 if (fileType == FileType.MAPPER) {
//                     // 已经生成 mapper 文件判断存在，不想重新生成返回 false
//                     return !new File(filePath).exists();
//                 }
//                 // 允许生成模板文件
//                 return true;
//             }
//         });
//         */
//         // cfg.setFileOutConfigList(focList);
//         // mpg.setCfg(cfg);
//
//         // 配置模板
//         TemplateConfig templateConfig = new TemplateConfig();
//
//         // 配置自定义输出模板
//         // 指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
//         // templateConfig.setEntity("templates/entity2.java");
//         // templateConfig.setService();
//         // templateConfig.setController();
//         // 生成xml，则打开这个
//         templateConfig.setXml(null);
// //        如果不想生成contriller 则打开这个
//         templateConfig.setController("");
//         templateConfig.setService("");
//         mpg.setTemplate(templateConfig);
//
//         // 策略配置
//         StrategyConfig strategy = new StrategyConfig();
//         strategy.setNaming(NamingStrategy.underline_to_camel);
//         strategy.setColumnNaming(NamingStrategy.underline_to_camel);
// //        strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
//         strategy.setEntityLombokModel(true); // lombok 模型 @Accessors(chain = true) setter链式操作
//         strategy.setRestControllerStyle(true);  // restful api风格控制器
//         strategy.setControllerMappingHyphenStyle(true); // url中驼峰转连字符
//
//         // 公共父类
// //        strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");
//         // 写于父类中的公共字段
//         strategy.setSuperEntityColumns("id");
//         strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
//         strategy.setControllerMappingHyphenStyle(true);
//         strategy.setTablePrefix(pc.getModuleName() + "_");
//         mpg.setStrategy(strategy);
//         // mpg.setTemplateEngine(new FreemarkerTemplateEngine());
//
//         mpg.execute();
//     }
//
//     public static void main(String[] args) {
//
//         codeGenrator();
//     }
//
// }
