package br.com.financeiro.dao;



import org.junit.Ignore;
import org.junit.Test;

import br.com.financeiro.domain.Fornecedor;


public class FornecedorDAOTest {
	
	@Test
	//@Ignore
	public void salvar() {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setDescricao("Ouro Branco");

		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		fornecedorDAO.salvar(fornecedor);
	}
}

