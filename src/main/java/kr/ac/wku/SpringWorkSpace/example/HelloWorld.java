package kr.ac.wku.SpringWorkSpace.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class HelloWorld {
    @GetMapping("/")
    String hello_wordl(){
        return "<h1>Hello!!</h1>";
    }
}
