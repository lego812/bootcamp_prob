package org.scoula.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource({"classpath:/application.properties"})
public class RootConfig {
    @Value("${jdbc.driver}")
    String driver;

    @Value("${jdbc.url}")
    String url;

    @Value("${jdbc.username}")
    String username;

    @Value("${jdbc.password}")
    String password;

    //db사용 --> google mybatis사용 설정
    //트랜잭션 설정

    @Bean
    public DataSource dataSource() {
        HikariConfig config=new HikariConfig();

        config.setDriverClassName(driver);
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);

        config.setMaximumPoolSize(20); //db커넥션 최대 20개
        config.setMinimumIdle(1); //최소 유휴 커넥션 최소 1개

        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }
}
