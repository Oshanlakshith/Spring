package lk.ijse.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "lk.ijse.spring.repo")
@EnableTransactionManagement
@PropertySource("classpath:application.propertiies")
public class JPAConfig {

    @Autowired
    Environment environment;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource ds, JpaVendorAdapter va){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setJpaVendorAdapter(va);
        bean.setDataSource(ds);
        bean.setPackagesToScan(environment.getRequiredProperty("package.name"));
        return bean;
    }
    public DataSource dataSource(){

    }

}
