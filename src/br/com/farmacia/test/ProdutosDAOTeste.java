package br.com.farmacia.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.farmacia.DAO.FornecedoresDAO;
import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;
import br.com.farmacia.factory.ConexaoFactory;

public class ProdutosDAOTeste {

	@Test
	@Ignore
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
	@Test
	public void listar()throws SQLException{
		
		ProdutoDAO fdao = new ProdutoDAO();
		ArrayList<Produtos> lista = fdao.listar();
		
	}
	
	

}
