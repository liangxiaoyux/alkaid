package com.kuaijie.tiankui.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication(scanBasePackages = "com.kuaijie.tiankui")
@EntityScan(basePackages = {"com.kuaijie.tiankui.bean"})
public class TiankuiApiApplication extends SpringBootServletInitializer {
    private static Logger logger = LoggerFactory.getLogger(TiankuiApiApplication.class);
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TiankuiApiApplication.class);
    }

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(TiankuiApiApplication.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        port = port == null ? "8080" : port;

        logger.info("\n----------------------------------------------------------\n\t" +
                "tiankui is running! \n\t" +
                "本地访问地址: " + "\thttp://localhost:" + port + "/\n\t" +
                "外部访问地址: " + "\thttp://" + ip + ":" + port + "/\n\t" +
                "在线文档访问地址: " + "\thttp://" + ip + ":" + port + "/swagger-ui.html\n");
    }

}
