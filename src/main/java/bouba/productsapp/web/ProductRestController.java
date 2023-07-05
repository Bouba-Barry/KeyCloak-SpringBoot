package bouba.productsapp.web;

import bouba.productsapp.entities.Product;
import bouba.productsapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    @PreAuthorize("hasAuthority('USER')")
    public String protectedMessage(){
        return "hello from the protected backend";
    }


    @GetMapping("/suppliers")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<List<Product>> products(){
        List<Product> productList = productRepository.findAll();
        return new ResponseEntity<>(productList, HttpStatus.valueOf(200));
    }




}
