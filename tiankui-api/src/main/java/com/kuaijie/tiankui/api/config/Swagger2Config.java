package com.kuaijie.tiankui.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @version 1.0
 * @auther 梁潇宇
 * @date 2023/3/12 3:29
 * @description swagger在线文档配置<br>
 * 启动后可以通过地址http://host:ip/swagger-ui.html 查看在线文档
 */
@Configuration
@EnableSwagger2 // 开启Swagger2自动配置
public class Swagger2Config {
    @Bean
    public Docket UserApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("UserApi") // 分组
                .apiInfo(UserApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kuaijie.tiankui.api"))
                .paths(PathSelectors.ant("/user/**"))
                .build();

    }

    /*
    @Bean
    public Docket BlogApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("BlogApi") // 分组
                .apiInfo(BlogApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kuaijie.tiankui.api.controller"))
                .paths(PathSelectors.ant("/blog/**"))
                .build();
    }
    */

    // 配置用户文档信息
    private ApiInfo UserApiInfo() {
        return new ApiInfoBuilder()
                .title("我的API文档") // 标题
                .description("本文档描述了用户相关的接口定义") // 描述
                .version("1.0") // 版本
                .contact(new Contact("联系人名字", "联系人访问链接", "联系人邮箱")) // 联系人信息
                .build();
    }

    /*
    // 配置博客文档信息
    private ApiInfo BlogApiInfo(){
        return new ApiInfoBuilder()
                .title("我的API文档") // 标题
                .description("本文档描述了博客相关的接口定义") // 描述
                .version("1.0") // 版本
                .contact(new Contact("联系人名字", "联系人访问链接", "联系人邮箱")) // 联系人信息
                .build();
    }
     */

}
