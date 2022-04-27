package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ObjetivosDaSemana")


public class ObjetivosDaSemana {

	@GetMapping
	public String Objetivo() {
		return "Tenho como objetivo aprender mais sobre o spring, trocar mais assuntos com os "
				+ "colegas e desenvolver um banco de dados para o projeto integrador.";
}
}
