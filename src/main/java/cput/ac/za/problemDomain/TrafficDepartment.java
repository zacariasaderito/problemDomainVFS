package cput.ac.za.problemDomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages = "cput.ac.za.problemDomain.repository")
@SpringBootApplication
public class TrafficDepartment {

    public static void main(String[] args) {
         SpringApplication.run(TrafficDepartment.class, args);
    }

}
