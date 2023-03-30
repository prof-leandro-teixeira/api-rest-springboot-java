package com.leandro.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leandro.convertedor.ConverterNumero;
import com.leandro.exceptions.UnsupportedMathOperationException;
import com.leandro.math.Operacoes;

@RestController
public class CalculadoraController {
	
	private Operacoes op = new Operacoes();
	
	@RequestMapping(value = "/soma/{x}/{y}", method=RequestMethod.GET)
	public Double soma(
			@PathVariable(value = "x") String x, 
			@PathVariable(value = "y") String y) throws Exception{
		
		if (!ConverterNumero.isNumeric(x) || !ConverterNumero.isNumeric(y)) {
			throw new UnsupportedMathOperationException("Entre com um valor numérico.");
		}
		return op.soma(ConverterNumero.converteParaNumero(x), ConverterNumero.converteParaNumero(y));
	}
	
	@RequestMapping(value = "/subtracao/{x}/{y}", method=RequestMethod.GET)
	public Double subtracao(
			@PathVariable(value = "x") String x, 
			@PathVariable(value = "y") String y) throws Exception{
		
		if (!ConverterNumero.isNumeric(x) || !ConverterNumero.isNumeric(y)) {
			throw new UnsupportedMathOperationException("Entre com um valor numérico.");
		}
		return op.subtracao(ConverterNumero.converteParaNumero(x), ConverterNumero.converteParaNumero(y));
	}
	
	@RequestMapping(value = "/multiplicacao/{x}/{y}", method=RequestMethod.GET)
	public Double multiplicacao(
			@PathVariable(value = "x") String x, 
			@PathVariable(value = "y") String y) throws Exception{
		
		if (!ConverterNumero.isNumeric(x) || !ConverterNumero.isNumeric(y)) {
			throw new UnsupportedMathOperationException("Entre com um valor numérico.");
		}
		return op.multiplicacao(ConverterNumero.converteParaNumero(x), ConverterNumero.converteParaNumero(y));
	}
	
	@RequestMapping(value = "/divisao/{x}/{y}", method=RequestMethod.GET)
	public Double divisao(
			@PathVariable(value = "x") String x, 
			@PathVariable(value = "y") String y) throws Exception{
		
		if (!ConverterNumero.isNumeric(x) || !ConverterNumero.isNumeric(y)) {
			throw new UnsupportedMathOperationException("Entre com um valor numérico.");
		}
		return op.divisao(ConverterNumero.converteParaNumero(x), ConverterNumero.converteParaNumero(y));
	}
	
	@RequestMapping(value = "/media/{x}/{y}", method=RequestMethod.GET)
	public Double media(
			@PathVariable(value = "x") String x, 
			@PathVariable(value = "y") String y) throws Exception{
		
		if (!ConverterNumero.isNumeric(x) || !ConverterNumero.isNumeric(y)) {
			throw new UnsupportedMathOperationException("Entre com um valor numérico.");
		}
		return op.media(ConverterNumero.converteParaNumero(x), ConverterNumero.converteParaNumero(y));
	}
	
	@RequestMapping(value = "/raizquadrada/{x}", method=RequestMethod.GET)
	public Double raizquadrada(
			@PathVariable(value = "x") String x) throws Exception{
		
		if (!ConverterNumero.isNumeric(x)) {
			throw new UnsupportedMathOperationException("Entre com um valor numérico.");
		}
		return op.raizQuadrada(ConverterNumero.converteParaNumero(x));
	}
}
