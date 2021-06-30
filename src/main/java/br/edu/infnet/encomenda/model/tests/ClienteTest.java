package br.edu.infnet.encomenda.model.tests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClienteTest {
    public static void main(String[] args) {
        SpringApplication.run(ClienteTest.class, args);
        System.out.println("Cliente Teste");
    }
}
