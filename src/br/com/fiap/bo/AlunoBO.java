package br.com.fiap.bo;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.entity.Aluno;
import br.com.fiap.exceptions.IdNotFoundException;
import br.com.fiap.impl.AlunoDAOImpl;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class AlunoBO {

	public void inserir(Aluno aluno){
		 EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		 AlunoDAO dao = new AlunoDAOImpl(em);
		 dao.inserir(aluno);
	}
	
	public List<Aluno> listar(){
		 EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		return new AlunoDAOImpl(em).listar();
	}
	
	public void remover(int codigo) throws IdNotFoundException{
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		 AlunoDAO dao = new AlunoDAOImpl(em);
		 dao.remover(codigo);
	}
	
	public void atualizar(Aluno aluno){
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		 AlunoDAO dao = new AlunoDAOImpl(em);
		 dao.atualizar(aluno);
	}
}
