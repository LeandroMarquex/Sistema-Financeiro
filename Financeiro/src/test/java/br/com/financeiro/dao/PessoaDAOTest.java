package br.com.financeiro.dao;




import org.junit.Test;

import br.com.financeiro.domain.Cidade;
import br.com.financeiro.domain.Pessoa;


public class PessoaDAOTest {
	
	@Test
	//@Ignore
	public void salvar() {
		CidadeDAO cidadeDao = new CidadeDAO();
		Cidade cidade = cidadeDao.buscar(new Long("3"));
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Carlos Serra");
		pessoa.setCpf("444.791.379-63");
		pessoa.setRg("7 748.597-9");
		pessoa.setRua("Rua Urai");
		pessoa.setNumero(new Short("300"));
		pessoa.setBairro("Santa clara");
		pessoa.setCep("87.065-000");
		pessoa.setComplemento("Bloco W, AP903");
		pessoa.setCidade(cidade);
		pessoa.setTelefone("+55 99 95025-5818");
		pessoa.setCelular("+55 99 89603-5279");
		pessoa.setEmail("carlos@gmailcom");
		PessoaDAO PessoaDAO = new PessoaDAO();
		PessoaDAO.salvar(pessoa);
	}
}

