package com.leandro.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leandro.Saudacao;

@RestController
public class SaudacaoController {
	
	private final static String template = "Olá, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/saudacao")
	public Saudacao saudacao(@RequestParam(value = "name", defaultValue = "mundo!") String name) {
		return new Saudacao(counter.incrementAndGet(), String.format(template, name));
	}
	

}
