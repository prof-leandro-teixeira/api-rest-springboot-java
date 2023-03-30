package com.leandro.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.leandro.model.Pessoa;

@Service
public class PessoaServices {
	
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PessoaServices.class.getName());
	
	public List<Pessoa> findAll(){
		logger.info("Buscando todas as pessoas!");
		List<Pessoa> pessoas = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			Pessoa pessoa = mockPessoa(i);
			pessoas.add(pessoa);	
		}
		return pessoas;
	}

	public Pessoa findById(String id) {
		logger.info("Buscando pessoa!");
		Pessoa pessoa =  new Pessoa();
		pessoa.setId(counter.incrementAndGet());
		pessoa.setNome("Leandro");
		pessoa.setEndereco("Endereço atualizado 123");
		pessoa.setGenero("Masculino");
		return pessoa;
	}
	
	public Pessoa create(Pessoa pessoa) {
		logger.info("Criando pessoa!");
		return pessoa;	
	}
	
	public Pessoa update(Pessoa pessoa) {
		logger.info("Alterando pessoa!");
		return pessoa;	
	}
	
	public void delete(String id) {
		logger.info("Excluíndo pessoa!");	
	}
		
	private Pessoa mockPessoa(int i) {
		logger.info("Buscando pessoa!");
		Pessoa pessoa =  new Pessoa();
		pessoa.setId(counter.incrementAndGet());
		pessoa.setNome("Nome: " + i);
		pessoa.setEndereco("Endereço: " + i);
		pessoa.setGenero("Masculino");
		return pessoa;
	}
	
	

}
