package com.example.springlektion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringLektionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLektionApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam (value = "name" , defaultValue = "World") String name) {
        return String.format("Hello " + name);
    }

    @GetMapping("/")
    public int number(){
        return 1;
    }

    @GetMapping("/products")
    public String products(){

        return "Här visas snart en lista av produkter";
    }

    @GetMapping("/products/{id}")
    public String productsId(@PathVariable Integer id){
        return ("här visas snart produkt: " + id);
    }

}
