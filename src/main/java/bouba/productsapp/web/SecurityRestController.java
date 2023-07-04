package bouba.productsapp.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/logout")
public class SecurityRestController {
    @GetMapping("/")
    public ResponseEntity<String> logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return new ResponseEntity<>("DONE", HttpStatus.valueOf(200));
    }
}
