package br.com.financeiro.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

// http://localhost:8082/Financeiro/rest/financeiro
@Path("financeiro")
public class FinanceiroService {
	@GET
	public String exibir(){
		return "Cursos de Hugo Vasconcelos";
	}
}
