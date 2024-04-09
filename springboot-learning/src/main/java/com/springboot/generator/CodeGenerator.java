package com.springboot.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Alex
 * @since 2023/10/9 下午7:00
 * <P>
 *  将数据库表，自动生成对应实体类 代码生成器
 * </p>
 */
public class CodeGenerator {


    // 数据库连接配置
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/hd_map_data_validator?useUnicode=true&useSSL=false&characterEncoding=utf8";

    private static final String JDBC_USER_NAME = "root";

    private static final String JDBC_PASSOWRD = "123456";

    // 包名和模块名
    private static final String PACKAGE_NAME = "com.xiaomi";

    // 表名，多个表使用英文逗号分割
    private static final List<String> TBL_NAMES = Arrays.asList("rules_exp", "rules_fk", "rules_logic", "rules_pk", "run_set_rules");

    // 生成代码入口main方法
    public static void main(String[] args) {

        String projectDir = System.getProperty("user.dir");

        FastAutoGenerator.create(JDBC_URL, JDBC_USER_NAME, JDBC_PASSOWRD).globalConfig(builder -> {
                    builder.disableOpenDir().fileOverride() // 覆盖已生成文件
                            .outputDir(projectDir + "/src/main/java"); // 指定输出目录
                }).packageConfig(builder -> {
                    builder.parent(PACKAGE_NAME).entity("entity").mapper("mapper").pathInfo(Collections.singletonMap(OutputFile.xml, projectDir + "/src/main/resources/mapper")); // 设置mapperXml生成路径
                }).strategyConfig(builder -> {
                    builder.addInclude(TBL_NAMES).controllerBuilder();
                }).strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok().naming(NamingStrategy.underline_to_camel).columnNaming(NamingStrategy.underline_to_camel).formatFileName("%sEntity");
                }).strategyConfig(builder -> {
                    builder.mapperBuilder().enableBaseResultMap().enableBaseColumnList().formatXmlFileName("%sMapper").formatMapperFileName("%sMapper");
                }).templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateConfig(builder -> {
                    builder.disable(TemplateType.CONTROLLER, TemplateType.SERVICE, TemplateType.SERVICE_IMPL);
                }) // 禁止 controller service serviceImpl
                .execute();
    }

}
