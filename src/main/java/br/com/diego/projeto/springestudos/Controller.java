package br.com.diego.projeto.springestudos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/BemVindo")
    public String olaSping(){
        return "Ola minha primeira intereção com spring ";
    }
}
