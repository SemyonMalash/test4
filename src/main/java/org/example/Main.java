package org.example;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.SQLException;

@SpringBootApplication
@EntityScan
public class Main {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(Main.class, args);

        Console.main(args);
    }
}
