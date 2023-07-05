package bouba.productsapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/products/**") // Spécifiez le mapping de l'API
                .allowedOrigins("http://localhost:3000") // Ajoutez l'origine autorisée de votre frontend ReactJS
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Ajoutez les méthodes HTTP autorisées
                .allowedHeaders("*"); // Autorisez tous les en-têtes
    }
}