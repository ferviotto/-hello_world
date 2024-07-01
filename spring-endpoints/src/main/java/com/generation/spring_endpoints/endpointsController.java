package com.generation.spring_endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")

public class endpointsController {
	
	@GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsms")
    public List<String> listBsm() {
        return Arrays.asList(
        	"Trabalho em Equipe",
        	"Orientação ao Detalhe",
        	"Proatividade",
        	"Comunicação",
        	"Orientação ao Futuro",
        	"Responsabilidade Pessoal",
        	"Mentalidade de Crescimento",
            "Persistência"
        );
    }

    @GetMapping("/objetivos")
    public List<String> listObjetivos() {
        return Arrays.asList(
            "Fazer as atividades pendentes",
            "Estudar o cookbook",
            "Aprender mais sobre desenvolvimento web com Java e Spring Boot"
        );
    }
}