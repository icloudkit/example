package net.cloudkit.ecosystem.application;

import net.cloudkit.ecosystem.domain.model.user.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Arrays;

@Configuration
@EntityScan("net.cloudkit.ecosystem.domain.model")
@ComponentScan(basePackages = "net.cloudkit.ecosystem")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "net.cloudkit.ecosystem.domain")
@EnableTransactionManagement
@SpringBootApplication
public class CloudKitEcosystemApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CloudKitEcosystemApplication.class, args);
        UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
        userRepository.findAll();
        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}
}
