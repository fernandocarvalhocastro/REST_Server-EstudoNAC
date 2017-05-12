package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.exceptions.CommitException;
import br.com.fiap.exceptions.IdNotFoundException;

public interface GenericDAO<T,K>{
	
	void inserir(T entidade);
	void atualizar(T entidade);
	void remover(K id) throws IdNotFoundException;
	T buscar(K id);
	List<T> listar();
	void salvar() throws CommitException;
}
