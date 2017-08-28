package com.capstone.jmt.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by Jabito on 01/02/2017.
 */

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.capstone.jmt.mapper")
public class AquaJmtConfig {

    private static Logger logger = LoggerFactory.getLogger(AquaJmtConfig.class);

    @Primary
    @Bean
    @ConfigurationProperties(prefix = "aqua.jdbc")
    public DataSource dataSource(){
        logger.info("dataSource");
        return DataSourceBuilder.create().build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        logger.debug("> sqlSessionFactory");

        final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        sqlSessionFactory.setFailFast(true);
        Resource mapperResource = new ClassPathResource("mapper/CustomerMapper.xml");
        Resource mapperResource2 = new ClassPathResource("mapper/ShopMapper.xml");
        Resource mapperResource3 = new ClassPathResource("mapper/OrderMapper.xml");
        sqlSessionFactory.setMapperLocations(new Resource[]{mapperResource,mapperResource2,mapperResource3});

        return sqlSessionFactory.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        logger.debug("> transactionManager");
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
