package bouba.productsapp;

import bouba.productsapp.entities.Product;
import bouba.productsapp.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsAppApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"Computer",7600,34));
            productRepository.save(new Product(null,"Printer",1600,134));
            productRepository.save(new Product(null,"Smartphone",1600,34));
            productRepository.save(new Product(null, "Laptop", 9500, 20));
            productRepository.save(new Product(null, "Headphones", 300, 50));
            productRepository.save(new Product(null, "Camera", 4500, 15));


        };
    }

}
