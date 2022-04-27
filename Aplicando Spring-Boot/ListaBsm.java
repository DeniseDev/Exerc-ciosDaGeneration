package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ListaBsm")
public class ListaBsm {
	@GetMapping
	public String hello() {
		return "Essas são as BSM trabalhada pela tia Gen: Persistencia, Orientação ao detalhe, trabalho em equipe!";
				
	}

}
