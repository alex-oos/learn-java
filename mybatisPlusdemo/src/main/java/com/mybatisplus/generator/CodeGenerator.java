package com.mybatisplus.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;
import java.util.List;

/**
 * @author lijiang
 * @since 2023/10/9 下午7:00
 * <P>
 * 代码生成器
 * </p>
 */
public class CodeGenerator {

    // 数据库连接配置 z
    private static final String JDBC_URL = "jdbc:h2:mem:test";

    // mysql 配置
    // private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/hd_map_data_validator?useUnicode=true&useSSL=false&characterEncoding=utf8";
    private static final String JDBC_USER_NAME = "root";

    private static final String JDBC_PASSOWRD = "test";

    // 包名和模块名
    private static final String PACKAGE_NAME = "com.baomidou.mybatisplus";

    // 表名，多个表使用英文逗号分割
    private static final List<String> TBL_NAMES = Collections.singletonList("sys_user");

    public static void function() {

        String projectDir = System.getProperty("user.dir");
        FastAutoGenerator.create(JDBC_URL, JDBC_USER_NAME, JDBC_PASSOWRD).globalConfig(builder -> {
                    builder.author("alex") // 设置作者
                            // .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(projectDir + "/src/main/java"); // 指定输出目录
                }).dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                })).packageConfig(builder -> {
                    builder.parent(PACKAGE_NAME) // 设置父包名
                            // .moduleName("system") // 设置父包模块名
                            .entity("entity")
                            .mapper("mapper")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, projectDir + "/src/main/resources/mapper")); // 设置mapperXml生成路径
                }).strategyConfig(builder -> {
                    builder.addInclude(TBL_NAMES) // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                }).templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

    public static void main(String[] args) {

        function();

    }

}
