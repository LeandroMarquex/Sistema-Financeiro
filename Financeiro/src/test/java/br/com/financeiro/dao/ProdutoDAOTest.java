package br.com.financeiro.dao;

import java.math.BigDecimal;

import org.junit.Ignore;
import org.junit.Test;

import br.com.financeiro.domain.Fornecedor;
import br.com.financeiro.domain.Produto;

public class ProdutoDAOTest {
	
	@Test
	//@Ignore
	public void salvar(){
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		Fornecedor fornecedor = fornecedorDAO.buscar(new Long("3"));
		
		Produto produto = new Produto();
		produto.setDescricao("Bombom");
		produto.setFornecedor(fornecedor);
		produto.setPreco(new BigDecimal("5.70"));
		produto.setQuantidade(new Short("20"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		
		System.out.println("Produto salvo com sucesso");
	}
}

