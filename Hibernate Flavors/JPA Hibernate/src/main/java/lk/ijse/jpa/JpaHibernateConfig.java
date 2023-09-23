package lk.ijse.jpa;

import lk.ijse.employeeData.repository.EmployeeRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/2/2023
 * Time : 4:01 PM
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = {EmployeeRepo.class})
//@PropertySource("classpath:application.properties")
public class JpaHibernateConfig {

//    public final Environment env;
//
//    public JpaHibernateConfig(Environment env) {
//        this.env = env;
//    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter jpa) {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setPackagesToScan("lk.ijse.employeeData.entity");
        bean.setDataSource(ds);
        bean.setJpaVendorAdapter(jpa);
        return bean;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost/employeeData?createDatabaseIfNotExist=true");
        ds.setUsername("root");
        ds.setPassword("Shamodha@27");
        return ds;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
        va.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        va.setDatabase(Database.MYSQL);
        va.setGenerateDdl(true);
        va.setShowSql(true);
        return va;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
//    // 1. factory create
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource,JpaVendorAdapter jva) {
//        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
//        bean.setPackagesToScan("lk.ijse.employeeData.entity");
//        bean.setDataSource(dataSource);
//        bean.setJpaVendorAdapter(jva);
////        bean.setJpaPropertyMap(hibernateConfigs());
//        return bean;
//    }
//
////    private Map<String, String> hibernateConfigs() {
////        Map<String, String> map = new HashMap<>();
////        map.put("spring.jpa.hibernate.ddl-auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
////        map.put("spring.jpa.show-sql", env.getProperty("spring.jpa.show-sql"));
////        map.put("spring.jpa.properties.hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
////        map.put("spring.jpa.properties.hibernate.format_sql", env.getProperty("spring.jpa.properties.hibernate.format_sql"));
////        return map;
////    }
//
//    // 2. data source create
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setDriverClassName(env.getProperty("spring.datasource.driver_class"));
//        ds.setUrl(env.getProperty("spring.datasource.url"));
//        ds.setUsername(env.getProperty("spring.datasource.username"));
//        ds.setPassword(env.getProperty("spring.datasource.password"));
//        return ds;
//    }
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter(){
//        HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
//        va.setDatabasePlatform(env.getProperty("spring.jpa.properties.hibernate.dialect"));
//        va.setDatabase(Database.MYSQL);
//        va.setGenerateDdl(true);
//        va.setShowSql(true);
//        return va;
//    }
//
//    // 3. For handle transaction
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
////        transactionManager.setEntityManagerFactory(emf.getObject());
//        return new JpaTransactionManager(emf);
//    }
}
