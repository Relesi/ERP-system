package br.com.farmacia.test;

import java.sql.SQLException;

import org.junit.Test;

import br.com.farmacia.DAO.FornecedoresDAO;
import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;

public class ProdutosDAOTeste {

	@Test
	public void salvar()throws SQLException{

		Produtos p1 = new Produtos();
		p1.setDescricao("Tandrilax");	
		p1.setPreco(3.0);
		p1.setQuantidade(10L);
		
		Fornecedores f = new Fornecedores();
		f.setCodigo(12);
		p1.setFornecedores(f);
		

	
		ProdutoDAO fdao = new ProdutoDAO();
		fdao.salvar(p1);

		
	}
}
